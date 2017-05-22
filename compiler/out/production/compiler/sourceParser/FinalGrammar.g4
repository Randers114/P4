grammar FinalGrammar;


COMMENT :       '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
Num:            [0-9]+ ('.' [0-9]+)?;
Bool:           'true' | 'false';
Identifier:     ([a-zA-Z] | '_') [a-zA-Z0-9]*;
WS:             [ \t\r\n]+ -> skip;


program : designSpecificDcl* 'main' '{' body* '}' methods*;

body	: dcl ';' | stmt | call ';';

methods	: type 'Method' Identifier '(' fprmt? ')' '{' body* 'return' returnval ';' '}'
        | 'void' 'Method' Identifier '(' fprmt? ')' '{' body* '}';

dcl		: type Identifier '=' b
		| type Identifier
		| 'List' '[' type ']' Identifier;

stmt	: Identifier '=' b ';'
		| 'if' '(' b ')' 'then' '{' body* '}' elseif* elsel?
		| 'while' '(' b ')' 'do' '{' body* '}'
		| 'for' '(' (Num | Identifier) 'to' (Num | Identifier) ')' 'do' '{' body* '}'
		| 'Sleep' '('Num')' ';'
		| Identifier 'synchronize' Identifier Num? ';'
		| Identifier 'desynchronize' Identifier ';';

designSpecificDcl : instancedcl '[' (Identifier | Num) ']' Identifier ';';

call	: Identifier '(' prmt? ')'
		| Identifier '.' invoke;

type	: 'number'
        | 'bool';

fprmt	: type Identifier
        | type Identifier ',' fprmt;

returnval   : b;

val		: Num
        | Identifier
        | call
        | '-' expr
        | '(' b ')'
        ;

expr	: term '+' expr
        | term '-' expr
        | term
		;

term    : val '*' term
        | val '/' term
        | val;

b       : t 'and' b
        | t;
t       : f 'or' t
        | f;
f       : h boolop f
        | h;
h       : i boolvalop h
        | i;
i       : expr
        | Bool
        | 'not' b;

instancedcl	: 'Motor'
            | 'TouchSensor'
            | 'UltrasoundSensor';

elsel	: 'else' '{' body* '}';

elseif	: 'else' 'if' '(' b ')' 'then' '{' body* '}';

prmt	: b
        | b ',' prmt;

invoke	: motorInvoke
        | sensorInvoke
        | listInvoke;

boolvalop	: 'lessThan'
		| 'greaterThan'
		| 'equal'
		| 'greaterThanOrEqual'
		| 'lessThanOrEqual'
		| 'notEqual';

motorInvoke	: 'Forward' '(' expr ')'
            | 'Backward' '(' expr')'
            | 'ForwardSeconds' '(' expr ',' expr ')'
            | 'BackwardSeconds' '(' expr ',' expr ')'
            | 'Stop' '(' ')';

sensorInvoke: 'isPressed' | 'distance';

listInvoke	: 'Add' '(' b ')'
            | 'Remove' '(' expr ')'
            | 'Length' '(' ')';


boolop	: 'equal'
		| 'notEqual';
