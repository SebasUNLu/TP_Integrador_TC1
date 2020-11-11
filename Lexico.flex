package integrador;

import java_cup.runtime.Symbol;
import java.util.ArrayList;
import javax.swing.JTextArea;
import jflex.core.sym;
import javax.swing.JOptionPane;

%%
/*%cupsym Simbolo*/
%cup
%public
%class Lexico
%line
%column
%char

%{
final int MAX_STRING = 30;
final int MAX_INT = Short.MAX_VALUE;
final float MAX_FLOAT = Float.MAX_VALUE;


private boolean verify_real(String x){
	float f = Float.parseFloat(x);
	if(f<MAX_FLOAT || f>MAX_FLOAT){
		throw new NumberFormatException();
	}
	return true;
}

private boolean verify_int(String x){
	int f = Integer.parseInt(x);
	if(f<MAX_INT || f>MAX_INT){
		throw new NumberFormatException();
	}
	return true;
}


private boolean verify_string(String x){
	if(x.length() > MAX_STRING){
		throw new NumberFormatException();
	}
	return true;
}
    TablaSimbolos Tabla;
    JTextArea textoArea;
%}


LETRA = [a-zA-ZáéíóúÁÉÍÓÚâêîôû]
DIGITO = [0-9]
ESPACIO = [ \t\r\n]+
ID = {LETRA}({LETRA}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
CONST_REAL = {DIGITO}*[.]{DIGITO}+
CONST_STRING = "\"" .* "\""
COMENTARIO = ("</" ~"/>"|"</" ~"</" ~"/>" ~"/>")

%%

<YYINITIAL> {

{COMENTARIO}    {/**/}

":="    	    {textoArea.append("Token ASIGN encontrado, Lexema "+ yytext()+"\n");}
":"             {textoArea.append("Token DOS_PUNTOS encontrado, Lexema "+ yytext()+"\n");}
","	            {textoArea.append("Token COMA encontrado, Lexema "+ yytext()+"\n");}
"."	            {textoArea.append("Token PUNTO encontrado, Lexema "+ yytext()+"\n");}
";"             {textoArea.append("Token P_COMA encontrado, Lexema "+ yytext()+"\n");}
"_"             {textoArea.append("Token GUION_BAJO encontrado, Lexema "+ yytext()+"\n");}
"while"         {textoArea.append("Token WHILE encontrado, Lexema "+ yytext()+"\n");}
"If"            {textoArea.append("Token IF encontrado, Lexema "+ yytext()+"\n");}
"Else"          {textoArea.append("Token ELSE encontrado, Lexema "+ yytext()+"\n");}
"PRINT"         {textoArea.append("Token PRINT encontrado, Lexema "+ yytext()+"\n");}
"BEGIN.PROGRAM" {textoArea.append("Token BEGIN_PROGRAM encontrado, Lexema "+ yytext()+"\n");}
"END.PROGRAM"   {textoArea.append("Token END_PROGRAM encontrado, Lexema "+ yytext()+"\n");}
"DECLARE"	    {textoArea.append("Token DECLARE encontrado, Lexema "+ yytext()+"\n");}
"ENDDECLARE"    {textoArea.append("Token END_DECLARE encontrado, Lexema "+ yytext()+"\n");}
"END"	        {textoArea.append("Token END encontrado, Lexema "+ yytext()+"\n");}        
"INT"           {textoArea.append("Token INT encontrado, Lexema "+ yytext()+"\n");}
"STRING"        {textoArea.append("Token STRING encontrado, Lexema "+ yytext()+"\n");}
"FLOAT"         {textoArea.append("Token FLOAT encontrado, Lexema "+ yytext()+"\n");}
"CHAR"          {textoArea.append("Token CHAR encontrado, Lexema "+ yytext()+"\n");}
"and"           {textoArea.append("Token AND encontrado, Lexema "+ yytext()+"\n");}

/*Operadores*/
"="     {textoArea.append("Token IGUAL encontrado, Lexema "+ yytext()+"\n");}
"+"     {textoArea.append("Token SUMA encontrado, Lexema "+ yytext()+"\n");}
"-"     {textoArea.append("Token RESTA encontrado, Lexema "+ yytext()+"\n");}
"/"     {textoArea.append("Token DIVISION encontrado, Lexema "+ yytext()+"\n");}
"*"     {textoArea.append("Token MULTIPLICAR encontrado, Lexema "+ yytext()+"\n");}
">"     {textoArea.append("Token MAYOR_QUE encontrado, Lexema "+ yytext()+"\n");}
"<"	    {textoArea.append("Token MENOR_QUE encontrado, Lexema "+ yytext()+"\n");}
">="	{textoArea.append("Token MAYOR_IGUAL_QUE encontrado, Lexema "+ yytext()+"\n");}
"<="	{textoArea.append("Token MENOR_IGUAL_QUE encontrado, Lexema "+ yytext()+"\n");}
"=="    {textoArea.append("Token COMPARAR encontrado, Lexema "+ yytext()+"\n");}
"<>"    {textoArea.append("Token DISTINTO encontrado, Lexema "+ yytext()+"\n");}
"&"     {textoArea.append("Token AND encontrado, Lexema "+ yytext()+"\n");}
"|"     {textoArea.append("Token PIPE encontrado, Lexema "+ yytext()+"\n");}

/*Parentesis*/
"("     {textoArea.append("Token PARENTESIS_ABRIR encontrado, Lexema "+ yytext()+"\n");}
")"     {textoArea.append("Token PARENTESIS_CERRAR encontrado, Lexema "+ yytext()+"\n");}
"["     {textoArea.append("Token CORCHETE-ABRIR encontrado, Lexema "+ yytext()+"\n");}
"]"     {textoArea.append("Token CORCHETE_CERRAR encontrado, Lexema "+ yytext()+"\n");}
"{"     {textoArea.append("Token LLAVE_ABRIR encontrado, Lexema "+ yytext()+"\n");}
"}"     {textoArea.append("Token LLAVE_CERRAR encontrado, Lexema "+ yytext()+"\n");}

/*Funciones*/
"Iguales"   {textoArea.append("Token IGUALES_FUNC encontrado, Lexema "+ yytext()+"\n");}

/*Identificadores*/
{ID}		    {TokenObject TO = new TokenObject();
                TO.nombre = yytext();
                TO.token = "ID";
                TO.tipo = "";
                TO.valor = "";
                TO.longitud = 0;
                textoArea.append("Token ID encontrado, Lexema "+ yytext()+"\n");
                Tabla.guardarTokenObject(TO);}

{CONST_INT}		{
                if verify_int(yytext()){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_INT";
                    TO.tipo = "";
                    TO.valor = yytext();
                    TO.longitud = 0;
                    textoArea.append("Token CONST_INT encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                }
    
                }

{CONST_REAL}    {
                if verify_real(yytext()){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_REAL";
                    TO.tipo = "";
                    TO.valor = yytext();
                    TO.longitud = 0;
                    textoArea.append("Token CONST_REAL encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    }
                }

{CONST_STRING}  {
                if verify_string(yytext()){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_STRING";
                    TO.tipo = "";
				    TO.valor = yytext();
                    TO.longitud = Tabla.tamanoCadena(TO.valor);
                    textoArea.append("Token CONST_STRING encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                }
                }

{ESPACIO}       {}

}

[^]		{ JOptionPane.showMessageDialog(null, "Caracter no permitido: <" + yytext() + "> en la linea " + yyline, "Caracter no reconocido", JOptionPane.ERROR_MESSAGE); }



