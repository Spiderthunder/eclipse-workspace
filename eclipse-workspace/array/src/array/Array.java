package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int numeri[]=new int [10];
	System.out.println("inserisci 10 numeri interi");
	for(int i=0;i<10;i++) {
		System.out.println("inserisci valore:");
		numeri[i]=s.nextInt();
		
		
	}
	System.out.println("risultato :");
	for(int i=0;i<10;i++) {
		System.out.print(numeri[i]+",");
	
	}
	s.close();
	
	}

}
