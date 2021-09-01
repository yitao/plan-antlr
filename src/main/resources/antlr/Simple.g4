//simple grammar definition
grammar Simple;

//parser 定义
field_def:VAR BLANK+ IDENTIFIER BLANK* ENDER BLANK*;


//lexer 定义

//数字
fragment DIGIT:[0-9];
//字母
fragment LETTER:[a-zA-Z];

//忽略空白符
BLANK:[ \r\n\t];

ENDER:';';
VAR:'var';



//变量定义词法
IDENTIFIER
    : (LETTER | '_' | '$')+
    (LETTER | DIGIT | '_' | '$')*
    ;