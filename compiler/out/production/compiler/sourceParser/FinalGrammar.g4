grammar FinalGrammar;


COMMENT :       '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
Num:            [0-9]+ ('.' [0-9]+)?;
Bool:           'true' | 'false';
Identifier:     ([a-zA-Z] | '_') [a-zA-Z0-9]*;
WS:             [ \t\r\n]+ -> skip;


program : 'main' '{' body* '}' methods*;

body	: dcl ';' | stmt | call ';';

methods	: type 'Method' Identifier '(' fprmt? ')' '{' body* 'return' returnval ';' '}'
        | 'void' 'Method' Identifier '(' fprmt? ')' '{' body* '}';

dcl		: type Identifier '=' b
		| type Identifier
		| instancedcl '[' (Identifier | Num) ']' Identifier
		| 'List' '[' type ']' Identifier;

stmt	: Identifier '=' b ';'
		| 'if' '(' b ')' 'then' '{' body* '}' elseif* elsel?
		| 'while' '(' b ')' 'do' '{' body* '}'
		| 'for' '(' (Num | Identifier) 'to' (Num | Identifier) ')' 'do' '{' body* '}'
		| 'Sleep' '('Num')'
		| Identifier 'synchronize' Identifier Num? ';';

call	: Identifier '(' prmt? ')'
		| Identifier '.' statid;

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

statid	: statmotorid
        | statsensorid
        | statlistid;

boolvalop	: 'lessThan'
		| 'greaterThan'
		| 'equal'
		| 'greaterThanOrEqual'
		| 'lessThanOrEqual'
		| 'notEqual';

statmotorid	: 'Forward' '(' (Num | expr) ')'
            | 'Backwards' '(' (Num | expr)')'
            | 'ForwardSeconds' '(' (Num | expr) ',' (Num | expr) ')'
            | 'BackwardsSeconds' '(' (Num | expr) ',' (Num | expr) ')';

statsensorid: 'IsPressed()' | 'Distance()';

statlistid	: 'Add' '(' (call |  b) ')' | 'Remove' '(' Num ')';


boolop	: 'equal'
		| 'notEqual';
