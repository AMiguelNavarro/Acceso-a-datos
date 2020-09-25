package Tema1;

import java.io.*;

public class VerAtributos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Informacion sobre el fichero: \n");
		
		final String DIRECTORIO = "C:\\Users\\alber\\Desktop";
		final String FICHERO = "prueba.txt";
		
		File archivo = new File(DIRECTORIO, FICHERO);
		
		if (archivo.exists()) {
			
			System.out.println("Nombre del fichero: " + archivo.getName());
			System.out.println("Tamaño del fichero: " + archivo.length());
			System.out.println("Ruta relativa: " + archivo.getPath());
			System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
			System.out.println("Ruta del directorio que los contiene: " + archivo.getParent());
			System.out.println("Tiene permisos de lectura: " + archivo.canRead());
			System.out.println("Tiene permisos de escritura: " + archivo.canWrite());
			System.out.println("Es un directorio: " + archivo.isDirectory());
			System.out.println("Es un fichero: " + archivo.isFile());
			
		} else {
			System.out.println("NO SE HA PODIDO LEER EL ARCHIVO");
		}

	}

}
