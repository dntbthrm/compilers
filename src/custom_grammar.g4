grammar custom_grammar;

program: (statement)* EOF;

// операторы с доп. циклом for
statement
	: var_decl
	| assign
	| if_state
	| while_loop
	| for_loop
	| printer
	| comment
	;

// объявление переменных
var_decl
	: (INT | BOOL) ID (ASSIGN expression)? ENDLINE
	;

// присваивание
assign
	: ID ASSIGN expression ENDLINE
	;

// оператор if (с elif и else)
if_state
	: IF L_ROUND expression R_ROUND f_block (ELIF L_ROUND expression R_ROUND f_block)? (ELSE f_block)?
	;

// цикл while 
while_loop
	: WHILE L_ROUND expression R_ROUND f_block
	;

// цикл for
for_loop
	: FOR L_ROUND assign expression ENDLINE assign R_ROUND f_block
	;

// блок кода
f_block
	: L_SQ statement* R_SQ
	;

// вывод в консоль (поддерживает строки, числа, переменные, булевы значения)
printer
	: PRINTER L_ROUND printer_argument (COMMA printer_argument)* R_ROUND ENDLINE
	;

// аргументы для printer
printer_argument
	: STRING
	| ID
	| NUMBER
	| BOOL_VALUE
	;

// выражения
expression
     : NOT expression 
	 | L_ROUND expression R_ROUND
	 | expression (MULT | DIV | MOD) expression
	 | expression AND expression 
	 | expression (PLUS | MINUS) expression
	 | expression OR expression  
     | expression (LESS | GEQ | EQ | NEQ) expression
	 | BOOL_VALUE                                                                                         
     | ID                                                              
     | NUMBER                                                                                                                                                                           
     ;

comment 
	: COMMENT
	;

// токены

// ключевые слова
IF      : 'if';
ELIF    : 'elif';
ELSE    : 'else';
WHILE   : 'while';
FOR     : 'for';
PRINTER : 'printer';

// типы данных
INT     : 'integer';
BOOL    : 'boolean';

// операторы
ASSIGN  : '=';
PLUS    : '+';
MINUS   : '-';
MULT    : '*';
DIV     : '/';
MOD     : '%';
AND     : '&&';
OR      : '||';
NOT     : '!';

// операторы сравнения
LESS     : '<';      
GEQ      : '>=';    
EQ       : '==';   
NEQ      : '!=';   

// скобки и разделители
L_ROUND  : '(';
R_ROUND  : ')';
L_SQ     : '{';
R_SQ     : '}';
ENDLINE  : ';';
COMMA    : ',';

// многострочные комментарии
COMMENT : '/*' .*? '*/';

// идентификаторы, строки и числа
ID      : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER  : [0-9]+;
STRING  : '"' (~["])* '"';
BOOL_VALUE : '(true)' | '(false)'; 

// пробелы и переносы строк
WS      : [ \t\r\n]+ -> skip;
