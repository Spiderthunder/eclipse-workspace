package conto;

public class ContoBancario {

	private int numeroconto;
	private int tassointeresse;
	private double saldo;
	private String nomecliente;
	private String nomeindirizzo;
	private String tipoconto;
	private String data;
	int ver=1200;


	public  ContoBancario(int numeroconto,int tassointeresse,double saldo,String nomecliente,String nomeindirizzo,String tipoconto,String data) {
		this.numeroconto=numeroconto;
		this.tassointeresse=tassointeresse;
		this.saldo=saldo;
		this.nomecliente=nomecliente;
		this.nomeindirizzo=nomeindirizzo;
		this.tipoconto=tipoconto;
		this.data=data;

	}

	public void ChiusuraConto() {
		System.out.println("il conto � chiuso!");

	}
	public int Versamento() {
		System.out.println("versamento:"+ver);
		return ver;
	}
	public int getNumeroconto() {
		System.out.println("il numero conto �:");
		return numeroconto;
	}
	public void setNumeroconto(int numeroconto) {
		this.numeroconto = numeroconto;
	}
	public int getTassointeresse() {
		System.out.println("il tasso di interesse % :");
		return tassointeresse;
	}
	public void setTassointeresse(int tassointeresse) {
		this.tassointeresse = tassointeresse;
	}
	public double getSaldo() {
		System.out.println("il saldo �:");
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomecliente() {
		System.out.println("il nome del cliente:");
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getNomeindirizzo() {
		System.out.println("l'indirizzo �:");
		return nomeindirizzo;
	}
	public void setNomeindirizzo(String nomeindirizzo) {
		this.nomeindirizzo = nomeindirizzo;
	}
	public String getTipoconto() {
		System.out.println("tipo conto:");
		return tipoconto;
	}
	public void setTipoconto(String tipoconto) {
		this.tipoconto = tipoconto;
	}
	public String getData() {
		System.out.println("data:");
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public void AperturaConto() {
		System.out.println("hai aperto il conto");
	}
}
