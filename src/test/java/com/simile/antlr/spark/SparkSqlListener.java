package com.simile.antlr.spark;

import java.util.ArrayList;
import java.util.List;

import com.simile.plan.antlr.spark.SparkSqlBaseListener;
import com.simile.plan.antlr.spark.SparkSqlParser;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @Author yitao
 * @Created 2022/06/08
 */
public class SparkSqlListener extends SparkSqlBaseListener {
    private List<TableView> tableViews = new ArrayList<>();
    private List<TableView> views = new ArrayList<>();

    @Override
    public void enterCreateTempViewUsing(SparkSqlParser.CreateTempViewUsingContext ctx) {
        super.enterCreateTempViewUsing(ctx);
    }

    @Override
    public void enterCreateView(SparkSqlParser.CreateViewContext ctx) {
        super.enterCreateView(ctx);
        String viewName = null;
        List<Field> fields = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree item = ctx.getChild(i);
            if (item instanceof SparkSqlParser.TableIdentifierContext) {
                viewName = item.getText();
            }
            if (item instanceof SparkSqlParser.QueryContext) {
                SparkSqlParser.NamedExpressionSeqContext seqCtx = seekSeqContext(item);
                fields.addAll(parseQueryFields(seqCtx));
            }
        }
        if (viewName != null && !fields.isEmpty()) {
            views.add(new TableView(viewName, null, fields));
        }
    }

    private SparkSqlParser.NamedExpressionSeqContext seekSeqContext(ParseTree item) {
        if (item instanceof SparkSqlParser.NamedExpressionSeqContext) {
            return (SparkSqlParser.NamedExpressionSeqContext) item;
        }
        for (int i = 0; i < item.getChildCount(); i++) {
            if (item.getChild(i) instanceof SparkSqlParser.NamedExpressionSeqContext) {
                return (SparkSqlParser.NamedExpressionSeqContext) item.getChild(i);
            }
            SparkSqlParser.NamedExpressionSeqContext res = seekSeqContext(item.getChild(i));
            if (res != null) {
                return res;
            }
        }
        return null;
    }

    @Override
    public void enterQuery(SparkSqlParser.QueryContext ctx) {
//            super.enterQuery(ctx);
//            System.out.println(ctx.getText());
    }

    @Override
    public void enterQuerySpecification(SparkSqlParser.QuerySpecificationContext ctx) {
        super.enterQuerySpecification(ctx);
//            System.out.println(ctx.getText());
        String fromTableName = null;
        String tableAlias = null;
        List<Field> fields = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree item = ctx.getChild(i);
//                if (item instanceof TerminalNodeImpl && "select".equals(item.getText())) {
//                    //无用
//                }
            if (item instanceof SparkSqlParser.FromClauseContext) {
                ParseTree itemChild = item.getChild(1).getChild(0);
                if (itemChild instanceof SparkSqlParser.AliasedQueryContext) {
                    tableAlias = itemChild.getChild(itemChild.getChildCount() - 1).getText();
                } else if (itemChild instanceof SparkSqlParser.TableNameContext) {
                    fromTableName = itemChild.getChild(0).getText();
                    if (itemChild.getChild(1).getChildCount() > 0) {
                        tableAlias = ((SparkSqlParser.TableAliasContext) itemChild.getChild(1)).getStop().getText();
                    }
                }
            }
            if (item instanceof SparkSqlParser.NamedExpressionSeqContext) {
                fields.addAll(parseQueryFields((SparkSqlParser.NamedExpressionSeqContext) item));
            }
        }
        tableViews.add(new TableView(fromTableName, tableAlias, fields));
    }

    private List<Field> parseQueryFields(SparkSqlParser.NamedExpressionSeqContext item) {
        List<Field> fields = new ArrayList<>();
        if (item == null) {
            return fields;
        }
        for (int ci = 0; ci < item.getChildCount(); ci++) {
            ParseTree itemChild = item.getChild(ci);
            if (itemChild instanceof SparkSqlParser.NamedExpressionContext) {
                List<String> originFieldNames = new ArrayList<>();
                String fieldName = null;
                String value = null;
                if (itemChild.getChildCount() == 1 && itemChild.getChild(0) instanceof SparkSqlParser.ExpressionContext) {
                    //select name1 from ...
                    fieldName = itemChild.getChild(0).getText();
                    originFieldNames.add(fieldName);
                }
                if (itemChild.getChildCount() == 2) {
                    //select name1 name from ...
                    if (itemChild.getChild(0) instanceof SparkSqlParser.ExpressionContext) {
                        originFieldNames.addAll(lookupOriginFieldNames(itemChild.getChild(0)));
                    }
                    if (itemChild.getChild(1) instanceof SparkSqlParser.IdentifierContext) {
                        fieldName = itemChild.getChild(1).getText();
                    }
                }
                if (itemChild.getChildCount() == 3) {
                    //select name1 as name from ...
                    //select func(name1,name2,...) as name from ...
                    if (itemChild.getChild(0) instanceof SparkSqlParser.ExpressionContext) {
                        List<String> oriFieldNames = lookupOriginFieldNames(itemChild.getChild(0));
                        if (oriFieldNames.isEmpty()) {
                            value = itemChild.getChild(0).getText();
                        }
                        originFieldNames.addAll(oriFieldNames);
                    }
                    if (itemChild.getChild(2) instanceof SparkSqlParser.IdentifierContext) {
                        fieldName = itemChild.getChild(2).getText();
                    }
                }
                if (fieldName != null) {
                    Field field = new Field(originFieldNames, fieldName, value);
                    fields.add(field);
                }
            }
        }
        return fields;
    }

    private String getTableName(ParseTree item) {
        if (item == null) {
            return null;
        }
        if (item instanceof SparkSqlParser.TableIdentifierContext) {
            return item.getText();
        }
        for (int i = 0; i < item.getChildCount(); i++) {
            String v = getTableName(item.getChild(i));
            if (v != null) {
                return v;
            }
        }
        return null;
    }

    private String getTableAlias(ParseTree item) {
        if (item == null) {
            return null;
        }
        if (item instanceof SparkSqlParser.TableAliasContext) {
            return item.getText();
        }
        for (int i = 0; i < item.getChildCount(); i++) {
            String v = getTableAlias(item.getChild(i));
            if (v != null) {
                return v;
            }
        }
        return null;
    }


    public List<TableView> getTableViews() {
        return tableViews;
    }

    public List<TableView> getViews() {
        return views;
    }

    private List<String> lookupOriginFieldNames(ParseTree ctx) {
        List<String> result = new ArrayList<>();
        if (ctx == null || ctx.getChildCount() == 0) {
            return result;
        }
        if (ctx instanceof SparkSqlParser.ColumnReferenceContext) {
            result.add(ctx.getText());
            return result;
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            result.addAll(lookupOriginFieldNames(ctx.getChild(i)));
        }
        return result;
    }
//
//        @Override
//        public void enterQueryOrganization(SparkSqlParser.QueryOrganizationContext ctx) {
//            super.enterQueryOrganization(ctx);
//        }
//
//        @Override
//        public void enterFromClause(SparkSqlParser.FromClauseContext ctx) {
//            super.enterFromClause(ctx);
//        }
}
