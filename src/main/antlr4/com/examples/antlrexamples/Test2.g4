grammar Test2;

expr
  : number        # num
  | expr '+' expr # add
  | expr '*' expr # mul
  | '(' expr ')'  # paren
  | 'pi'          # pi
  ;

number : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Whitespace: [ ] -> skip;