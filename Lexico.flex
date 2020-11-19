package integrador;

import java_cup.runtime.*;
import java.util.ArrayList;
import javax.swing.JTextArea;
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
final int MAX_STRING = 32;
final int MAX_INT = Short.MAX_VALUE;
final float MAX_FLOAT = Float.MAX_VALUE;


private boolean verify_real(String x){
	boolean flag = true;
    float f = Float.parseFloat(x);
	if(f< -MAX_FLOAT || f>MAX_FLOAT){
        System.out.println("Numero Real detectado invalido: "+yytext()+"\nDebe ser menor a "+Float.toString(MAX_FLOAT));
        flag = false;
	}
	return flag;
}

private boolean verify_int(String x){
	boolean flag = true;
    int f = Integer.parseInt(x);
	if(f< -MAX_INT || f>MAX_INT){
        System.out.println("Numero Integer detectado invalido: "+yytext()+"\nDebe ser menor a "+Integer.toString(MAX_INT));
        flag = false;
	}
	return flag;
}

private boolean verify_string(String x){
	boolean flag = true;
    if(x.length() > MAX_STRING){
        /*Debería tirar una excepcion o algo*/
        System.out.println("Cadena detectada invalida: "+yytext()+"\nSu longitud debe ser de 30 caracteres o menos");
        flag = false;
	}
	return flag;
}
    TablaSimbolos Tabla;
    JTextArea textoArea;
%}


LETRA = [a-zA-ZáéíóúÁÉÍÓÚâêîôû]
DIGITO = [0-9]
ESPACIO = [ \t\f\n\r\n]+
ID = {LETRA}({LETRA}|{DIGITO}|_)*
CONST_INT = {DIGITO}+
CONST_REAL = {DIGITO}*[.]{DIGITO}+
CONST_STRING = "\"" .* "\""
COMENTARIO = "</" ~ ( [\/][\>] | [\<][\/]~[\/][\>]~[\/][\>] ) 


%%

<YYINITIAL> {

{COMENTARIO}    {/**/}

":="    	    {textoArea.append("Token ASIGN encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.ASIGN, yytext());}
","	            {textoArea.append("Token COMA encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.COMA, yytext());}
"while"         {textoArea.append("Token WHILE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.WHILE, yytext());}
"If"            {textoArea.append("Token IF encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.IF, yytext());}
"Else"          {textoArea.append("Token ELSE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.ELSE, yytext());}
"PRINT"         {textoArea.append("Token PRINT encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.PRINT, yytext());}
"BEGIN.PROGRAM" {textoArea.append("Token BEGIN_PROGRAM encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.BEGIN_PROGRAM, yytext());}
"END.PROGRAM"   {textoArea.append("Token END_PROGRAM encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.END_PROGRAM, yytext());}
"DECLARE"	    {textoArea.append("Token DECLARE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.DECLARE, yytext());}
"ENDDECLARE"    {textoArea.append("Token END_DECLARE encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.END_DECLARE, yytext());}
"INT"           {textoArea.append("Token INT encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.INT, yytext());}
"STRING"        {textoArea.append("Token STRING encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.STRING, yytext());}
"FLOAT"         {textoArea.append("Token FLOAT encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.FLOAT, yytext());}
"and"           {textoArea.append("Token AND encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.AND, yytext());}
"or"            {textoArea.append("Token OR encontrado, Lexema "+ yytext()+"\n");
                return new Symbol(sym.OR, yytext());}

/*Operadores*/
"+"     {textoArea.append("Token SUMA encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.SUMA, yytext());}
"-"     {textoArea.append("Token RESTA encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.RESTA, yytext());}
"/"     {textoArea.append("Token DIVISION encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.DIVISION, yytext());}
"*"     {textoArea.append("Token MULTIPLICAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MULTIPLICAR, yytext());}
">"     {textoArea.append("Token MAYOR_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MAYOR_QUE, yytext());}
"<"	    {textoArea.append("Token MENOR_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MENOR_QUE, yytext());}
">="	{textoArea.append("Token MAYOR_IGUAL_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MAYOR_IGUAL_QUE, yytext());}
"<="	{textoArea.append("Token MENOR_IGUAL_QUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.MENOR_IGUAL_QUE, yytext());}
"=="    {textoArea.append("Token COMPARAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.COMPARAR, yytext());}
"<>"    {textoArea.append("Token DISTINTO encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.DISTINTO, yytext());}


/*Parentesis*/
"("     {textoArea.append("Token PARENTESIS_ABRIR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.PARENTESIS_ABRIR, yytext());}
")"     {textoArea.append("Token PARENTESIS_CERRAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.PARENTESIS_CERRAR, yytext());}
"["     {textoArea.append("Token CORCHETE_ABRIR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.CORCHETE_ABRIR, yytext());}
"]"     {textoArea.append("Token CORCHETE_CERRAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.CORCHETE_CERRAR, yytext());}
"{"     {textoArea.append("Token LLAVE_ABRIR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.LLAVE_ABRIR, yytext());}
"}"     {textoArea.append("Token LLAVE_CERRAR encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.LLAVE_CERRAR, yytext());}


"true"  {textoArea.append("Token TRUE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.TRUE, yytext());}
"false" {textoArea.append("Token FALSE encontrado, Lexema "+ yytext()+"\n");
        return new Symbol(sym.FALSE, yytext());}

/*Funciones*/
"Iguales"   {textoArea.append("Token IGUALES_FUNC encontrado, Lexema "+ yytext()+"\n");
            return new Symbol(sym.IGUALES_FUNC, yytext());}

/*Identificadores*/
{ID}		    {TokenObject TO = new TokenObject();
                TO.nombre = yytext();
                TO.token = "ID";
                TO.tipo = "";
                TO.valor = "";
                TO.longitud = 0;
                textoArea.append("Token ID encontrado, Lexema "+ yytext()+"\n");
                Tabla.guardarTokenObject(TO);
                return new Symbol(sym.ID, yytext());
                }

{CONST_INT}		{
                if (verify_int(yytext())){                    
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_INT";
                    TO.tipo = "";
                    TO.valor = yytext();
                    TO.longitud = 0;
                    textoArea.append("Token CONST_INT encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    return new Symbol(sym.CONST_INT, yytext());
                    }
                }

{CONST_REAL}    {
                if (verify_real(yytext())){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_REAL";
                    TO.tipo = "";
                    TO.valor = yytext();
                    TO.longitud = 0;
                    textoArea.append("Token CONST_REAL encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    return new Symbol(sym.CONST_REAL, yytext());
                    }
                }

{CONST_STRING}  {
                if (verify_string(yytext())){
                    TokenObject TO = new TokenObject();
                    TO.nombre = "_" + yytext();
                    TO.token = "CONST_STRING";
                    TO.tipo = "";
				    TO.valor = yytext();
                    TO.longitud = Tabla.tamanoCadena(TO.valor);
                    textoArea.append("Token CONST_STRING encontrado, Lexema "+ yytext()+"\n");
                    Tabla.guardarTokenObject(TO);
                    return new Symbol(sym.CONST_STRING, yytext());
                    }
                }

{ESPACIO}       {}

}

[^]		{ throw new Error("Caracter no permitido: <"+yytext()+"> en linea "+yyline); }
<<EOF>>         {return new Symbol(sym.EOF);}


