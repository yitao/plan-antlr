select name as company_name,
       if(normal_name rlike "(分公司|分行|支行|支公司|委员会|）)$",name,normal_name) as company_name_normal,
       cast(similarity as string),
       cast(group_name as string) as group_name
from kip_tmp_test1.slot_node_companynormal;