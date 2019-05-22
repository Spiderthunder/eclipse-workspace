package calcolatrice;

public class Main {
	
	public static void main (String[]args) {
		double a=10.0;
		double b=15.5;
		String spazio="  ";
		
		Calcolatrice c= new Calcolatrice();
		
		System.out.println(spazio+"il valore a:"+ a + ","+spazio+ "il valore b:"+ b);
		System.out.println(spazio);
		System.out.println(spazio+"il valore della somma:"+spazio+ c.CalcolaSomma(a, b));
		System.out.println(spazio);
		System.out.println(spazio+"il valore della sottrazione:"+spazio+ c.CalcolaSottrazione(a, b));
		System.out.println(spazio);
		System.out.println(spazio+"il valore del prodotto:"+spazio+ c.CalcolaProdotto(a, b));
		System.out.println(spazio);
		System.out.println(spazio+"il valore della divisione:"+spazio+ c.CalcolaDivisione(a, b));
		
}
}
