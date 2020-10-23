import java_cup.runtime.Symbol;

%%
/*%cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char

LETRA = [a-zA-Z]>
DIGITO = [0-9]
ESPACIO = \t|\f
ID = {LETRA}({LETRA}|{DIGITO}|_)*

COMILLA = "

CONST_INT = {DIGITO}+
CONST_REAL = {DIGITO}*.{DIGITO}+
CONST_STRING = {COMILLA}({LETRA}|{DIGITO}|{ESPACIO})*{COMILLA}
COMENTARIO = </{CONST_STRING}/>|</{CONST_STRING}{COMENTARIO}/>

/* Para la funcion de nuestro grupo */
expresion = {expresion} + {termino}
expresion = {expresion} - {termino}
expresion = {termino}
termino   = {termino} * {factor}
termino   = {termino} / {factor}
termino   = {factor} 
factor    = {DIGITO}+



%%

<YYINITIAL> {

{ID}		    {System.out.println("Token ID encontrado, Lexema "+ yytext());}
{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}
{CONST_REAL}    {System.out.println("Token CONST_REAL, encontrado Lexema "+ yytext());}
{CONST_STRING}  {System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());}

":="		{System.out.println("Token ASIGN encontrado, Lexema "+ yytext());}
"WHILE" {System.out.println("Token P_RESERVADA encontrado, Lexema "+ yytext());}
"IF" {System.out.println("Token P_RESERVADA encontrado, Lexema "+ yytext());}
"BEGIN.PROGRAM" {System.out.println("Token BEGIN, encontrado Lexema "+ yytext());}
"END.PROGRAM"   {System.out.println("Token END, encontrado Lexema "+ yytext());}

"=="    {System.out.println("Token COMPARAR, encontrado Lexema "+ yytext());}
"="     {System.out.println("Token IGUAL, encontrado Lexema "+ yytext());}
"+"     {System.out.println("Token SUMA, encontrado Lexema "+ yytext());}
"-"     {System.out.println("Token RESTA, encontrado Lexema "+ yytext());}
"/"     {System.out.println("Token DIVISION, encontrado Lexema "+ yytext());}
"*"     {System.out.println("Token MULTIPLICAR, encontrado Lexema "+ yytext());}
"("     {System.out.println("Token PARENTESIS_ABRIR, encontrado Lexema "+ yytext());}
")"     {System.out.println("Token PARENTESIS_CERRAR, encontrado Lexema "+ yytext());}
"["     {System.out.println("Token CORCHETE_ABRIR, encontrado Lexema "+ yytext());}
"]"     {System.out.println("Token CORCHETE_CERRAR, encontrado Lexema "+ yytext());}
"{"     {System.out.println("Token LLAVE_ABRIR, encontrado Lexema "+ yytext());}
"}"     {System.out.println("Token LLAVE_CERRAR, encontrado Lexema "+ yytext());}

{COMENTARIO} {}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }



