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
		int scelta=0;
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

				i++;
			}
			StampaLista(ListaNumeri);
			System.out.println("\nVuoi apportare qualche modifica alla rubrica? (y/n)");
			String continua= tastiera.nextLine();
			if(continua.equalsIgnoreCase("y")) {
				System.out.println("\n\t Quale modifica vuoi apportare? \n1-Aggiungi numero \n2-Cancella numero\n3 Modifica numero");
				scelta=tastiera.nextInt();

				switch (scelta) {
				case 1:
					System.out.println("scrivi numero da inserire:");//Aggiungi numero
					ListaNumeri.add(new NumeroDiTelefono(tastiera.next()));
					break;
				case 2:
					System.out.println("quale numero vuoi cancellare?");//Cancella numero
					ListaNumeri.remove(tastiera.nextInt()-1);
					break;

				case 3:
					System.out.println("inserire la posizione del numero da modificare?");//Modifica numero
					int indice=tastiera.nextInt();
					System.out.println("inserire il nuovo numero");
					ListaNumeri.set(indice -1,new NumeroDiTelefono(tastiera.next()));
					break;
				default:
					System.out.println("ATTENZIONE POSSIBILITÓ NON CONSENTITA!!!");
					break;
				}


				StampaLista(ListaNumeri);
			}

			else  if(continua.equalsIgnoreCase("n")) {
				System.out.println("Arrivederci");
			}
			else {
				System.out.println("Valore inserito non valido");
			}

		} catch (FileNotFoundException e) {

			System.err.println("sei Serena");
		}

		System.out.println("Fine programma!");
		tastiera.close();


	}

	public static void StampaLista(List<NumeroDiTelefono> listaDaStampare) {

		int j=0;
		for(int i=0; i<listaDaStampare.size();i++) {
			j=i+1;
			System.out.println(j+")"+listaDaStampare.get(i).toString());

		}

	}
}