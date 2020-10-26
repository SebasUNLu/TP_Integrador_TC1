package integrador;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class inputOutputFile implements Serializable {
	
	void guardarArchivo(ArrayList<TokenObject> token) {
		try (FileOutputStream fos = new FileOutputStream("tablaSimbolos.txt");
			     ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			    // Escribe el token en el archivo
			    oos.writeObject(token);
			} catch (IOException ex) {
			    ex.printStackTrace();
			}
	}
	
	void leerArchivo (TokenObject token) {
		try{    
	        // Leyendo del archivo 
	        FileInputStream file = new FileInputStream("tablaSimbolos.txt"); 
	        ObjectInputStream in = new ObjectInputStream(file); 
	          
	        // des serializaicon del token 
	        token = (TokenObject)in.readObject(); 
	          
	        in.close(); 
	        file.close(); 
	          
	        System.out.println("Tabla de Simbolos"); 
	        System.out.println(token); 
	    } 
	      
	    catch(IOException ex) 
	    { 
	        System.out.println("IOException is caught"); 
	    } 
	      
	    catch(ClassNotFoundException ex) 
	    { 
	        System.out.println("ClassNotFoundException is caught"); 
	    } 
		
} 
}
