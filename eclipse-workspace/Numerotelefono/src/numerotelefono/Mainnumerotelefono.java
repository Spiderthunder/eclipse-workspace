package numerotelefono;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Mainnumerotelefono {

	public static void main(String[] args) {

		//variabili
		Scanner tastiera=new Scanner(System.in);
		String nomeFile;
		Scanner letturaFile;
		//-------------------------------------------
		
	
		
		//lettura file input
		System.out.println("BENVENUTI IN RUBRICA");
		System.out.println("\ninserire nome file input con estensione (es:\"file.txt\")");

		nomeFile=tastiera.nextLine();

		File fileInput= new File("input"+File.separator+nomeFile);
		try {
			letturaFile=new Scanner(fileInput);
			System.out.println("File letto correttamente");
			while(letturaFile.hasNextLine()) {
				System.out.println(letturaFile.nextLine());
				

			}
		} catch (FileNotFoundException e) {
			
			System.err.println("sei Serena");
		}

		System.out.println("Fine programma!");
		tastiera.close();
	}

}
