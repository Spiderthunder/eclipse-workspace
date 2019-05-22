package conto;


public class Main {

	public static void main(String[] args) {
		ContoBancario c=new ContoBancario(132, 32, 4, "Andrea", "centro chiaia", "postpay", "17/05/2019");
		c.setNumeroconto(132);
		System.out.println(c.getNumeroconto());
		c.AperturaConto();
		c.setSaldo(1200);
		System.out.println(c.getSaldo());
		c.setNomecliente("Andrea");
		System.out.println(c.getNomecliente());
		c.setNomeindirizzo("centro chiaia");
		System.out.println(c.getNomeindirizzo());
		c.setTipoconto("postpay");
		System.out.println(c.getTipoconto());
		c.setData("17/05/2019");
		System.out.println(c.getData());
		c.setTassointeresse(12);
		System.out.println(c.getTassointeresse());
		c.ChiusuraConto();
		c.Versamento();




	}

}
