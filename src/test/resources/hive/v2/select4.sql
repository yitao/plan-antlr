select name as company_name,
       date(dat) as dd,
       if(normal_name rlike "(分公司|分行|支行|支公司|委员会|）)$",name,normal_name) as company_name_normal,
       cast(similarity as string),
       cast(group_name as string) as group_name,
       cast (date1 as date ) as date1
from kip_tmp_test1.1111slot_node_companynormal;