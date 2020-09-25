package Tema1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribeFicheroTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FUNCIONA 
		
		final String TEXTO ="Escribiendo contenido en el fichero";
		final String RUTA = "C:\\Users\\alber\\Desktop";
		final String NOMBRE_ARCHIVO = "ficheroEscrito.txt";
		
		try {
			File f1 = new File(RUTA, NOMBRE_ARCHIVO);
			FileWriter fichero = new FileWriter(f1);
			fichero.write(TEXTO);
			fichero.close();
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println("error al acceder al fichero: " +ex);
		}

	}

}
