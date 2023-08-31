package it.apuliadigitalmaker.esercitazioni;

public class EsercitazioneQuattro {
	public static void main (String[]args) {
		

		
		double sommaIniziale = 1000;
		double interesse = 3;
		
		double i = (sommaIniziale/100*3);
		
		
		sommaIniziale = sommaIniziale+i;
		System.out.println("La somma dopo anni 1 è di " + sommaIniziale);
		sommaIniziale = sommaIniziale+i;
		System.out.println("La somma dopo anni 2 è di " + sommaIniziale);
		sommaIniziale = sommaIniziale+i;
		System.out.println("La somma dopo anni 3 è di " + sommaIniziale);
		
	};  

    
}


