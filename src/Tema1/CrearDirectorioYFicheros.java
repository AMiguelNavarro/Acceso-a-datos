package Tema1;

import java.io.File;
import java.io.IOException;

public class CrearDirectorioYFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* FUNCIONA Y CREA EL DIRECTORIO Y LOS ARCHIVOS*/
		
		File directorioNuevo = new File("C:\\Users\\alber\\Desktop\\DIRECTORIO");
		File f1 = new File(directorioNuevo, "FICHERO_1.txt");
		File f2 = new File(directorioNuevo, "FICHERO_2.txt");
		
		directorioNuevo.mkdir(); // Se crea el directorio
		
		try {
			if (f1.createNewFile()) {
				System.out.println("FICHERO 1 creado correctamente");
			} else {
				System.out.println("No se ha podido crear el fichero 1");
			}
			
			if (f2.createNewFile()) {
				System.out.println("FICHERO 2 creado correctamente");
			} else {
				System.out.println("No se ha podido crear el fichero 2");
			}
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		
		f1.renameTo(new File(directorioNuevo, "Fichero_1_Nuevo"));
		
		if (f2.delete()) {
			System.out.println("Borrado correctamente el FICHERO_2");
		} else {
			System.out.println("No se ha podido borrar el FICHERO_2");
		}
	}

}
