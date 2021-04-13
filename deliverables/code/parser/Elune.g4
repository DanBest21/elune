/*
Adapted from Lua.g4 by Kazunori Sakamoto and Alexander Alexeev.
=========================================================================================================
BSD License
Copyright (c) 2013, Kazunori Sakamoto
Copyright (c) 2016, Alexander Alexeev
All rights reserved.
Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:
1. Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
2. Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
3. Neither the NAME of Rainer Schuster nor the NAMEs of its contributors
   may be used to endorse or promote products derived from this software
   without specific prior written permission.
THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
This grammar file derived from:
    Lua 5.3 Reference Manual
    http://www.lua.org/manual/5.3/manual.html
    Lua 5.2 Reference Manual
    http://www.lua.org/manual/5.2/manual.html
    Lua 5.1 grammar written by Nicolai Mainiero
    http://www.antlr3.org/grammar/1178608849736/Lua.g
Tested by Kazunori Sakamoto with Test suite for Lua 5.2 (http://www.lua.org/tests/5.2/)
Tested by Alexander Alexeev with Test suite for Lua 5.3 http://www.lua.org/tests/lua-5.3.2-tests.tar.gz
=========================================================================================================
*/

grammar Elune;

root
    : importdef* block EOF
    ;

block
    : stat* retstat?
    ;

stat
    : ';'                                                                               #sep
    | 'global' varlist '=' explist                                                      #globalVar
    | varlist '=' explist                                                               #var
    | functioncall                                                                      #functioncall_
    | label                                                                             #statLabel
    | 'break'                                                                           #break
    | 'continue'                                                                        #continue
    | 'goto' NAME                                                                       #goto
    | 'do' '{' block '}'                                                                #do
    | 'while' exp '{' block '}'                                                         #while
    | 'do' '{' block '}' 'while' exp                                                    #doWhile
    | ifStmt elseIfStmt* elseStmt?                                                      #ifElse
    | 'for' NAME '=' exp ',' exp (',' exp)? '{' block '}'                               #for
    | 'foreach' NAME 'in' explist '{' block '}'                                         #foreach
    | 'global' 'def' funcname funcbody                                                  #globalFunc
    | 'def' NAME funcbody                                                               #func
    | 'def' funcname funcbody                                                           #objFunc
    | attnamelist ('=' explist)?                                                        #att
    | 'switch' var_ '{' ('case' exp '{' block '}')+ ('default' '{' block '}')? '}'      #switch
    | tryStmt catchStmt finallyStmt?                                                    #tryCatch
    | 'throw' NAME                                                                      #exception
    | assignexp                                                                         #assign
    | 'print' '(' exp ')'                                                               #printBrackets
    | 'print' exp                                                                       #print
    ;

importdef
    : 'import' NAME                                                                     #importModule
//  | 'from' NAME 'import' NAME (',' NAME)*                                             #importFuncs
    ;

assignexp
    : var_ compoundassign exp
//  | NAME attrib compoundassign exp
    ;

compoundassign
    : '+=' | '-=' | '*=' | '/=' | '^=' | '%=' | '&=' | '|=' | '<<=' | '>>=' | '//='
    ;

attnamelist
    : NAME attrib (',' NAME attrib)*
    ;

attrib
    : ('<' NAME '>')?
    ;

retstat
    : 'return' explist? ';'?
    ;

label
    : '::' NAME '::'
    ;

funcname
    : NAME ('.' NAME)* (':' NAME)?
    ;

varlist
    : var_ (',' var_)*
    ;

namelist
    : anonOrName (',' anonOrName)*
    ;

explist
    : exp (',' exp)*
    ;

ifStmt
    : 'if' exp '{' block '}'
    ;

elseIfStmt
    : 'elseif' exp '{' block '}'
    ;

elseStmt
    : 'else' '{' block '}'
    ;

tryStmt
    : 'try' '{' block '}'
    ;

catchStmt
    : ('catch' NAME '{' block '}')+
    ;

finallyStmt
    : 'finally' '{' block '}'
    ;

exp
    : 'null'                                                                            #null
    | 'false'                                                                           #false
    | 'true'                                                                            #true
    | number                                                                            #number_
    | string                                                                            #string_
    | '...'                                                                             #allArgs
    | anondef                                                                           #anondef_
    | prefixexp                                                                         #prefixexp_
    | tableconstructor                                                                  #tableconstructor_
    | <assoc=right> exp operatorPower exp                                               #power
    | operatorUnary exp                                                                 #unary
    | 'length' '(' exp ')'                                                              #lengthBrackets
    | 'length' exp                                                                      #length
    | exp operatorMulDivMod exp                                                         #mulDivMod
    | exp operatorAddSub exp                                                            #addSub
    | <assoc=right> exp operatorStrcat exp                                              #concat
    | exp operatorComparison exp                                                        #compare
    | exp operatorAnd exp                                                               #and
    | exp operatorOr exp                                                                #or
    | exp operatorBitwise exp                                                           #bitwise
    | assignexp                                                                         #assignexp_
    ;

prefixexp
    : varOrExp nameAndArgs*
    ;

functioncall
    : varOrExp nameAndArgs+
    ;

varOrExp
    : var_                                                                              #var__
    | '(' exp ')'                                                                       #bracketsExp
    ;

var_
    : (NAME | '(' exp ')' varSuffix) varSuffix*
    ;

varSuffix
    : nameAndArgs* ('[' exp ']' | '.' NAME)
    ;

nameAndArgs
    : (':' NAME)? args
    ;

args
    : '(' explist? ')'                                                              #exprArgs
    | tableconstructor                                                              #tableconstructorArgs
    | string                                                                        #stringArgs
    ;

anondef
    : 'lambda' anonlist? '{' block '}'
    ;

anonlist
    : NAME+
    ;

anonOrName
    : NAME                                                                          #name
    | anondef                                                                       #anondef__
    ;

funcbody
    : '(' parlist? ')' '{' block '}'
    ;

parlist
    : namelist (',' '...')? | '...'
    ;

tableconstructor
    : '[' fieldlist? ']'
    ;

fieldlist
    : field (fieldsep field)* fieldsep?
    ;

field
    : '(' exp ')' '=' exp                                                           #exprField
    | NAME '=' exp                                                                  #varField
    | exp                                                                           #indexedField
    ;

fieldsep
    : ',' | ';'
    ;

operatorOr
	: 'or' | '||';

operatorAnd
	: 'and' | '&&';

operatorComparison
	: '<' | '>' | '<=' | '>=' | '!=' | '==' | 'is';

operatorStrcat
	: '++';

operatorAddSub
	: '+' | '-';

operatorMulDivMod
	: '*' | '/' | '%' | '//';

operatorBitwise
	: '&' | '|' | '~' | '<<' | '>>';

operatorUnary
    : 'not' | '-' | '~';

operatorPower
    : '^';

number
    : INT                                                                           #int
    | HEX                                                                           #hex
    | FLOAT                                                                         #float
    | HEX_FLOAT                                                                     #hexFloat
    ;

string
    : NORMALSTRING | CHARSTRING | LONGSTRING
    ;

// LEXER

NAME
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

NORMALSTRING
    : '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

CHARSTRING
    : '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

LONGSTRING
    : '[' NESTED_STR ']'
    ;

fragment
NESTED_STR
    : '=' NESTED_STR '='
    | '[' .*? ']'
    ;

INT
    : Digit+
    ;

HEX
    : '0' [xX] HexDigit+
    ;

FLOAT
    : Digit+ '.' Digit* ExponentPart?
    | '.' Digit+ ExponentPart?
    | Digit+ ExponentPart
    ;

HEX_FLOAT
    : '0' [xX] HexDigit+ '.' HexDigit* HexExponentPart?
    | '0' [xX] '.' HexDigit+ HexExponentPart?
    | '0' [xX] HexDigit+ HexExponentPart
    ;

fragment
ExponentPart
    : [eE] [+-]? Digit+
    ;

fragment
HexExponentPart
    : [pP] [+-]? Digit+
    ;

fragment
EscapeSequence
    : '\\' [abfnrtvz"'\\]
    | '\\' '\r'? '\n'
    | DecimalEscape
    | HexEscape
    | UtfEscape
    ;
	
fragment
DecimalEscape
    : '\\' Digit
    | '\\' Digit Digit
    | '\\' [0-2] Digit Digit
    ;
	
fragment
HexEscape
    : '\\' 'x' HexDigit HexDigit
    ;
	
fragment
UtfEscape
    : '\\' 'u{' HexDigit+ '}'
    ;
	
fragment
Digit
    : [0-9]
    ;
	
fragment
HexDigit
    : [0-9a-fA-F]
    ;
	
COMMENT
    : '/*' .*? '*/' -> channel(HIDDEN)
    ;
	
LINE_COMMENT
    : '//'
    (                                               // --
    | '[' '='*                                      // --[==
    | '[' '='* ~('='|'['|'\r'|'\n') ~('\r'|'\n')*   // --[==AA
    | ~('['|'\r'|'\n') ~('\r'|'\n')*                // --AAA
    ) ('\r\n'|'\r'|'\n'|EOF)
    -> channel(HIDDEN)
    ;
	
WS
    : [ \t\u000C\r\n]+ -> skip
    ;
	
SHEBANG
    : '#' '!' ~('\n'|'\r')* -> channel(HIDDEN)
    ;