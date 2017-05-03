grammar FinalGrammar;

Num: [0-9]+ ('.' [0-9]+)?;
Bool: 'true' | 'false';
Identifier: ([a-zA-Z] | '_') [a-zA-Z0-9]*;
WS: [ \t\r\n]+ -> skip;


program : 'main' '{' body* '}' methods*;

body	: dcl ';' | stmt | call ';';

methods	: type 'Method' Identifier '(' fprmt? ')' '{' body* 'return' returnval ';' '}'
        | 'void' 'Method' Identifier '(' fprmt? ')' '{' body* '}';

dcl		: type Identifier '=' b
		| type Identifier
		| 'new' instancedcl '[' Identifier ']' Identifier;

stmt	: Identifier '=' b ';'
		| 'if' '(' b ')' 'then' '{' body* '}' elseif* elsel?
		| 'while' '(' b ')' 'do' '{' body* '}'
		| 'for' '(' (Num | Identifier) 'to' (Num | Identifier) ')' 'do' '{' body* '}';

call	: Identifier '(' prmt? ')'
		| Identifier '.' statid '(' prmt? ')';

type	: 'number'
        | 'bool';

fprmt	: type Identifier
        | type Identifier ',' fprmt;

returnval   : b;

val		: Num
        | Identifier
        | call
        | '-' expr
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
