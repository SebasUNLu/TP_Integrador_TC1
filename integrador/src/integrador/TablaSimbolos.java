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
	
	public void actualizarTipo(ArrayList<String> list_id, ArrayList<String> list_tipo) {
		System.out.println("Pruebas act");
		int lugar;
		boolean flag;
		for(int index = 0; index < list_id.size(); ++index){
			String nombre = (String)list_id.get(index);
			lugar = 0;
			flag = false;
			while((!flag) && (lugar<TBL_Simbolos.size())) {
				if(TBL_Simbolos.get(lugar).nombre.equals(nombre))
					flag = true;
				else
					++lugar;
			}
			if(flag) {
				TBL_Simbolos.get(lugar).setTipo(list_tipo.get(index).toString());
				System.out.println("Objeto: "+list_tipo.get(index).toString()+" tamaño: "+list_tipo.size()+"\n");
			}else {
				System.out.println("wot "+nombre);
			}
		}
	}
	
	
}