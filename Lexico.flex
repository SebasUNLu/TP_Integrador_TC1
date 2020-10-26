import java_cup.runtime.Symbol;

%%
/*%cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char

/*COMILLA = ["\""]*/

LETRA = [a-zA-ZáéíóúÁÉÍÓÚ]
DIGITO = [0-9]
ESPACIO = [ \t\r\n]+
ID = {LETRA}({LETRA}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
CONST_REAL = {DIGITO}*[.]{DIGITO}+
CONST_STRING = "\""({LETRA}|{DIGITO}|{ESPACIO})*"\""
COMENTARIO = "</" ~"/>"


%%

<YYINITIAL> {

{COMENTARIO}    {/**/}

":="    	    {System.out.println("Token ASIGN encontrado, Lexema "+ yytext());}
":"             {System.out.println("Token DOS_PUNTOS encontrado, Lexema "+ yytext());}
","	            {System.out.println("Token COMA, encontrado Lexema "+ yytext());}
"."	            {System.out.println("Token PUNTO, encontrado Lexema "+ yytext());}
";"             {System.out.println("Token P_COMA, encontrado Lexema "+ yytext());}
"_"             {System.out.println("Token GUON_BAJO, encontrado Lexema "+ yytext());}
"!"             {System.out.println("Token EXCL_CERRAR, encontrado Lexema "+ yytext());}
"¡"             {System.out.println("Token EXCL_ABRIR, encontrado Lexema "+ yytext());}
"?"             {System.out.println("Token PREG_CERRAR, encontrado Lexema "+ yytext());}
"¿"             {System.out.println("Token PREG_ABRIR, encontrado Lexema "+ yytext());}
"%"             {System.out.println("Token PORCENTAJE, encontrado Lexema "+ yytext());}
"$"             {System.out.println("Token SIGNO_PESO, encontrado Lexema "+ yytext());}
"#"             {System.out.println("Token NUMERAL, encontrado Lexema "+ yytext());}
"@"             {System.out.println("Token ARROBA, encontrado Lexema "+ yytext());}
"while"         {System.out.println("Token WHILE encontrado, Lexema "+ yytext());}
"If"            {System.out.println("Token IF encontrado, Lexema "+ yytext());}
"Else"          {System.out.println("Token ELSE, encontrado Lexema "+ yytext());}
"PRINT"         {System.out.println("Token PRINT encontrado, Lexema "+ yytext());}
"BEGIN.PROGRAM" {System.out.println("Token BEGIN, encontrado Lexema "+ yytext());}
"END.PROGRAM"   {System.out.println("Token END, encontrado Lexema "+ yytext());}
"DECLARE"	    {System.out.println("Token DECLARE encontrado, Lexema "+ yytext());}
"ENDDECLARE"    {System.out.println("Token ENDDECLARE encontrado, Lexema "+ yytext());}
"END"	        {System.out.println("Token END, encontrado Lexema "+ yytext());}        
"INT"           {System.out.println("Token INT, encontrado Lexema "+ yytext());}
"STRING"        {System.out.println("Token STRING, encontrado Lexema "+ yytext());}
"FLOAT"         {System.out.println("Token FLOAT, encontrado Lexema "+ yytext());}
"CHAR"          {System.out.println("Token CHAR, encontrado Lexema "+ yytext());}
"and"           {System.out.println("Token AND, encontrado Lexema "+ yytext());}

/*Operadores*/
"="     {System.out.println("Token IGUAL, encontrado Lexema "+ yytext());}
"+"     {System.out.println("Token SUMA, encontrado Lexema "+ yytext());}
"-"     {System.out.println("Token RESTA, encontrado Lexema "+ yytext());}
"/"     {System.out.println("Token DIVISION, encontrado Lexema "+ yytext());}
"*"     {System.out.println("Token MULTIPLICAR, encontrado Lexema "+ yytext());}
">"     {System.out.println("Token MAYOR_QUE encontrado, Lexema "+ yytext());}
"<"	    {System.out.println("Token MENOR_QUE encontrado, Lexema "+ yytext());}
">="	{System.out.println("Token MAYOR_IGUAL_QUE encontrado, Lexema "+ yytext());}
"<="	{System.out.println("Token MENOR_IGUAL_QUE encontrado, Lexema "+ yytext());}
"=="    {System.out.println("Token COMPARAR, encontrado Lexema "+ yytext());}
"<>"    {System.out.println("Token DISTINTO, encontrado Lexema "+ yytext());}
"&"     {System.out.println("Token AND, encontrado Lexema "+ yytext());}
"|"     {System.out.println("Token PIPE, encontrado Lexema "+ yytext());}

/*Parentesis*/
"("     {System.out.println("Token PARENTESIS_ABRIR, encontrado Lexema "+ yytext());}
")"     {System.out.println("Token PARENTESIS_CERRAR, encontrado Lexema "+ yytext());}
"["     {System.out.println("Token CORCHETE_ABRIR, encontrado Lexema "+ yytext());}
"]"     {System.out.println("Token CORCHETE_CERRAR, encontrado Lexema "+ yytext());}
"{"     {System.out.println("Token LLAVE_ABRIR, encontrado Lexema "+ yytext());}
"}"     {System.out.println("Token LLAVE_CERRAR, encontrado Lexema "+ yytext());}

/*Funciones*/
"Iguales"   {System.out.println("Token FUNC_IGUALES, encontrado Lexema "+ yytext());}
/*CHICOS, QUE WTF, COMO PONEMOS LAS FUNCIONES? LO HACEMOS GENERICO?*/

/*Identificadores*/
{ID}		    {System.out.println("Token ID encontrado, Lexema "+ yytext());}
{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}
{CONST_REAL}    {System.out.println("Token CONST_REAL, encontrado Lexema "+ yytext());}
{CONST_STRING}  {System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());}

{ESPACIO}       {}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }



