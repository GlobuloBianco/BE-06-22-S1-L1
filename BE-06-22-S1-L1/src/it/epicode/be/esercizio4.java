package it.epicode.be;

public class esercizio4 {

	public static void main(String[] args) {
		// --- calcola il perimetro di un rettangolo
		// formula (larghezza + lunghezza) * 2
		double larghezza = 10.5;
		double lunghezza = 25.3;
		double perimetro = (larghezza + lunghezza) * 2;
		System.out.println("il perimetro del rettangolo è di: " + perimetro);
		
		// --- pariDispari
		byte numero = 69;
	    // verifica se il resto che esce è 0 (pari) o no
	    if (numero % 2 == 0) {
	      System.out.println(numero + " è pari");
	    } else {
	      System.out.println(numero + " è dispari");
	    }
	    
	    // --- calcola l'area di un triangolo
		// formula (base * altezza) / 2
		double base = 15.6;
		double altezza = 22.9;
		double area = (base * altezza) / 2;
		// siccome tante volte esce i decimali stra lunghi ho deciso di fare un arrotondamento
		double arrotondato = Math.round(area * 100.0) / 100.0;
		System.out.println("l'area del triangolo è di: " + arrotondato);
	    
	}

}
