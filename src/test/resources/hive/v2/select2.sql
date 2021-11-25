select
  distinct a._key, a.name, a.group_name, a.capital
  from (
    select
    split(_from, "/")[1] as _key, src_name as name, group_name, src_capital as capital
    from
    ${t1}
    where split(_from, "/")[0] = "Company"
    union all
    select
    split(_to, "/")[1] as _key, dst_name as name, group_name, dst_capital as capital
    from
    t1
    where split(_to, "/")[0] = "Company"
    ) a