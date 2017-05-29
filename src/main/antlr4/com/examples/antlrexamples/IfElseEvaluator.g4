grammar IfElseEvaluator;

/* enforce each block to end with a return statement */

a_grammar
    :   if_statement EOF
    ;

if_statement
    :   'if' expression statement+ ( 'else' statement+ )?
    ;

statement
    :   if_statement
// other statements
    |   statement_block
    ;

statement_block
    :   '{' statement* return_statement '}'
    ;

return_statement
    :   'return' ( 'true' | 'false' )
    ;

expression // reduced to a strict minimum to answer the OP question
    :   atom
    |   atom '<=' atom
    |   '(' expression ')'
    ;

atom
    :   ID
    |   INT
    ;

ID
    : [a-zA-Z] [a-zA-Z_0-9]*
    | [0-9]+ [a-zA-Z_]+ [a-zA-Z_0-9]*
    ;

INT : [0-9]+ ;
WS  : [ \t\r\n] -> skip ;

 // Anything not recognized above will be an error
ErrChar
  : .
  ;