package Tema1;

import java.io.File;

public class VerListaFicherosDirectorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String DIRECTORIO = "." ;
		
		File f1 = new File(DIRECTORIO);
		String[] listaArchivos = f1.list(); // se almacena en un string;
		
		System.out.println("Ficheros en el directorio actual: " +listaArchivos.length);
		
		for (int i = 0; i < listaArchivos.length; i++) {
			File f2 = new File(f1, listaArchivos[i]);
			
			System.out.println("Nombre: " +listaArchivos[i]+ " ¿Es fichero?: " +f2.isFile()+ " ¿Es directorio?:" +f2.isDirectory());
		}

	}

}
