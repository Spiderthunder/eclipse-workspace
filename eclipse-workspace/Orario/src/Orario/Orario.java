package Orario;

import java.util.Scanner;

public class Orario {
	int ore;
	int minuti;
	Scanner scan=new Scanner(System.in);
	
	public int InserisciOre() {
		System.out.println("inserisci ora:");
		scan.nextInt();
		return ore;
		
	}
	public int InserisciMinuti() {
		System.out.println("inserisci minuti:");
		scan.nextInt();
		return minuti;
		
	}
	
	public boolean  ControllaOra() {
		boolean oreok;
		
		
		if(ore<=23&& ore>=0) {
			oreok=true;
			System.out.println("ora inserita valida!!");
		}
		else {
			System.out.println("ora non valida!!");
			oreok=false;
		}
		
		return oreok;
		
		
		
	}
	
	public boolean ControllaMinuti() {
		boolean minutiok;
	if(minuti<=60&& minuti>=0) {
		minutiok=true;
		System.out.println("minuti inseriti validi!!");
	}else {
		System.out.println("minuti non validi!!");
		minutiok=false;
	}
	return minutiok;
	}
	public void Mostraorario() {
		System.out.println("l'orario �:"+ore+":"+minuti);
		
	}
	
	
	

}
