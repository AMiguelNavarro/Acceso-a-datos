package Tema1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFicheroTextoBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// FUNCIONA 
		
		final String RUTA = "C:\\Users\\alber\\Desktop\\DIRECTORIO";
		final String NOMBRE_ARCHIVO = "ficheroEscrito.txt";
		
		File directorioNuevo = new File("C:\\Users\\alber\\Desktop\\DIRECTORIO");
		directorioNuevo.mkdir();
		
		try {
			
			File f1 = new File(RUTA, NOMBRE_ARCHIVO);
			FileWriter fichero = new FileWriter(f1);
			BufferedWriter ficheroBuffered = new BufferedWriter(fichero);

			for (int i = 1; i < 4; i++) {
				ficheroBuffered.write("Esta es la linea: " +i);
				ficheroBuffered.newLine();
			}
			
			ficheroBuffered.close();
			fichero.close();
			
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println("error al acceder al fichero: " +ex);
		}

	}


}

