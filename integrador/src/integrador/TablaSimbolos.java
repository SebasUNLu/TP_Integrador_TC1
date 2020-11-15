package integrador;

import java.util.ArrayList;

public class TablaSimbolos {
	
	//Objeto Lista
	public ArrayList<TokenObject> TBL_Simbolos;
	
	//Funcion que cree la lista (constructor)
	public TablaSimbolos(){
		TBL_Simbolos = new ArrayList<TokenObject>();
	}
	
	//Funcion que almacene los objetos (invocado por los identificadores)
	//String a guardar --> Nombre(tab)Token(tab)Tipo(tab)Valor(tab)Long
	//Esta version no guarda repetidos
	public void guardarTokenObject(TokenObject TO) {
		boolean flag = false;
		for (TokenObject token_r : TBL_Simbolos)
			if (token_r.nombre.equals(TO.nombre))
				flag = true;
		if(!flag)
			TBL_Simbolos.add(TO);	
	}
	
	//Funcion que escriba la tabla de simbolos en un txt
	public void plasmarTabla(){
		
	}
	
	//Longitud de cadena
	public int tamanoCadena(String s) {
		return s.length();
	}
	
	
	
}