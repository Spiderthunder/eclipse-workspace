package scanner;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {
		
		//Istanzia scanner con standard input
		Scanner scan = new Scanner(System.in);
		 
		//Chiede di introdurre nome e cognome
		System.out.println("Introduci nome :");
		String nome = scan.next(); //qui il programma attende l'immissione dei dati
		System.out.println("introduci cognome:");
		String cognome= scan.next(); 
		//Chiede di introdurre la citt�
		System.out.println("Introduci citt�:");
		String citta = scan.next(); 
		 
		System.out.println("Nome e cognome : " + nome+"   "+cognome);
		System.out.println("Citt� : " + citta);
		scan.close();
		

	}

}
