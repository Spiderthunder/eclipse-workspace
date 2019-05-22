package maggioratore;

public class Maggioratore {
	public int DammiMassimo(int x,int y,int z,int w){
		
		int max=0;
		
		if(x>y & x>z & x>w) {
			max=x;
			System.out.println("il valore massimo è x");
		}
		if(z>y & z>x & z>w) {
			max=z;
			System.out.println("il valore massimo è z");
		}
		if(y>x & y>z & y>w) {
			max=y;
			System.out.println("il valore massimo è y");
		}
		
		if(w>y & w>x & w>z) {
			max=w;
			System.out.println("il valore massimo è w");
		}
		return max;
}
}