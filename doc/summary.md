# 概念

* [简介](./md/introduction.md)
    

# 应用



* [简介](./md/introduction.md)

* [简介](./md/introduction.md)

[版本特性](./md/version_feature.md)

[语法介绍](./md/grammar.md)

* ![简介](./drawio/%E8%AF%AD%E6%B3%95%E6%A0%91%E4%BB%8B%E7%BB%8D.drawio.png)

# 是什么

能干嘛，概念

一个生成语法分析器的工具

语法分析扩展


# 怎么用

功能用法，把概念串起来
从简单到复杂，学而习之

1、写个简单的语法文件
2、把语法文件编译成目标编程语言的源文件
3、检查输入的内容是否符合语法定义

4、假定符合的情况下，如何获取语法中特定的内容（listener、visitor模式）
5、假定不符合的情况下，如何去定位异常的位置(error handler)


# 安装
下载antlr
你可以到 http://www.antlr.org/download.html 下载ANTLR的最新版本

验证是否能运行
java -jar ./lib/antlr-4.10.1-complete.jar
如果能正常出现以下内容则表示成功
```text
ANTLR Parser Generator  Version 4.10.1
 -o ___              specify output directory where all output is generated
 -lib ___            specify location of grammars, tokens files
```
由于下载的antlr版本不一样，需要配置相应版本的JDK，
比如说4.10.1需要的JDK是11及以上

# 测试语法


# 语法设计专题

# antlr的底层设计

# 类似工具对比
