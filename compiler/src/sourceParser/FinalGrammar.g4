grammar FinalGrammar;

Num: [0-9]+ ('.' [0-9]+)?;
Bool: 'true' | 'false';
Identifier: ([a-zA-Z] | '_') [a-zA-Z0-9]*;
WS: [ \t\r\n]+ -> skip;


program : 'main' '{' body* '}' methods*;

body	: dcl ';' | stmt | call ';';

methods	: type 'Method' Identifier '(' fprmt? ')' '{' body* 'return' returnval ';' '}'
        | 'void' 'Method' Identifier '(' fprmt? ')' '{' body* '}';

dcl		: type Identifier '=' expr
		| type Identifier '=' b
		| type Identifier
		| 'new' instancedcl '[' Identifier ']' Identifier;

stmt	: Identifier '=' b ';'
        | Identifier '=' 'not' Identifier ';'
        | Identifier '=' expr boolvalop expr ';'
        | Identifier '=' Bool ';'
		| 'if' '(' b ')' 'then' '{' body* '}' elseif* elsel?
		| 'while' '(' b ')' 'do' '{' body* '}'
		| 'for' '(' (Num | Identifier) 'to' (Num | Identifier) ')' 'do' '{' body* '}';

call	: Identifier '(' prmt? ')'
		| Identifier '.' statid '(' prmt? ')';

type	: 'number'
        | 'bool';

fprmt	: type Identifier
        | type Identifier ',' fprmt;

returnval   : expr
            | b;

val		: Num
        | Identifier
        | call
        | '(' expr ')'
        | '-' expr
        ;

expr	: term '+' expr
        | term '-' expr
        | term
		;

term    : val '*' term
        | val '/' term
        | val;

b       : t boolvalop b
        | t;
t       : f boolop t
        | f;
f       : h 'or' f
        | h;
h       : i 'and' h
        | i;
i       : Num
        | expr
        | Bool
        | call
        | Identifier
        | '(' b ')'
        | 'not' b;

instancedcl	: 'Motor'
            | 'Sensor'
            | 'List';

elsel	: 'else' '{' body* '}';

elseif	: 'else' 'if' '(' b ')' 'then' '{' body* '}';

prmt	: val
        | val ',' prmt;

statid	: statmotorid
        | statsensorid
        | statlistid;

boolvalop	: 'lessThan'
		| 'greaterThan'
		| 'equal'
		| 'greaterThanOrEqual'
		| 'lessThanOrEqual'
		| 'notEqual';

statmotorid	: 'motormethod';

statsensorid: 'sensormethod';

statlistid	: 'listmethod';


boolop	: 'equal'
		| 'notEqual';
