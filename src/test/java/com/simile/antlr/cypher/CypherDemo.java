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
//        content = "WITH apoc.date.add(apoc.date.currentTimestamp(),'ms',-90,'d') as value \n MATCH (a1:loan_acct_info_ads)-[fkjy:loan_acc_txn_rel]-(acc1:accounter_info_ads) \n -[zjjy1:small_amt_acc|txn_rel]->(acc2:accounter_info_ads) \n where fkiy.txn_dt <= value \n return fkjy.object_key as object_key";
//        content = "match(a:irmp_fund_flow_model_es)\nwhere a.model_child_code = '0102' //对公\nwith a.model_param_m as txn_pnp_amt //放款/还款金额起点M\n,a.model_param_p as jy_amt //交易金额大于20000\n,a.model_param_n_start as model_param_n_start //应用:比例范围起点\n,a.model_param_n_end as model_param_n_end //应用:比例范围终点\n,a.model_param_x as model_param_x //放款7天内\nmatch (jg:loan_acct_info_ads)-[fk:loan_acc_txn_rel]->(acc1:accounter_info_ads)-[zjjy1:large_amt_acc_txn_rel]->(acc2:accounter_info_ads)-[zjjy2:large_amt_acc_txn_rel]->(acc3:accounter_info_ads)-[zjjy3:large_amt_acc_txn_rel]->(acc4:accounter_info_ads)-[gl:accounter_gl_rel]-(acc1)\nwhere acc1.cor_per_logo = '2'  \n\t//fk.txn_tm > 0 \n\t//and \n\tand fk.txn_pnp_amt >= txn_pnp_amt\n\tand zjjy1.txn_amt >= jy_amt\n\tand zjjy2.txn_amt >= jy_amt\n\tand zjjy3.txn_amt >= jy_amt\n\t//and acc1.prim_cst_id starts with '82' \n\tand zjjy1.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > fk.txn_tm \n\tand zjjy3.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > zjjy1.txn_tm \n\tand zjjy3.txn_tm > zjjy2.txn_tm \n\tand zjjy1.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy2.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy3.txn_tm < fk.txn_tm + 604800000 \nwith fk.txn_pnp_amt as txn_pnp_amt\n\t,apoc.coll.sum([zjjy1 in collect(distinct zjjy1)|zjjy1.txn_amt]) as sum_1_amt\n\t,apoc.coll.sum([zjjy2 in collect(distinct zjjy2)|zjjy2.txn_amt]) as sum_2_amt\n    ,apoc.coll.sum([zjjy3 in collect(distinct zjjy3)|zjjy3.txn_amt]) as sum_3_amt\t\n\t,jg,fk,acc1,zjjy1,acc2,zjjy2,acc3,zjjy3,acc4,gl,jy_amt,model_param_n_start,model_param_n_end\nwhere (sum_1_amt >= model_param_n_start*txn_pnp_amt and sum_1_amt <= model_param_n_end*txn_pnp_amt) \n  and (sum_2_amt >= model_param_n_start*txn_pnp_amt and sum_2_amt <= model_param_n_end*txn_pnp_amt) \n  and (sum_3_amt >= model_param_n_start*txn_pnp_amt and sum_3_amt <= model_param_n_end*txn_pnp_amt) \nreturn \n\tjg.ln_ar_id as ln_ar_id\n\t\n\t,fk.object_key          \tas\t\tfk_object_key        \n\t,fk.from_key            \tas\t\tfk_from_key          \n\t,fk.to_key              \tas\t\tfk_to_key        \n\t,''     \t\t\t  \t\tas\t\tfk_orig_txn_run_nbr  \n\t,''     \t\t\t  \t\tas\t\tfk_sub_txn_run_nbr \n\t,fk.dmd_dep_ar_id        \tas\t\tfk_dmd_dep_ar_id     \n\t,fk.txn_dt               \tas\t\tfk_txn_dt            \n\t,fk.rprg_ou_ip_id        \tas\t\tfk_rprg_ou_ip_id     \n\t,fk.vchr_tp_code         \tas\t\tfk_vchr_tp_code      \n\t,fk.ctpt_ar_id           \tas\t\tfk_ctpt_ar_id        \n\t,fk.int_clcn_eff_dt      \tas\t\tfk_int_clcn_eff_dt   \n\t,fk.txn_tp_id            \tas\t\tfk_txn_tp_id         \n\t,fk.cash_tfr_ind         \tas\t\tfk_cash_tfr_ind      \n\t,fk.dnmn_ccy_id          \tas\t\tfk_dnmn_ccy_id       \n\t,fk.txn_cnl_tp_id        \tas\t\tfk_txn_cnl_tp_id     \n\t,fk.csh_rmit_ind_tp_id   \tas\t\tfk_csh_rmit_ind_tp_id\n\t,fk.vchr_no              \tas\t\tfk_vchr_no           \n\t,fk.txn_tlr_id           \tas\t\tfk_txn_tlr_id        \n\t,fk.db_cr_ind            \tas\t\tfk_db_cr_ind         \n\t,fk.txn_ou_ip_id         \tas\t\tfk_txn_ou_ip_id      \n\t,fk.txn_pnp_amt          \tas\t\tfk_txn_pnp_amt  \t\n\t,fk.abs_code             \tas\t\tfk_abs_code          \n\t,fk.txn_code             \tas\t\tfk_txn_code          \n\t,fk.abs_dsc              \tas\t\tfk_abs_dsc           \n\t,fk.txn_tm               \tas\t\tfk_txn_tm                   \n\t,fk.dt                   \tas\t\tfk_dt                \n\t\n\t,zjjy1.object_key            as\t\tzjjy1_object_key        \n\t,zjjy1.from_key              as\t\tzjjy1_from_key          \n\t,zjjy1.to_key                as\t\tzjjy1_to_key            \n\t,zjjy1.orig_txn_run_nbr      as\t\tzjjy1_orig_txn_run_nbr  \n\t,zjjy1.sub_txn_run_nbr       as\t\tzjjy1_sub_txn_run_nbr   \n\t,zjjy1.dmd_dep_ar_id         as\t\tzjjy1_dmd_dep_ar_id     \n\t,zjjy1.txn_dt                as\t\tzjjy1_txn_dt            \n\t,zjjy1.rprg_ou_ip_id         as\t\tzjjy1_rprg_ou_ip_id     \n\t,zjjy1.vchr_tp_code          as\t\tzjjy1_vchr_tp_code      \n\t,zjjy1.ctpt_ar_id            as\t\tzjjy1_ctpt_ar_id        \n\t,zjjy1.int_clcn_eff_dt       as\t\tzjjy1_int_clcn_eff_dt   \n\t,zjjy1.txn_tp_id             as\t\tzjjy1_txn_tp_id         \n\t,zjjy1.cash_tfr_ind          as\t\tzjjy1_cash_tfr_ind      \n\t,zjjy1.dnmn_ccy_id           as\t\tzjjy1_dnmn_ccy_id       \n\t,zjjy1.txn_cnl_tp_id         as\t\tzjjy1_txn_cnl_tp_id     \n\t,zjjy1.csh_rmit_ind_tp_id    as\t\tzjjy1_csh_rmit_ind_tp_id\n\t,zjjy1.vchr_no               as\t\tzjjy1_vchr_no           \n\t,zjjy1.txn_tlr_id            as\t\tzjjy1_txn_tlr_id        \n\t,zjjy1.db_cr_ind             as\t\tzjjy1_db_cr_ind         \n\t,zjjy1.txn_ou_ip_id          as\t\tzjjy1_txn_ou_ip_id      \n\t,zjjy1.txn_amt               as\t\tzjjy1_txn_amt           \n\t,zjjy1.abs_code              as\t\tzjjy1_abs_code          \n\t,zjjy1.txn_code              as\t\tzjjy1_txn_code          \n\t,zjjy1.abs_dsc               as\t\tzjjy1_abs_dsc           \n\t,zjjy1.txn_tm                as\t\tzjjy1_txn_tm                \n\t,zjjy1.dt                    as\t\tzjjy1_dt  \n\t\n\t,zjjy2.object_key            as\t\tzjjy2_object_key        \n\t,zjjy2.from_key              as\t\tzjjy2_from_key          \n\t,zjjy2.to_key                as\t\tzjjy2_to_key            \n\t,zjjy2.orig_txn_run_nbr      as\t\tzjjy2_orig_txn_run_nbr  \n\t,zjjy2.sub_txn_run_nbr       as\t\tzjjy2_sub_txn_run_nbr   \n\t,zjjy2.dmd_dep_ar_id         as\t\tzjjy2_dmd_dep_ar_id     \n\t,zjjy2.txn_dt                as\t\tzjjy2_txn_dt            \n\t,zjjy2.rprg_ou_ip_id         as\t\tzjjy2_rprg_ou_ip_id     \n\t,zjjy2.vchr_tp_code          as\t\tzjjy2_vchr_tp_code      \n\t,zjjy2.ctpt_ar_id            as\t\tzjjy2_ctpt_ar_id        \n\t,zjjy2.int_clcn_eff_dt       as\t\tzjjy2_int_clcn_eff_dt   \n\t,zjjy2.txn_tp_id             as\t\tzjjy2_txn_tp_id         \n\t,zjjy2.cash_tfr_ind          as\t\tzjjy2_cash_tfr_ind      \n\t,zjjy2.dnmn_ccy_id           as\t\tzjjy2_dnmn_ccy_id       \n\t,zjjy2.txn_cnl_tp_id         as\t\tzjjy2_txn_cnl_tp_id     \n\t,zjjy2.csh_rmit_ind_tp_id    as\t\tzjjy2_csh_rmit_ind_tp_id\n\t,zjjy2.vchr_no               as\t\tzjjy2_vchr_no           \n\t,zjjy2.txn_tlr_id            as\t\tzjjy2_txn_tlr_id        \n\t,zjjy2.db_cr_ind             as\t\tzjjy2_db_cr_ind         \n\t,zjjy2.txn_ou_ip_id          as\t\tzjjy2_txn_ou_ip_id      \n\t,zjjy2.txn_amt               as\t\tzjjy2_txn_amt           \n\t,zjjy2.abs_code              as\t\tzjjy2_abs_code          \n\t,zjjy2.txn_code              as\t\tzjjy2_txn_code          \n\t,zjjy2.abs_dsc               as\t\tzjjy2_abs_dsc           \n\t,zjjy2.txn_tm                as\t\tzjjy2_txn_tm               \n\t,zjjy2.dt                    as\t\tzjjy2_dt  \n\t\n\t,zjjy3.object_key            as\t\tzjjy3_object_key        \n\t,zjjy3.from_key              as\t\tzjjy3_from_key          \n\t,zjjy3.to_key                as\t\tzjjy3_to_key            \n\t,zjjy3.orig_txn_run_nbr      as\t\tzjjy3_orig_txn_run_nbr  \n\t,zjjy3.sub_txn_run_nbr       as\t\tzjjy3_sub_txn_run_nbr   \n\t,zjjy3.dmd_dep_ar_id         as\t\tzjjy3_dmd_dep_ar_id     \n\t,zjjy3.txn_dt                as\t\tzjjy3_txn_dt            \n\t,zjjy3.rprg_ou_ip_id         as\t\tzjjy3_rprg_ou_ip_id     \n\t,zjjy3.vchr_tp_code          as\t\tzjjy3_vchr_tp_code      \n\t,zjjy3.ctpt_ar_id            as\t\tzjjy3_ctpt_ar_id        \n\t,zjjy3.int_clcn_eff_dt       as\t\tzjjy3_int_clcn_eff_dt   \n\t,zjjy3.txn_tp_id             as\t\tzjjy3_txn_tp_id         \n\t,zjjy3.cash_tfr_ind          as\t\tzjjy3_cash_tfr_ind      \n\t,zjjy3.dnmn_ccy_id           as\t\tzjjy3_dnmn_ccy_id       \n\t,zjjy3.txn_cnl_tp_id         as\t\tzjjy3_txn_cnl_tp_id     \n\t,zjjy3.csh_rmit_ind_tp_id    as\t\tzjjy3_csh_rmit_ind_tp_id\n\t,zjjy3.vchr_no               as\t\tzjjy3_vchr_no           \n\t,zjjy3.txn_tlr_id            as\t\tzjjy3_txn_tlr_id        \n\t,zjjy3.db_cr_ind             as\t\tzjjy3_db_cr_ind         \n\t,zjjy3.txn_ou_ip_id          as\t\tzjjy3_txn_ou_ip_id      \n\t,zjjy3.txn_amt               as\t\tzjjy3_txn_amt           \n\t,zjjy3.abs_code              as\t\tzjjy3_abs_code          \n\t,zjjy3.txn_code              as\t\tzjjy3_txn_code          \n\t,zjjy3.abs_dsc               as\t\tzjjy3_abs_dsc           \n\t,zjjy3.txn_tm                as\t\tzjjy3_txn_tm             \n\t,zjjy3.dt                    as\t\tzjjy3_dt \n\t\n\t,gl.relation_name            as\t\trelation_name\n\t,gl.gl_from_key              as\t\tgl_from_key  \n\t,gl.gl_to_key                as\t\tgl_to_key    \n\t\n\t,acc1.dmd_dep_ar_id as acc_start\n\t,acc4.dmd_dep_ar_id as acc_end\n\t\n\t,acc1.prim_cst_id as prim_cst_id_start\n\t,acc4.prim_cst_id as prim_cst_id_end \n;";
//        content = "match(a:irmp_fund_flow_model_es)\nwhere a.model_child_code = '0102' //对公\nwith a.model_param_m as txn_pnp_amt //放款/还款金额起点M\n,a.model_param_p as jy_amt //交易金额大于20000\n,a.model_param_n_start as model_param_n_start //应用:比例范围起点\n,a.model_param_n_end as model_param_n_end //应用:比例范围终点\n,a.model_param_x as model_param_x //放款7天内\nmatch (jg:loan_acct_info_ads)-[fk:loan_acc_txn_rel]->(acc1:accounter_info_ads)-[zjjy1:large_amt_acc_txn_rel]->(acc2:accounter_info_ads)-[zjjy2:large_amt_acc_txn_rel]->(acc3:accounter_info_ads)-[gl:accounter_gl_rel]-(acc1)\nwhere fk.txn_pnp_amt >= txn_pnp_amt \n    and acc1.cor_per_logo = '2' \n\tand zjjy1.txn_amt >= jy_amt\n\tand zjjy2.txn_amt >= jy_amt \n\tand zjjy1.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > zjjy1.txn_tm \n\tand zjjy1.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy2.txn_tm < fk.txn_tm + 604800000 \n with \n\tfk.txn_pnp_amt as txn_pnp_amt \n\t,apoc.coll.sum([zjjy1 in collect(distinct zjjy1)|zjjy1.txn_amt]) as sum_1_amt \n\t,apoc.coll.sum([zjjy2 in collect(distinct zjjy2)|zjjy2.txn_amt]) as sum_2_amt \n\t,jg,fk,acc1,zjjy1,acc2,zjjy2,acc3,gl,jy_amt,model_param_n_start,model_param_n_end \nwhere (sum_1_amt >= model_param_n_start*txn_pnp_amt and sum_1_amt <= model_param_n_end*txn_pnp_amt) \n\tand (sum_2_amt >= model_param_n_start*txn_pnp_amt and sum_2_amt <= model_param_n_end*txn_pnp_amt) \nreturn \n\tjg.ln_ar_id as ln_ar_id\n\t\n\t,fk.object_key          \tas\t\tfk_object_key        \n\t,fk.from_key            \tas\t\tfk_from_key          \n\t,fk.to_key              \tas\t\tfk_to_key        \n\t,''     \t\t\t  \t\tas\t\tfk_orig_txn_run_nbr  \n\t,''     \t\t\t  \t\tas\t\tfk_sub_txn_run_nbr \n\t,fk.dmd_dep_ar_id        \tas\t\tfk_dmd_dep_ar_id     \n\t,fk.txn_dt               \tas\t\tfk_txn_dt            \n\t,fk.rprg_ou_ip_id        \tas\t\tfk_rprg_ou_ip_id     \n\t,fk.vchr_tp_code         \tas\t\tfk_vchr_tp_code      \n\t,fk.ctpt_ar_id           \tas\t\tfk_ctpt_ar_id        \n\t,fk.int_clcn_eff_dt      \tas\t\tfk_int_clcn_eff_dt   \n\t,fk.txn_tp_id            \tas\t\tfk_txn_tp_id         \n\t,fk.cash_tfr_ind         \tas\t\tfk_cash_tfr_ind      \n\t,fk.dnmn_ccy_id          \tas\t\tfk_dnmn_ccy_id       \n\t,fk.txn_cnl_tp_id        \tas\t\tfk_txn_cnl_tp_id     \n\t,fk.csh_rmit_ind_tp_id   \tas\t\tfk_csh_rmit_ind_tp_id\n\t,fk.vchr_no              \tas\t\tfk_vchr_no           \n\t,fk.txn_tlr_id           \tas\t\tfk_txn_tlr_id        \n\t,fk.db_cr_ind            \tas\t\tfk_db_cr_ind         \n\t,fk.txn_ou_ip_id         \tas\t\tfk_txn_ou_ip_id      \n\t,fk.txn_pnp_amt          \tas\t\tfk_txn_pnp_amt  \t\n\t,fk.abs_code             \tas\t\tfk_abs_code          \n\t,fk.txn_code             \tas\t\tfk_txn_code          \n\t,fk.abs_dsc              \tas\t\tfk_abs_dsc           \n\t,fk.txn_tm               \tas\t\tfk_txn_tm                  \n\t,fk.dt                   \tas\t\tfk_dt                \n\t\n\t,zjjy1.object_key            as\t\tzjjy1_object_key        \n\t,zjjy1.from_key              as\t\tzjjy1_from_key          \n\t,zjjy1.to_key                as\t\tzjjy1_to_key            \n\t,zjjy1.orig_txn_run_nbr      as\t\tzjjy1_orig_txn_run_nbr  \n\t,zjjy1.sub_txn_run_nbr       as\t\tzjjy1_sub_txn_run_nbr   \n\t,zjjy1.dmd_dep_ar_id         as\t\tzjjy1_dmd_dep_ar_id     \n\t,zjjy1.txn_dt                as\t\tzjjy1_txn_dt            \n\t,zjjy1.rprg_ou_ip_id         as\t\tzjjy1_rprg_ou_ip_id     \n\t,zjjy1.vchr_tp_code          as\t\tzjjy1_vchr_tp_code      \n\t,zjjy1.ctpt_ar_id            as\t\tzjjy1_ctpt_ar_id        \n\t,zjjy1.int_clcn_eff_dt       as\t\tzjjy1_int_clcn_eff_dt   \n\t,zjjy1.txn_tp_id             as\t\tzjjy1_txn_tp_id         \n\t,zjjy1.cash_tfr_ind          as\t\tzjjy1_cash_tfr_ind      \n\t,zjjy1.dnmn_ccy_id           as\t\tzjjy1_dnmn_ccy_id       \n\t,zjjy1.txn_cnl_tp_id         as\t\tzjjy1_txn_cnl_tp_id     \n\t,zjjy1.csh_rmit_ind_tp_id    as\t\tzjjy1_csh_rmit_ind_tp_id\n\t,zjjy1.vchr_no               as\t\tzjjy1_vchr_no           \n\t,zjjy1.txn_tlr_id            as\t\tzjjy1_txn_tlr_id        \n\t,zjjy1.db_cr_ind             as\t\tzjjy1_db_cr_ind         \n\t,zjjy1.txn_ou_ip_id          as\t\tzjjy1_txn_ou_ip_id      \n\t,zjjy1.txn_amt               as\t\tzjjy1_txn_amt           \n\t,zjjy1.abs_code              as\t\tzjjy1_abs_code          \n\t,zjjy1.txn_code              as\t\tzjjy1_txn_code          \n\t,zjjy1.abs_dsc               as\t\tzjjy1_abs_dsc           \n\t,zjjy1.txn_tm                as\t\tzjjy1_txn_tm               \n\t,zjjy1.dt                    as\t\tzjjy1_dt  \n\t\n\t,zjjy2.object_key            as\t\tzjjy2_object_key        \n\t,zjjy2.from_key              as\t\tzjjy2_from_key          \n\t,zjjy2.to_key                as\t\tzjjy2_to_key            \n\t,zjjy2.orig_txn_run_nbr      as\t\tzjjy2_orig_txn_run_nbr  \n\t,zjjy2.sub_txn_run_nbr       as\t\tzjjy2_sub_txn_run_nbr   \n\t,zjjy2.dmd_dep_ar_id         as\t\tzjjy2_dmd_dep_ar_id     \n\t,zjjy2.txn_dt                as\t\tzjjy2_txn_dt            \n\t,zjjy2.rprg_ou_ip_id         as\t\tzjjy2_rprg_ou_ip_id     \n\t,zjjy2.vchr_tp_code          as\t\tzjjy2_vchr_tp_code      \n\t,zjjy2.ctpt_ar_id            as\t\tzjjy2_ctpt_ar_id        \n\t,zjjy2.int_clcn_eff_dt       as\t\tzjjy2_int_clcn_eff_dt   \n\t,zjjy2.txn_tp_id             as\t\tzjjy2_txn_tp_id         \n\t,zjjy2.cash_tfr_ind          as\t\tzjjy2_cash_tfr_ind      \n\t,zjjy2.dnmn_ccy_id           as\t\tzjjy2_dnmn_ccy_id       \n\t,zjjy2.txn_cnl_tp_id         as\t\tzjjy2_txn_cnl_tp_id     \n\t,zjjy2.csh_rmit_ind_tp_id    as\t\tzjjy2_csh_rmit_ind_tp_id\n\t,zjjy2.vchr_no               as\t\tzjjy2_vchr_no           \n\t,zjjy2.txn_tlr_id            as\t\tzjjy2_txn_tlr_id        \n\t,zjjy2.db_cr_ind             as\t\tzjjy2_db_cr_ind         \n\t,zjjy2.txn_ou_ip_id          as\t\tzjjy2_txn_ou_ip_id      \n\t,zjjy2.txn_amt               as\t\tzjjy2_txn_amt           \n\t,zjjy2.abs_code              as\t\tzjjy2_abs_code          \n\t,zjjy2.txn_code              as\t\tzjjy2_txn_code          \n\t,zjjy2.abs_dsc               as\t\tzjjy2_abs_dsc           \n\t,zjjy2.txn_tm                as\t\tzjjy2_txn_tm             \n\t,zjjy2.dt                    as\t\tzjjy2_dt  \n\t\n\t,gl.relation_name            as     relation_name\n\t,gl.gl_from_key              as     gl_from_key  \n\t,gl.gl_to_key                as     gl_to_key    \n\t\n\t,acc1.dmd_dep_ar_id as acc_start\n\t,acc3.dmd_dep_ar_id as acc_end\n\t\n\t,acc1.prim_cst_id as prim_cst_id_start\n\t,acc3.prim_cst_id as prim_cst_id_end \n;";
//        content = "match(a:irmp_fund_flow_model_es)\nwhere a.model_child_code = '0102' //对公\nwith a.model_param_m as txn_pnp_amt //放款/还款金额起点M\n,a.model_param_p as jy_amt //交易金额大于20000\n,a.model_param_n_start as model_param_n_start //应用:比例范围起点\n,a.model_param_n_end as model_param_n_end //应用:比例范围终点\n,a.model_param_x as model_param_x //放款7天内\nmatch (jg:loan_acct_info_ads)-[fk:loan_acc_txn_rel]->(acc1:accounter_info_ads)-[zjjy1:large_amt_acc_txn_rel]->(acc2:accounter_info_ads)-[zjjy2:large_amt_acc_txn_rel]->(acc3:accounter_info_ads)-[zjjy3:large_amt_acc_txn_rel]->(acc4:accounter_info_ads)-[zjjy4:large_amt_acc_txn_rel]->(acc5:accounter_info_ads)-[gl:accounter_gl_rel]-(acc1)\nwhere acc1.cor_per_logo = '2'  \n\tand fk.txn_pnp_amt >= txn_pnp_amt \n\tand zjjy1.txn_amt >= jy_amt \n\tand zjjy2.txn_amt >= jy_amt\n\tand zjjy3.txn_amt >= jy_amt\n\tand zjjy4.txn_amt >= jy_amt\n\t//  and fk.txn_tm > 0 \n\tand zjjy1.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > fk.txn_tm \n\tand zjjy3.txn_tm > fk.txn_tm \n\tand zjjy4.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > zjjy1.txn_tm \n\tand zjjy3.txn_tm > zjjy2.txn_tm \n\tand zjjy4.txn_tm > zjjy3.txn_tm \n\tand zjjy1.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy2.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy3.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy4.txn_tm < fk.txn_tm + 604800000 \nwith \n\tfk.txn_pnp_amt as txn_pnp_amt\n\t,apoc.coll.sum([zjjy1 in collect(distinct zjjy1)|zjjy1.txn_amt]) as sum_1_amt\n\t,apoc.coll.sum([zjjy2 in collect(distinct zjjy2)|zjjy2.txn_amt]) as sum_2_amt\n    ,apoc.coll.sum([zjjy3 in collect(distinct zjjy3)|zjjy3.txn_amt]) as sum_3_amt\n\t,apoc.coll.sum([zjjy4 in collect(distinct zjjy3)|zjjy4.txn_amt]) as sum_4_amt\n\t,jg,fk,acc1,zjjy1,acc2,zjjy2,acc3,zjjy3,acc4,zjjy4,acc5,gl,jy_amt,model_param_n_start,model_param_n_end\nwhere (sum_1_amt >= model_param_n_start*txn_pnp_amt and sum_1_amt <= model_param_n_end*txn_pnp_amt) \n\tand (sum_2_amt >= model_param_n_start*txn_pnp_amt and sum_2_amt <= model_param_n_end*txn_pnp_amt) \n\tand (sum_3_amt >= model_param_n_start*txn_pnp_amt and sum_3_amt <= model_param_n_end*txn_pnp_amt) \n\tand (sum_4_amt >= model_param_n_start*txn_pnp_amt and sum_4_amt <= model_param_n_end*txn_pnp_amt) \nreturn \n\tjg.ln_ar_id as ln_ar_id\n\t\n\t,fk.object_key          \tas\t\tfk_object_key        \n\t,fk.from_key            \tas\t\tfk_from_key          \n\t,fk.to_key              \tas\t\tfk_to_key        \n\t,''     \t\t\t  \t\tas\t\tfk_orig_txn_run_nbr  \n\t,''     \t\t\t  \t\tas\t\tfk_sub_txn_run_nbr \n\t,fk.dmd_dep_ar_id        \tas\t\tfk_dmd_dep_ar_id     \n\t,fk.txn_dt               \tas\t\tfk_txn_dt            \n\t,fk.rprg_ou_ip_id        \tas\t\tfk_rprg_ou_ip_id     \n\t,fk.vchr_tp_code         \tas\t\tfk_vchr_tp_code      \n\t,fk.ctpt_ar_id           \tas\t\tfk_ctpt_ar_id        \n\t,fk.int_clcn_eff_dt      \tas\t\tfk_int_clcn_eff_dt   \n\t,fk.txn_tp_id            \tas\t\tfk_txn_tp_id         \n\t,fk.cash_tfr_ind         \tas\t\tfk_cash_tfr_ind      \n\t,fk.dnmn_ccy_id          \tas\t\tfk_dnmn_ccy_id       \n\t,fk.txn_cnl_tp_id        \tas\t\tfk_txn_cnl_tp_id     \n\t,fk.csh_rmit_ind_tp_id   \tas\t\tfk_csh_rmit_ind_tp_id\n\t,fk.vchr_no              \tas\t\tfk_vchr_no           \n\t,fk.txn_tlr_id           \tas\t\tfk_txn_tlr_id        \n\t,fk.db_cr_ind            \tas\t\tfk_db_cr_ind         \n\t,fk.txn_ou_ip_id         \tas\t\tfk_txn_ou_ip_id      \n\t,fk.txn_pnp_amt          \tas\t\tfk_txn_pnp_amt  \t\n\t,fk.abs_code             \tas\t\tfk_abs_code          \n\t,fk.txn_code             \tas\t\tfk_txn_code          \n\t,fk.abs_dsc              \tas\t\tfk_abs_dsc           \n\t,fk.txn_tm               \tas\t\tfk_txn_tm                 \n\t,fk.dt                   \tas\t\tfk_dt                \n\t\n\t,zjjy1.object_key            as\t\tzjjy1_object_key        \n\t,zjjy1.from_key              as\t\tzjjy1_from_key          \n\t,zjjy1.to_key                as\t\tzjjy1_to_key            \n\t,zjjy1.orig_txn_run_nbr      as\t\tzjjy1_orig_txn_run_nbr  \n\t,zjjy1.sub_txn_run_nbr       as\t\tzjjy1_sub_txn_run_nbr   \n\t,zjjy1.dmd_dep_ar_id         as\t\tzjjy1_dmd_dep_ar_id     \n\t,zjjy1.txn_dt                as\t\tzjjy1_txn_dt            \n\t,zjjy1.rprg_ou_ip_id         as\t\tzjjy1_rprg_ou_ip_id     \n\t,zjjy1.vchr_tp_code          as\t\tzjjy1_vchr_tp_code      \n\t,zjjy1.ctpt_ar_id            as\t\tzjjy1_ctpt_ar_id        \n\t,zjjy1.int_clcn_eff_dt       as\t\tzjjy1_int_clcn_eff_dt   \n\t,zjjy1.txn_tp_id             as\t\tzjjy1_txn_tp_id         \n\t,zjjy1.cash_tfr_ind          as\t\tzjjy1_cash_tfr_ind      \n\t,zjjy1.dnmn_ccy_id           as\t\tzjjy1_dnmn_ccy_id       \n\t,zjjy1.txn_cnl_tp_id         as\t\tzjjy1_txn_cnl_tp_id     \n\t,zjjy1.csh_rmit_ind_tp_id    as\t\tzjjy1_csh_rmit_ind_tp_id\n\t,zjjy1.vchr_no               as\t\tzjjy1_vchr_no           \n\t,zjjy1.txn_tlr_id            as\t\tzjjy1_txn_tlr_id        \n\t,zjjy1.db_cr_ind             as\t\tzjjy1_db_cr_ind         \n\t,zjjy1.txn_ou_ip_id          as\t\tzjjy1_txn_ou_ip_id      \n\t,zjjy1.txn_amt               as\t\tzjjy1_txn_amt           \n\t,zjjy1.abs_code              as\t\tzjjy1_abs_code          \n\t,zjjy1.txn_code              as\t\tzjjy1_txn_code          \n\t,zjjy1.abs_dsc               as\t\tzjjy1_abs_dsc           \n\t,zjjy1.txn_tm                as\t\tzjjy1_txn_tm               \n\t,zjjy1.dt                    as\t\tzjjy1_dt  \n\t\n\t,zjjy2.object_key            as\t\tzjjy2_object_key        \n\t,zjjy2.from_key              as\t\tzjjy2_from_key          \n\t,zjjy2.to_key                as\t\tzjjy2_to_key            \n\t,zjjy2.orig_txn_run_nbr      as\t\tzjjy2_orig_txn_run_nbr  \n\t,zjjy2.sub_txn_run_nbr       as\t\tzjjy2_sub_txn_run_nbr   \n\t,zjjy2.dmd_dep_ar_id         as\t\tzjjy2_dmd_dep_ar_id     \n\t,zjjy2.txn_dt                as\t\tzjjy2_txn_dt            \n\t,zjjy2.rprg_ou_ip_id         as\t\tzjjy2_rprg_ou_ip_id     \n\t,zjjy2.vchr_tp_code          as\t\tzjjy2_vchr_tp_code      \n\t,zjjy2.ctpt_ar_id            as\t\tzjjy2_ctpt_ar_id        \n\t,zjjy2.int_clcn_eff_dt       as\t\tzjjy2_int_clcn_eff_dt   \n\t,zjjy2.txn_tp_id             as\t\tzjjy2_txn_tp_id         \n\t,zjjy2.cash_tfr_ind          as\t\tzjjy2_cash_tfr_ind      \n\t,zjjy2.dnmn_ccy_id           as\t\tzjjy2_dnmn_ccy_id       \n\t,zjjy2.txn_cnl_tp_id         as\t\tzjjy2_txn_cnl_tp_id     \n\t,zjjy2.csh_rmit_ind_tp_id    as\t\tzjjy2_csh_rmit_ind_tp_id\n\t,zjjy2.vchr_no               as\t\tzjjy2_vchr_no           \n\t,zjjy2.txn_tlr_id            as\t\tzjjy2_txn_tlr_id        \n\t,zjjy2.db_cr_ind             as\t\tzjjy2_db_cr_ind         \n\t,zjjy2.txn_ou_ip_id          as\t\tzjjy2_txn_ou_ip_id      \n\t,zjjy2.txn_amt               as\t\tzjjy2_txn_amt           \n\t,zjjy2.abs_code              as\t\tzjjy2_abs_code          \n\t,zjjy2.txn_code              as\t\tzjjy2_txn_code          \n\t,zjjy2.abs_dsc               as\t\tzjjy2_abs_dsc           \n\t,zjjy2.txn_tm                as\t\tzjjy2_txn_tm             \n\t,zjjy2.dt                    as\t\tzjjy2_dt  \n\t\n\t,zjjy3.object_key            as\t\tzjjy3_object_key        \n\t,zjjy3.from_key              as\t\tzjjy3_from_key          \n\t,zjjy3.to_key                as\t\tzjjy3_to_key            \n\t,zjjy3.orig_txn_run_nbr      as\t\tzjjy3_orig_txn_run_nbr  \n\t,zjjy3.sub_txn_run_nbr       as\t\tzjjy3_sub_txn_run_nbr   \n\t,zjjy3.dmd_dep_ar_id         as\t\tzjjy3_dmd_dep_ar_id     \n\t,zjjy3.txn_dt                as\t\tzjjy3_txn_dt            \n\t,zjjy3.rprg_ou_ip_id         as\t\tzjjy3_rprg_ou_ip_id     \n\t,zjjy3.vchr_tp_code          as\t\tzjjy3_vchr_tp_code      \n\t,zjjy3.ctpt_ar_id            as\t\tzjjy3_ctpt_ar_id        \n\t,zjjy3.int_clcn_eff_dt       as\t\tzjjy3_int_clcn_eff_dt   \n\t,zjjy3.txn_tp_id             as\t\tzjjy3_txn_tp_id         \n\t,zjjy3.cash_tfr_ind          as\t\tzjjy3_cash_tfr_ind      \n\t,zjjy3.dnmn_ccy_id           as\t\tzjjy3_dnmn_ccy_id       \n\t,zjjy3.txn_cnl_tp_id         as\t\tzjjy3_txn_cnl_tp_id     \n\t,zjjy3.csh_rmit_ind_tp_id    as\t\tzjjy3_csh_rmit_ind_tp_id\n\t,zjjy3.vchr_no               as\t\tzjjy3_vchr_no           \n\t,zjjy3.txn_tlr_id            as\t\tzjjy3_txn_tlr_id        \n\t,zjjy3.db_cr_ind             as\t\tzjjy3_db_cr_ind         \n\t,zjjy3.txn_ou_ip_id          as\t\tzjjy3_txn_ou_ip_id      \n\t,zjjy3.txn_amt               as\t\tzjjy3_txn_amt           \n\t,zjjy3.abs_code              as\t\tzjjy3_abs_code          \n\t,zjjy3.txn_code              as\t\tzjjy3_txn_code          \n\t,zjjy3.abs_dsc               as\t\tzjjy3_abs_dsc           \n\t,zjjy3.txn_tm                as\t\tzjjy3_txn_tm              \n\t,zjjy3.dt                    as\t\tzjjy3_dt \n\t\n\t,zjjy4.object_key            as\t\tzjjy4_object_key        \n\t,zjjy4.from_key              as\t\tzjjy4_from_key          \n\t,zjjy4.to_key                as\t\tzjjy4_to_key            \n\t,zjjy4.orig_txn_run_nbr      as\t\tzjjy4_orig_txn_run_nbr  \n\t,zjjy4.sub_txn_run_nbr       as\t\tzjjy4_sub_txn_run_nbr   \n\t,zjjy4.dmd_dep_ar_id         as\t\tzjjy4_dmd_dep_ar_id     \n\t,zjjy4.txn_dt                as\t\tzjjy4_txn_dt            \n\t,zjjy4.rprg_ou_ip_id         as\t\tzjjy4_rprg_ou_ip_id     \n\t,zjjy4.vchr_tp_code          as\t\tzjjy4_vchr_tp_code      \n\t,zjjy4.ctpt_ar_id            as\t\tzjjy4_ctpt_ar_id        \n\t,zjjy4.int_clcn_eff_dt       as\t\tzjjy4_int_clcn_eff_dt   \n\t,zjjy4.txn_tp_id             as\t\tzjjy4_txn_tp_id         \n\t,zjjy4.cash_tfr_ind          as\t\tzjjy4_cash_tfr_ind      \n\t,zjjy4.dnmn_ccy_id           as\t\tzjjy4_dnmn_ccy_id       \n\t,zjjy4.txn_cnl_tp_id         as\t\tzjjy4_txn_cnl_tp_id     \n\t,zjjy4.csh_rmit_ind_tp_id    as\t\tzjjy4_csh_rmit_ind_tp_id\n\t,zjjy4.vchr_no               as\t\tzjjy4_vchr_no           \n\t,zjjy4.txn_tlr_id            as\t\tzjjy4_txn_tlr_id        \n\t,zjjy4.db_cr_ind             as\t\tzjjy4_db_cr_ind         \n\t,zjjy4.txn_ou_ip_id          as\t\tzjjy4_txn_ou_ip_id      \n\t,zjjy4.txn_amt               as\t\tzjjy4_txn_amt           \n\t,zjjy4.abs_code              as\t\tzjjy4_abs_code          \n\t,zjjy4.txn_code              as\t\tzjjy4_txn_code          \n\t,zjjy4.abs_dsc               as\t\tzjjy4_abs_dsc           \n\t,zjjy4.txn_tm                as\t\tzjjy4_txn_tm               \n\t,zjjy4.dt                    as\t\tzjjy4_dt \n\t\n\t,gl.relation_name            as\t\trelation_name\n\t,gl.gl_from_key              as\t\tgl_from_key\n\t,gl.gl_to_key                as\t\tgl_to_key\n\t\n\t,acc1.dmd_dep_ar_id as acc_start\n\t,acc5.dmd_dep_ar_id as acc_end\n\t\n\t,acc1.prim_cst_id as prim_cst_id_start\n\t,acc5.prim_cst_id as prim_cst_id_end \n;";
//        content = "match(a:irmp_fund_flow_model_es)\nwhere a.model_child_code = '0102' //对公\nwith a.model_param_m as txn_pnp_amt //放款/还款金额起点M\n,a.model_param_p as jy_amt //交易金额大于20000\n,a.model_param_n_start as model_param_n_start //应用:比例范围起点\n,a.model_param_n_end as model_param_n_end //应用:比例范围终点\n,a.model_param_x as model_param_x //放款7天内\nmatch (jg:loan_acct_info_ads)-[fk:loan_acc_txn_rel]->(acc1:accounter_info_ads)-[zjjy1:large_amt_acc_txn_rel]->(acc2:accounter_info_ads)-[zjjy2:large_amt_acc_txn_rel]->(acc3:accounter_info_ads)\nwhere acc1.cor_per_logo = '2' \n\tand fk.txn_pnp_amt >= 500000.0 //txn_pnp_amt\n\tand zjjy1.txn_amt >= 20000.0 //jy_amt\n\tand zjjy2.txn_amt >= 20000.0 //jy_amt\n\t//  and fk.txn_tm > 0 \n\tand acc1.prim_cst_id = acc3.prim_cst_id \n\tand zjjy1.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > fk.txn_tm \n\tand zjjy2.txn_tm > zjjy1.txn_tm \n\tand zjjy1.txn_tm < fk.txn_tm + 604800000 \n\tand zjjy2.txn_tm < fk.txn_tm + 604800000 \nwith \n\tfk.txn_pnp_amt as txn_pnp_amt\n\t,apoc.coll.sum([zjjy1 in collect(distinct zjjy1)|zjjy1.txn_amt]) as sum_1_amt\n\t,apoc.coll.sum([zjjy2 in collect(distinct zjjy2)|zjjy2.txn_amt]) as sum_2_amt\n\t,jg,fk,acc1,zjjy1,acc2,zjjy2,acc3 ,jy_amt,model_param_n_start,model_param_n_end\nwhere (sum_1_amt >= model_param_n_start*txn_pnp_amt and sum_1_amt <= model_param_n_end*txn_pnp_amt) \n\tand (sum_2_amt >= model_param_n_start*txn_pnp_amt and sum_2_amt <= model_param_n_end*txn_pnp_amt) \nreturn \n\tjg.ln_ar_id \t\tas ln_ar_id\n\t\n\t,fk.object_key          \tas\t\tfk_object_key        \n\t,fk.from_key            \tas\t\tfk_from_key          \n\t,fk.to_key              \tas\t\tfk_to_key        \n\t,''     \t\t\t  \t\tas\t\tfk_orig_txn_run_nbr  \n\t,''     \t\t\t  \t\tas\t\tfk_sub_txn_run_nbr \n\t,fk.dmd_dep_ar_id        \tas\t\tfk_dmd_dep_ar_id     \n\t,fk.txn_dt               \tas\t\tfk_txn_dt            \n\t,fk.rprg_ou_ip_id        \tas\t\tfk_rprg_ou_ip_id     \n\t,fk.vchr_tp_code         \tas\t\tfk_vchr_tp_code      \n\t,fk.ctpt_ar_id           \tas\t\tfk_ctpt_ar_id        \n\t,fk.int_clcn_eff_dt      \tas\t\tfk_int_clcn_eff_dt   \n\t,fk.txn_tp_id            \tas\t\tfk_txn_tp_id         \n\t,fk.cash_tfr_ind         \tas\t\tfk_cash_tfr_ind      \n\t,fk.dnmn_ccy_id          \tas\t\tfk_dnmn_ccy_id       \n\t,fk.txn_cnl_tp_id        \tas\t\tfk_txn_cnl_tp_id     \n\t,fk.csh_rmit_ind_tp_id   \tas\t\tfk_csh_rmit_ind_tp_id\n\t,fk.vchr_no              \tas\t\tfk_vchr_no           \n\t,fk.txn_tlr_id           \tas\t\tfk_txn_tlr_id        \n\t,fk.db_cr_ind            \tas\t\tfk_db_cr_ind         \n\t,fk.txn_ou_ip_id         \tas\t\tfk_txn_ou_ip_id      \n\t,fk.txn_pnp_amt          \tas\t\tfk_txn_pnp_amt  \t\n\t,fk.abs_code             \tas\t\tfk_abs_code          \n\t,fk.txn_code             \tas\t\tfk_txn_code          \n\t,fk.abs_dsc              \tas\t\tfk_abs_dsc           \n\t,fk.txn_tm               \tas\t\tfk_txn_tm                  \n\t,fk.dt                   \tas\t\tfk_dt                \n\t\n\t,zjjy1.object_key            as\t\tzjjy1_object_key        \n\t,zjjy1.from_key              as\t\tzjjy1_from_key          \n\t,zjjy1.to_key                as\t\tzjjy1_to_key            \n\t,zjjy1.orig_txn_run_nbr      as\t\tzjjy1_orig_txn_run_nbr  \n\t,zjjy1.sub_txn_run_nbr       as\t\tzjjy1_sub_txn_run_nbr   \n\t,zjjy1.dmd_dep_ar_id         as\t\tzjjy1_dmd_dep_ar_id     \n\t,zjjy1.txn_dt                as\t\tzjjy1_txn_dt            \n\t,zjjy1.rprg_ou_ip_id         as\t\tzjjy1_rprg_ou_ip_id     \n\t,zjjy1.vchr_tp_code          as\t\tzjjy1_vchr_tp_code      \n\t,zjjy1.ctpt_ar_id            as\t\tzjjy1_ctpt_ar_id        \n\t,zjjy1.int_clcn_eff_dt       as\t\tzjjy1_int_clcn_eff_dt   \n\t,zjjy1.txn_tp_id             as\t\tzjjy1_txn_tp_id         \n\t,zjjy1.cash_tfr_ind          as\t\tzjjy1_cash_tfr_ind      \n\t,zjjy1.dnmn_ccy_id           as\t\tzjjy1_dnmn_ccy_id       \n\t,zjjy1.txn_cnl_tp_id         as\t\tzjjy1_txn_cnl_tp_id     \n\t,zjjy1.csh_rmit_ind_tp_id    as\t\tzjjy1_csh_rmit_ind_tp_id\n\t,zjjy1.vchr_no               as\t\tzjjy1_vchr_no           \n\t,zjjy1.txn_tlr_id            as\t\tzjjy1_txn_tlr_id        \n\t,zjjy1.db_cr_ind             as\t\tzjjy1_db_cr_ind         \n\t,zjjy1.txn_ou_ip_id          as\t\tzjjy1_txn_ou_ip_id      \n\t,zjjy1.txn_amt               as\t\tzjjy1_txn_amt           \n\t,zjjy1.abs_code              as\t\tzjjy1_abs_code          \n\t,zjjy1.txn_code              as\t\tzjjy1_txn_code          \n\t,zjjy1.abs_dsc               as\t\tzjjy1_abs_dsc           \n\t,zjjy1.txn_tm                as\t\tzjjy1_txn_tm                \n\t,zjjy1.dt                    as\t\tzjjy1_dt  \n\t\n\t,zjjy2.object_key            as\t\tzjjy2_object_key        \n\t,zjjy2.from_key              as\t\tzjjy2_from_key          \n\t,zjjy2.to_key                as\t\tzjjy2_to_key            \n\t,zjjy2.orig_txn_run_nbr      as\t\tzjjy2_orig_txn_run_nbr  \n\t,zjjy2.sub_txn_run_nbr       as\t\tzjjy2_sub_txn_run_nbr   \n\t,zjjy2.dmd_dep_ar_id         as\t\tzjjy2_dmd_dep_ar_id     \n\t,zjjy2.txn_dt                as\t\tzjjy2_txn_dt            \n\t,zjjy2.rprg_ou_ip_id         as\t\tzjjy2_rprg_ou_ip_id     \n\t,zjjy2.vchr_tp_code          as\t\tzjjy2_vchr_tp_code      \n\t,zjjy2.ctpt_ar_id            as\t\tzjjy2_ctpt_ar_id        \n\t,zjjy2.int_clcn_eff_dt       as\t\tzjjy2_int_clcn_eff_dt   \n\t,zjjy2.txn_tp_id             as\t\tzjjy2_txn_tp_id         \n\t,zjjy2.cash_tfr_ind          as\t\tzjjy2_cash_tfr_ind      \n\t,zjjy2.dnmn_ccy_id           as\t\tzjjy2_dnmn_ccy_id       \n\t,zjjy2.txn_cnl_tp_id         as\t\tzjjy2_txn_cnl_tp_id     \n\t,zjjy2.csh_rmit_ind_tp_id    as\t\tzjjy2_csh_rmit_ind_tp_id\n\t,zjjy2.vchr_no               as\t\tzjjy2_vchr_no           \n\t,zjjy2.txn_tlr_id            as\t\tzjjy2_txn_tlr_id        \n\t,zjjy2.db_cr_ind             as\t\tzjjy2_db_cr_ind         \n\t,zjjy2.txn_ou_ip_id          as\t\tzjjy2_txn_ou_ip_id      \n\t,zjjy2.txn_amt               as\t\tzjjy2_txn_amt           \n\t,zjjy2.abs_code              as\t\tzjjy2_abs_code          \n\t,zjjy2.txn_code              as\t\tzjjy2_txn_code          \n\t,zjjy2.abs_dsc               as\t\tzjjy2_abs_dsc           \n\t,zjjy2.txn_tm                as\t\tzjjy2_txn_tm               \n\t,zjjy2.dt                    as\t\tzjjy2_dt  \n\t\n\t,'自己名下账户' \t\t\t\tas   \trelation_name,\n    '' \t\t\t\t\t\t\tas \t\tgl_from_key,\n    '' \t\t\t\t\t\t\tas \t\tgl_to_key,\n\t\t\t\t\t\n    acc1.dmd_dep_ar_id \t\t\tas \t\tacc_start,\n    acc3.dmd_dep_ar_id \t\t\tas \t\tacc_end,\n\t\t\t\t\t\n\tacc1.prim_cst_id \t\t\tas \t\tprim_cst_id_start,\n\tacc3.prim_cst_id \t\t\tas \t\tprim_cst_id_end \n;";
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
