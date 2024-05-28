//定义语法的名称
grammar Calculator;


//数字
DIGIT: [0-9];
DOT: '.';

//基本算术操作符
OP_MUL: '*';
OP_DIV: '/';
OP_ADD: '+';
OP_SUB: '-';

BASE_OP: OP_MUL | OP_DIV | OP_ADD | OP_SUB;

// 跳过空格、制表符、回车符和换行符
WS : [ \t\r\n]+ -> skip;

root : exp (BASE_OP exp)* ;
exp : value
    | value BASE_OP value
    | '(' exp ')'
    ;

value : DIGIT+  #integer
    | DIGIT+ DOT DIGIT+   #double
    ;