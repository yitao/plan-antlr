package com.simile.antlr.cypher;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

/**
 * @Author yitao
 * @Created 2023/12/26
 */
public class CypherDemo {

    @Test
    public void name() {
        System.out.println('\u0009');
        System.out.println('\u0010');
        System.out.println('\u0002');
        System.out.println('\u0004');
    }

    @Test
    public void parse() {
        String content = "call {\n" +
                "match (jg:txn_ou_ads)-[fk:ln_txn_rel]-> (acc1:accounter_ads)-[zjjy1:acc_txnrel]->(acc2:accounter_ads)-[zjjy2:acc_txn_rel]->(acc3:accounter_ads) \n" +
                "where acc1.prim_cst_id starts with '82' \n" +
                "and datetime(zjjy1.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\")>datetime(fk.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\") //这是注释 \n" +
                "and datetime(zjjy2.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\")>datetime(fk.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\") \n" +
                "and zjjy1.txn_tm > apoc.date.currentTimestamp() - 315360000000 \n" +
                "with acc1.prim_cst_id as acc_id0,zjjy1.ctpt_ar_id as acc_id1,sum(toFloat(zjjy1.txn_amt)) as amt_sum1,zjjy2.ctpt_ar_id as acc_id2,sum(toFloat(zjjy2.txn_amt)) as amt_sum2,toFloat(fk.txn_pnp_amt) as txn_pnp_amt \n" +
                "where amt_sum1 >= 0.8 * txn_pnp_amt and amt_sum1 <= 2* txn_pnp_amt and amt_sum2 >= 0.8 * txn_pnp_amt and amt_sum2 <= 2* txn_pnp_amt \n" +
                "return acc_id0,acc_id1,acc_id2 \n" +
                "}\n" +
                "match p=(jg:txn_ou_ads)-[fk:ln_txn_rel]-> (acc1:accounter_ads)-[zjjy1:acc_txnrel]->(acc2:accounter_ads)-[zjjy2:acc_txn_rel]->(acc3:accounter_ads) \n" +
                "where acc1.prim_cst_id = acc_id0 and acc2.dmd_dep_ar_id = acc_id1 and acc3.dmd_dep_ar_id = acc_id2 \n" +
                "return p";
//                "return p,datetime(zjjy1.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\") as t1,'12' as t2,aa.ss as ts;";
        //下面的解析成功
//        content = "match (jg:txn_ou_ads)-[fk:ln_txn_rel]-> (acc1:accounter_ads)-[zjjy1:acc_txnrel]->(acc2:accounter_ads)-[zjjy2:acc_txn_rel]->(acc3:accounter_ads) " +
//                "where acc1.prim_cst_id starts with \"82\" " +
//                "and zjjy1.txn_tm > apoc.date.currentTimestamp() - 315360000000 \n" +
//                "and datetime(zjjy1.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\")>datetime(fk.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\") " +
//                "and datetime(zjjy2.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\")>datetime(fk.txn_tm,\"%Y-%m-%d %H:%M:%S%.3f\") \n" +
//                "with acc1.prim_cst_id as acc_id0,zjjy1.ctpt_ar_id as acc_id1,sum(toFloat(zjjy1.txn_amt)) as amt_sum1,zjjy2.ctpt_ar_id as acc_id2,sum(toFloat(zjjy2.txn_amt)) as amt_sum2,toFloat(fk.txn_pnp_amt) as txn_pnp_amt " +
//                "where amt_sum1 >= 0.8 + txn_pnp_amt " +
//                "and amt_sum1 <= 2* txn_pnp_amt and amt_sum2 >= 0.8 * txn_pnp_amt and amt_sum2 <= 2* txn_pnp_amt " +
//                "return acc_id0,acc_id1,acc_id2";
        //能就解析成功
//        content = "match p=(s:person)-[e]-(b:company) \n" +
//                "return p,s.type as st,2 as mode, 'in' as type;";
        content = "call {\n" +
                "  match (jg1:txn_ou_ads)-[fk:ln_txn_rel]->(acc0:accounter_ads),\n" +
                "        (acc1:accounter_ads)-[zjjy1:acc_txn_rel]->(acc0)-[hk:ln_txn_pnp_rel]->(jg2:txn_ou_ads)\n" +
                "  where  zjjy1.txn_tm < hk.txn_tm and zjjy1.txn_tm > hk.txn_tm+259200000\n" +
                "    and  hk.txn_tm > apoc.date.currentTimestamp() - 31536000000\n" +
                "   with  toFloat(fk.txn_pnp_amt) as fk_amt,acc1.dmd_dep_ar_id as ac_id1,acc0.dmd_dep_ar_id as ac_id0\n" +
                "        ,zjjy1.object_key as zjjy1_object_key,apoc.coll.sum([zjjy1 in collect(distinct zjjy1)|zjjy1.txn_amt]) as sum_1_amt \n" +
                "\t\t,toFloat(hk.txn_amt) as hk_amt,hk.object_key as hk_object_key,count(acc1) as total_customers\n" +
                "  where  sum_1_amt>=20000\n" +
                "    and  fk_amt >= 20000\n" +
                "    and  hk_amt >= 20000\n" +
                "    and (sum_1_amt >= 0.3*hk_amt and sum_1_amt <= 0.5*hk_amt)\n" +
                "    and  total_customers > 0\n" +
                //多个match...with语句-开始
//                "  match (jg1:txn_ou_ads)-[fk:ln_txn_rel]->(acc0:accounter_ads),\n" +
//                "        (acc1:accounter_ads)-[zjjy1:acc_txn_rel]->(acc0)-[hk:ln_txn_pnp_rel]->(jg2:txn_ou_ads)\n" +
//                "  where  zjjy1.txn_tm < hk.txn_tm and zjjy1.txn_tm > hk.txn_tm+259200000\n" +
//                "    and  hk.txn_tm > apoc.date.currentTimestamp() - 31536000000\n" +
                "   with  toFloat(fk.txn_pnp_amt) as fk_amt,acc1.dmd_dep_ar_id as ac_id1,acc0.dmd_dep_ar_id as ac_id0\n" +
                "        ,zjjy1.object_key as zjjy1_object_key,apoc.coll.sum([zjjy1 in collect(distinct zjjy1)|zjjy1.txn_amt]) as sum_1_amt \n" +
                "\t\t,toFloat(hk.txn_amt) as hk_amt,hk.object_key as hk_object_key,count(acc1) as total_customers\n" +
                "  where  sum_1_amt>=20000\n" +
                "    and  fk_amt >= 20000\n" +
                "    and  hk_amt >= 20000\n" +
                "    and (sum_1_amt >= 0.3*hk_amt and sum_1_amt <= 0.5*hk_amt)\n" +
                "    and  total_customers > 0\n" +
                //多个match...with语句-结束
                " return  ac_id1,ac_id0,zjjy1_object_key,hk_object_key\n" +
                "     }\n" +
                "  match  p=(acc1:accounter_ads)-[zjjy1:acc_txn_rel]->(acc0:accounter_ads)-[hk:ln_txn_pnp_rel]-> (jg2:txn_ou_ads) \n" +
                "  where  acc1.dmd_dep_ar_id=ac_id1\n" +
                "    and  acc0.dmd_dep_ar_id=ac_id0\n" +
                "    and  zjjy1.object_key=zjjy1_object_key\n" +
                "    and  hk.object_key=hk_object_key\n" +
                " return  // count(acc2);\np,case when nums>5 then 1 else 0 end as a";

        content =
"CALL { MATCH (person1:person)-[tz1:tz]->(company1:company)-[tz2:tz]->(company2:company) WHERE person1.age > 2  WITH person1.object_key as obj_n_obj,count(person1.object_key) as val_n_n_1 WHERE obj_n_obj <> '0' AND val_n_n_1 <> 0 RETURN obj_n_obj,val_n_n_1 }\n " +
        "MATCH path = (person1:person)-[tz1:tz]->(company1:company)-[tz2:tz]->(company2:company) WHERE person1.object_key <> '0' RETURN person1 as person1,company1 as company1,company2 as company2,tz1 as tz1,tz2 as tz2,obj_n_obj as obj_n_obj,val_n_n_1 as val_n_n_1,path as path";
//        content = "MATCH (person1:person)-[tz1:tz]->(company1:company)-[tz2:tz]->(company2:company) WHERE person1.age > 2  WITH person1.object_key as obj_n_obj,count(person1.object_key) as val_n_n_1 WHERE obj_n_obj <> '0' AND val_n_n_1 <> 0 RETURN obj_n_obj,val_n_n_1";
//        content = "MATCH path = (person1:person)-[tz1:tz]->(company1:company)-[tz2:tz]->(company2:company) WHERE person1.object_key <> '0' RETURN person1 as person1,company1 as company1,company2 as company2,tz1 as tz1,tz2 as tz2,obj_n_obj as obj_n_obj,val_n_n_1 as val_n_n_1,path as path";
//        System.out.println(content);
//        content = "MATCH p =(bill:piaoju)-[bc:bill_cust_rel]->(pc:pioaju_cust_ads)-[tx:bill_endrsmt_trans_rel*1..10]->(pc1:pioaju_cust_ads)\n" +

        content = "MATCH p=(bill:piaoju)-[bc:bill_cust_rel*1..10]->(pc:pioaju_cust_ads)-[tx:bill_endrsmt_trans_rel]->(pc1:pioaju_cust_ads) " +
                "WHERE bill.bill_info = '123456789' " +
                "UNWIND relationships(p) as rel " +
                "WITH rel " +
                "WHERE type(rel)= 'bill_endrsmt_trans_rel' " +
                "RETURN rel.trans_to_name as name";

//        content = "MATCH p=(bill:piaoju)-[bc:bill_cust_rel*1..10]->(pc:pioaju_cust_ads)-[tx:bill_endrsmt_trans_rel]->(pc1:pioaju_cust_ads) " +
//                "WHERE bill.bill_info = '123456789' " +
//                "RETURN rel.trans_to_name as name";

//        content = "MATCH (bill:piaoju)-[bc:bill_type]->(pc:pioaju_cust_ads) return bc";
        content =
                "WITH apoc.date.add(apoc.date.currentTimestamp(),'ms',-90,'d') as value \n" +
                "MATCH (a1:loan_acct_info_ads)-[fkjy:loan_acc_txn_rel]-(acc1:accounter_info_ads) \n" +
                "-[zjjy1:small_amt_acc|txn_rel]->(acc2:accounter_info_ads) \n" +
                "where fkiy.txn_dt <= value \n" +
                "return fkjy.object_key as object_key";
        System.out.println(content);
        CodePointCharStream input = CharStreams.fromString(content);
        CypherLexer lexer = new CypherLexer(input);
        //转成token流
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        CypherParser parser = new CypherParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext context = parser.script();
        System.out.println("语句解析：" + (parser.getNumberOfSyntaxErrors() == 0 ? "成功" : "失败"));
        System.out.println("解析异常数：" + parser.getNumberOfSyntaxErrors());
//        System.out.println(context.toStringTree(parser));
        CypherListener listener = new CypherListener();
        ParseTreeWalker.DEFAULT.walk(listener, context);
        System.out.println("语句返回字段：");
        System.out.println(String.join(",", listener.parseResult()));
    }

    static class CypherListener extends CypherParserBaseListener {

        private CypherParser.ReturnStContext lastReturnCtx;

        @Override
        public void enterListLit(CypherParser.ListLitContext ctx) {
            super.enterListLit(ctx);
        }

        @Override
        public void enterListComprehension(CypherParser.ListComprehensionContext ctx) {
            super.enterListComprehension(ctx);
        }

        @Override
        public void enterPatternComprehension(CypherParser.PatternComprehensionContext ctx) {
            super.enterPatternComprehension(ctx);
        }

        @Override
        public void enterProjectionItems(CypherParser.ProjectionItemsContext ctx) {
            super.enterProjectionItems(ctx);
        }

        @Override
        public void enterMultiPartQ(CypherParser.MultiPartQContext ctx) {
            super.enterMultiPartQ(ctx);
        }

        @Override
        public void enterCountAll(CypherParser.CountAllContext ctx) {
            super.enterCountAll(ctx);
        }

        @Override
        public void enterStandaloneCall(CypherParser.StandaloneCallContext ctx) {
            super.enterStandaloneCall(ctx);
        }

        @Override
        public void enterRelationDetail(CypherParser.RelationDetailContext ctx) {
            super.enterRelationDetail(ctx);
        }

        @Override
        public void enterMultDivExpression(CypherParser.MultDivExpressionContext ctx) {
            super.enterMultDivExpression(ctx);
        }

        @Override
        public void enterPatternElem(CypherParser.PatternElemContext ctx) {
            super.enterPatternElem(ctx);
        }

        @Override
        public void enterMatchSt(CypherParser.MatchStContext ctx) {
            super.enterMatchSt(ctx);
        }

        @Override
        public void enterRangeLit(CypherParser.RangeLitContext ctx) {
            super.enterRangeLit(ctx);
        }

        @Override
        public void enterReturnSt(CypherParser.ReturnStContext ctx) {
            lastReturnCtx = ctx;
            System.out.println("---");
            super.enterReturnSt(ctx);
        }

        public List<String> parseResult() {
            List<String> result = new ArrayList<>();
            if (lastReturnCtx == null) {
                System.out.println("未发现return语句");
            }
            for (int i = 0; i < lastReturnCtx.getChildCount(); i++) {
                if (lastReturnCtx.getChild(i) instanceof CypherParser.ProjectionBodyContext) {
                    if (lastReturnCtx.getChild(i).getChild(0) instanceof CypherParser.ProjectionItemsContext) {
                        //多返回值
                        CypherParser.ProjectionItemsContext nctx = (CypherParser.ProjectionItemsContext) lastReturnCtx.getChild(i).getChild(0);
                        for (int i1 = 0; i1 < nctx.getChildCount(); i1++) {
                            if (nctx.getChild(i1) instanceof CypherParser.ProjectionItemContext) {
                                if (nctx.getChild(i1).getChildCount() == 3) {
                                    //xx as xxx
                                    if ("as".equals(nctx.getChild(i1).getChild(1).getText())) {
                                        String v = seekSymbolContext(nctx.getChild(i1).getChild(2));
                                        if (v == null) {
                                            System.out.println("未找到SymbolContext，无法解析");
                                        } else {
                                            result.add(v);
                                        }
                                    }
                                } else if (nctx.getChild(i1).getChildCount() == 1) {
                                    String v = seekSymbolContext(nctx.getChild(i1));
                                    if (v == null) {
                                        System.out.println("未找到SymbolContext，无法解析");
                                    } else {
                                        result.add(v);
                                    }
                                } else {
                                    System.out.println("未解析场景，请联系管理员");
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }

        private String seekSymbolContext(ParseTree pt) {
            if (pt instanceof CypherParser.SymbolContext) {
                return ((CypherParser.SymbolContext) pt).getText();
            }
            if (pt.getChildCount() == 1) {
                return seekSymbolContext(pt.getChild(0));
            } else {
                System.out.println("语法不规范，return单个变量或者使用as，例如：return p, 'xx' as tt;");
            }
            return null;
        }
    }
}
