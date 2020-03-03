grammar LabeledExpr ;
import CommonLexerRules ;

prog : stat+ ;

stat : expr NEWLINE #printExpr
    | ID '=' expr NEWLINE #assign
    | NEWLINE #blank
    ;

expr: expr '*' expr #Mul
    | expr '/' expr #Div
    | expr '+' expr #Add
    | expr '-' expr #Sub
    | INT #int
    | ID #id
    | '(' expr ')' #parens
    ;
