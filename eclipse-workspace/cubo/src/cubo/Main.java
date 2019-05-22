package cubo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		Misure m=new Misure();
		
		System.out.println("inserisci la lunghezza:");

		m.setLunghezza(s.nextInt());
		m.getLunghezza();
		System.out.println("inserisci la altezza:");
		m.setAltezza(s.nextInt());
		m.getAltezza();
		System.out.println("inserisci la larghezza:");
		m.setLarghezza(s.nextInt());
		m.getLarghezza();
		
		s.close();
		
		m.VisualizzaVolume();

	}

}
