 ---------------------------重要说明---------------------------------------------------
 -- 一、 执行前提：
  --     ①  已安装好Oracle11g+服务，
  --     ②  使用dba用户登录oracle服务器
  -- 二、 创建用户过程:
 --  ① 创建用户，以用户名 graphary_dev 和密码 graphary_dev 为例,强烈建议客户自行修改。
      create user graphary_dev identified by graphary_dev;

 --  ② 给刚才创建的用户授权
      grant connect, resource to graphary_dev;
      grant create table to graphary_dev;

 --  ③刚才创建的用户授权默认命名空间
      alter user graphary_dev quota unlimited on users;

      COMMIT;