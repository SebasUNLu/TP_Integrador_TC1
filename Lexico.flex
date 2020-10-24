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
ESPACIO = [ \t\r\n]+
ID = {LETRA}({LETRA}|{DIGITO}|_)*

/*No estoy seguro de este <---------------*/
COMILLA = ["]

CONST_INT = {DIGITO}+
CONST_REAL = {DIGITO}*.{DIGITO}+
CONST_STRING = {COMILLA}({LETRA}|{DIGITO}|{ESPACIO})*{COMILLA}
COMENTARIO = </{CONST_STRING}/>|</{CONST_STRING}{COMENTARIO}/>

/* Para la funcion de nuestro grupo */
expresion = {expresion} [+] {termino}
expresion = {expresion} - {termino}
expresion = {termino}
termino   = {termino} [*] {factor}
termino   = {termino} / {factor}
termino   = {factor} 
factor    = {DIGITO}+

palabra_reservada

CONDICION = {EXPRESION} < {EXPRESION}
CONDICION = {EXPRESION} <= {EXPRESION}
CONDICION = {EXPRESION} > {EXPRESION}
CONDICION = {EXPRESION} >= {EXPRESION}
CONDICION = {EXPRESION} == {EXPRESION}
CONDICION = {EXPRESION} != {EXPRESION}
CONDICION = {CONDICION} && {CONDICION}
CONDICION = {CONDICION} || {CONDICION}

DECLARACION = [ Lista_V ]
Lista_V = {ID} ] := [ {TIPO} | {ID}, Lista_V , {TIPO}

%%

<YYINITIAL> {

":="    	    {System.out.println("Token ASIGN encontrado, Lexema "+ yytext());}
","	            {System.out.println("Token COMA, encontrado Lexema "+ yytext());}
"."	            {System.out.println("Token PUNTO, encontrado Lexema "+ yytext());}
"WHILE"         {System.out.println("Token WHILE encontrado, Lexema "+ yytext());}
"IF"            {System.out.println("Token IF encontrado, Lexema "+ yytext());}
"BEGIN.PROGRAM" {System.out.println("Token BEGIN, encontrado Lexema "+ yytext());}
"END.PROGRAM"   {System.out.println("Token END, encontrado Lexema "+ yytext());}
"DECLARE"	    {System.out.println("Token DECLARE encontrado, Lexema "+ yytext());}
"ENDDECLARE"    {System.out.println("Token ENDDECLARE encontrado, Lexema "+ yytext());}
"END"	        {System.out.println("Token END, encontrado Lexema "+ yytext());}        

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

/*Parentesis*/
"("     {System.out.println("Token PARENTESIS_ABRIR, encontrado Lexema "+ yytext());}
")"     {System.out.println("Token PARENTESIS_CERRAR, encontrado Lexema "+ yytext());}
"["     {System.out.println("Token CORCHETE_ABRIR, encontrado Lexema "+ yytext());}
"]"     {System.out.println("Token CORCHETE_CERRAR, encontrado Lexema "+ yytext());}
"{"     {System.out.println("Token LLAVE_ABRIR, encontrado Lexema "+ yytext());}
"}"     {System.out.println("Token LLAVE_CERRAR, encontrado Lexema "+ yytext());}

"IGUALES"   {System.out.println("Token FUNC_IGUALES, encontrado Lexema "+ yytext());}

/*Identificadores*/
{ID}		    {System.out.println("Token ID encontrado, Lexema "+ yytext());}
{CONST_INT}		{System.out.println("Token CONST_INT, encontrado Lexema "+ yytext());}
{CONST_REAL}    {System.out.println("Token CONST_REAL, encontrado Lexema "+ yytext());}
{CONST_STRING}  {System.out.println("Token CONST_STRING, encontrado Lexema "+ yytext());}
{CONDICION}     {System.out.println("Token CONDICION, encontrado Lexema "+ yytext());}
{expresion}     {System.out.println("Token EXPRESION, encontrado Lexema "+ yytext());}
{termino}       {System.out.println("Token TERMINO, encontrado Lexema "+ yytext());}
{factor}        {System.out.println("Token FACTOR, encontrado Lexema "+ yytext());}


{COMENTARIO}    {}
{ESPACIO}       {}

}

[^]		{ throw new Error("Caracter no permitido: <" + yytext() + "> en la linea " + yyline); }



