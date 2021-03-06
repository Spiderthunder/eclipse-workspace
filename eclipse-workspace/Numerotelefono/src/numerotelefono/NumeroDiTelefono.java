package numerotelefono;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumeroDiTelefono {
	//variabili
	String prefissoInternazionale="0",
			prefissoNazionale="0",
			numero="0";

	//metodi

	public  NumeroDiTelefono (String numeroCompleto) {
		List<String> numeroPrefissi =new ArrayList<String>();
		
		numeroPrefissi = toStrings(numeroCompleto);

		if(numeroPrefissi.size()==2) {
			this.prefissoNazionale= numeroPrefissi.get(0);
			this.numero=numeroPrefissi.get(1);
		}
		//	this.prefissoInteranzionale=prefissoInteranzionale;
		//	this.prefissoNazionale=prefissoNazionale;
		//	this.numero=numero;
		else if(numeroPrefissi.size()==3) {
			this.prefissoNazionale= numeroPrefissi.get(0);
			this.numero=numeroPrefissi.get(1);
			this.numero=numeroPrefissi.get(2);
		}
		else {
			System.out.println("Formato non corretto!!");
		}

	}

	public List<String> toStrings(String numeroCompleto){
		List<String> numeroPrefissi =new ArrayList<String>();

		String[] arrayStringhe = numeroCompleto.split("-");



		numeroPrefissi=Arrays.asList(arrayStringhe);
		//oppure

		//for (int i=0; i<arrayStringhe.length; i++) {     length restituisce lunghezza array
		//numeroPrefissi.add(i,arrayStringhe[i] );

		//}

		return numeroPrefissi;

	}
	public String toString() {
		String numeroOutput = " ";
		if(!prefissoInternazionale.equals("0")) {
			numeroOutput =prefissoInternazionale+"-"+prefissoNazionale+"-"+numero;
		}else {
			numeroOutput=prefissoNazionale+"-"+numero;}
		return numeroOutput;
	}
}