grammar FinalGrammar;

Num: [0-9]+ ('.' [0-9]+)?;
Identifier: ([a-zA-Z] | '_') [a-zA-Z0-9]*;
Bool: 'true' | 'false';
WS: [ \t\r\n]+ -> skip;


program : 'main' '{' body* '}' methods*;

body	: dcl ';' | stmt | call ';';

methods	: type 'Method' Identifier '(' fprmt? ')' '{' body* 'return' returnval ';' '}'
        | 'void' 'Method' Identifier '(' fprmt? ')' '{' body* '}';

dcl		: type Identifier '=' expr
		| type Identifier '=' r_boolean
		| type Identifier
		| 'new' instancedcl '[' Identifier ']' Identifier;

stmt	: Identifier '=' expr
		| 'if' '(' r_boolean ')' 'then' '{' body* '}' elseif* elsel?
		| 'while' '(' r_boolean ')' 'do' '{' body* '}'
		| 'for' '(' Num 'to' Num ')' 'do' '{' body* '}';

call	: Identifier '(' prmt? ')'
		| Identifier '.' statid '(' prmt? ')';

type	: 'number'
        | 'bool';

fprmt	: type Identifier
        | type Identifier ',' fprmt;

returnval   : expr
            | boolexpr;

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

r_boolean   : call
		    | 'not'? Identifier
		    | boolexpr
		    | expr boolvalop Identifier
		    | Identifier boolvalop expr;

instancedcl	: 'Motor'
            | 'Sensor'
            | 'List';

elsel	: 'else' '{' body* '}';

elseif	: 'else' 'if' '(' r_boolean ')' 'then' '{' body* '}';

prmt	: val
        | val ',' prmt;

statid	: statmotorid
        | statsensorid
        | statlistid;

boolexpr: expr boolvalop boolexpr
		| Bool boolop r_boolean
		| call boolop r_boolean
		| Identifier boolop r_boolean
		| 'not' Bool boolop r_boolean
		| 'not' call boolop r_boolean
		| 'not' Identifier boolop r_boolean;

boolvalop	: 'smallerThan'
		| 'greaterThan'
		| 'equal'
		| 'greaterThanOrEqual'
		| 'smallerThanOrEqual'
		| 'notEqual';

statmotorid	: 'motormethod';

statsensorid: 'sensormethod';

statlistid	: 'listmethod';


boolop	: 'equal'
		| 'notEqual'
		| 'and'
		| 'or';
