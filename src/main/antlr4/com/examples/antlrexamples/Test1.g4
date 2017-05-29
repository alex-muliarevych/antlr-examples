grammar Test1;

expr
  : number
  | expr '+' expr
  | expr '*' expr
  | '(' expr ')'
  | 'pi'
  ;

number : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Whitespace: [ ] -> skip;