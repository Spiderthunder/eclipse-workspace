package numerotelefono;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainnumerotelefono {

	public static void main(String[] args) {

		//variabili
		Scanner tastiera=new Scanner(System.in);
		String nomeFile;
		Scanner letturaFile;
		List <NumeroDiTelefono> ListaNumeri=new ArrayList<NumeroDiTelefono>();
		//-------------------------------------------



		//lettura file input
		System.out.println("BENVENUTI IN RUBRICA");
		System.out.println("\ninserire nome file input con estensione (es:\"file.txt\")");

		nomeFile=tastiera.nextLine();

		File fileInput= new File("input"+File.separator+nomeFile);
		try {
			letturaFile=new Scanner(fileInput);
			System.out.println("File letto correttamente");
			int i=0;
			while(letturaFile.hasNextLine()) {
				//NumeroDiTelefono numero= new NumeroDiTelefono(letturaFile.nextline());

				
				ListaNumeri.add(new NumeroDiTelefono(letturaFile.nextLine()));
				System.out.println(ListaNumeri.get(i).toString());
				i++;
			}
		} catch (FileNotFoundException e) {

			System.err.println("sei Serena");
		}

		System.out.println("Fine programma!");
		tastiera.close();
	}

}
