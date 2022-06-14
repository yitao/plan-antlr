
## Antlr 介绍

antlr4仓库
https://github.com/antlr/antlr4

语法仓库：
https://github.com/antlr/grammars-v4

HIVE SQL语法：（Hive 2.x.x grammar）
https://github.com/antlr/grammars-v4/tree/master/sql/hive


## LR(k)语法分析概念
LR中的：

    L表示对输入串进行从左到右扫描
    R表示最右推导的逆过程
    k表示最多向前看k个符号

当k的数量增大时，语法分析器的规模将急剧增大；

    k = 0时，向前看符号只有当前输入符
    k = 1时，向前看符号有当前输入符和FOLLOW(A)

FOLLOW(A)：向前看符号。针对文法，而不是针对输入串。

参考：https://blog.csdn.net/weixin_45427596/article/details/123955971

## 什么是LL(k) 
一种递归下降的分析方法。

第一个L表示从左往右。

第二个L表示最左匹配。

k表示向前看k个符号。

所谓向前看，是指向右看k个符号的内容，但不读入。


