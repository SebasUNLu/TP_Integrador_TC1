package integrador;

import java.util.ArrayList;

public class TablaSimbolos {
	
	//Objeto Lista
	private ArrayList<TokenObject> TBL_Simbolos;
	
	//Funcion que cree la lista (constructor)
	public TablaSimbolos(){
		TBL_Simbolos = new ArrayList<TokenObject>();
	}
	
	
	//Funcion que almacene los objetos (invocado por los identificadores)
	//String a guardar --> Nombre(tab)Token(tab)Tipo(tab)Valor(tab)Long
	//Valor seria yytext(), ya que devuelve el lexema
	public void GuardarString(TokenObject TO) {
		
	}
	
	
	//Funcion que escriba la tabla de simbolos en un txt
	
	
	
	//Longitud de cadena
	public int longitud(String s) {
		return s.length();
	}
	
	
	
}