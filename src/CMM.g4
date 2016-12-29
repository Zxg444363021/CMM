grammar CMM;
program:stmt(stmt)*;
stmt:varDecl        #Svar
    |breakStmt      #Sbreak
    |assignStmt     #Sassign
    |readStmt       #Sread
    |writeStmt      #Swrite
    |ifStmt         #Sif
    |whileStmt      #Swhile
    |stmtBlock      #Sblock
    ;
varDecl:type varList';';
ifStmt:'if' '('expr')' stmt ('else' stmt )?;
whileStmt:'while' '('expr')' stmt;
breakStmt:'break'';';
assignStmt:value '=' expr';';
readStmt:'read''('value')'';';
writeStmt:'write''(' expr ')'';';
stmtBlock:'{' (stmt)* '}';
selfOpStmt:value op=('++'|'--')             #Before
          |op=('++'|'--') value             #After
          ;
//forStmt:for'('varDecl?';'expr?(','expr)*';'expr?(','expr?(','expr)')'

/*数据类型：包含int、double和数组类型*/
type:'int'                   #IntType
    |'double'               #DoubleType
    |'int' '['INT']'        #IntArr
    |'double' '['INT']'     #DoubleArr
    ;
/*声明变量时所用的变量名*/
varList:ID'='expr(',' ID'='expr)*        #hasValue
        |ID(','ID)*                       #noValue
        ;
/*使用变量时所用的变量名*/
value:ID '[' expr ']'      #aryId
     |ID                    #Id
     ;
/*常量*/
constant:INT                        #IntCon
        |DOUBLE                     #DoubleCon
        | 'true'                   #True
        | 'false'                  #False
        ;
expr:'('expr')'                       #parens
    |SUB expr                           #Neg
    |'!'expr                          #LogicNot
    |expr op=('*'|'/'|'%') expr       #MulDivMod
    |expr op=('+'|'-') expr            #AddSub
    |expr op=('<='|'<'|'>='|'>'|'!='|'==')expr  #Comp
    |expr op=('&&'|'||'|'&'|'|') expr  #LogicComp
    |value                             #Val
    |constant                          #Const
    ;

words:(KeyInt|KeyDouble|KeyIf|KeyElse|KeyWhile|KeyBreak|KeyRead|KeyWrite|KeyTrue
    |KeyFalse|LSB|RSB|LRB|RRB|LB|RB|ADD|SUB|MUL|DIV|REM|EQU|ASS|NEQU|GREATER|LESS
    |GOE|LOE|SEM|COM|INT|DOUBLE|ID|COMMENT)+;

//以下为关键字和操作符
KeyInt:'int';
KeyDouble:'double';
KeyIf:'if';
KeyElse:'else';
KeyWhile:'while';
KeyBreak:'break';
KeyRead:'read';
KeyWrite:'write';
KeyTrue:'true';
KeyFalse:'false';
LSB:'[';
RSB:']';
LRB:'(';
RRB:')';
LB:'{';
RB:'}';
ADD:'+';
SUB:'-';
MUL:'*';
DIV:'/';
REM:'%';
EQU:'==';
ASS:'=';
NEQU:'!=';
GREATER:'>';
LESS:'<';
GOE:'>=';
LOE:'<=';
SEM:';';
COM:',';
UNDERLINE:'_';
LogAnds:'&&';
LogOrs:'||';
LogAnd:'&';
LogOr:'|';
LogNot:'!';

fragment
     DIGIT:[0-9];
fragment
     ALPHA:[a-zA-Z];
INT:DIGIT
   |DIGIT[0-9]+
   |'O'[xX][0-9A-F]+
   ;
INT1:[1-9]
    |[1-9][0-9]+;
DOUBLE:[0-9]+'.'[0-9]*
      |'O'[xX][0-9A-Z]+'.'[0-9A-Z]*
      ;
ID:[a-zA-Z]([_a-zA-Z0-9]*[a-zA-Z0-9])*;

COMMENT:('/*'.*?'*/'
       |'//'~[\t\r\n]*)->channel(HIDDEN)
       ;  //将不需要关注的注释发送到隐藏通道中。

WS:[ \t\r\n]+->skip;
