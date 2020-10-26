package integrador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class inputOutputFile implements Serializable {
	
	void guardarArchivo(ArrayList<TokenObject> token) {
		//Cadena es lo que vamos a guardar
		String cadena = "Nombre\tToken\tTipo\tValor\tLongitud\n";
		for (TokenObject tO : token) {
			cadena += tO.nombre+"\t"+tO.token+"\t"+tO.tipo+"\t"+tO.valor+"\t"+tO.longitud+"\n";
		}
		try {
			FileWriter escribir = new FileWriter("ts.txt");
			for (int i=0;i<cadena.length();i++) {
				escribir.write(cadena.charAt(i));
			}
			escribir.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	
	}
}
