package it.epicode.be;

import java.util.Arrays;

public class esercizio2 {

	public static void main (String[] args) {
		
		// --- moltiplica: due interi e ritorna il loro prodotto
		byte x = 10;
		byte y = 15;
		int result = x * y;
		System.out.println("1) " + result);
		
		// --- concatena: una stringa e un intero
		// metodo 1
		String testo = "Eta:";
		byte num = 18;
		
		System.out.println("2a) " + testo + num);
		
		// metodo 2
		String nome = "Mario";
		String cognome = "Rossi";
		String persona = nome.concat(cognome);
		
		System.out.println("2b) " + persona);
		
		// --- inserisci in array una stringa al terzo posto facendo scalare gli altri
		String z = "patata"; // la stringa da inserire al terzo posto
		
		String[] array = {"a", "b", "c", "d", "e"}; // array vecchio
		String[] arrayNuovo = new String[6]; // array nuovo con 6 posti

		// l'unica soluzione che son riuscito a trovare con le conoscenze attuali
		arrayNuovo[0] = array [0];
		arrayNuovo[1] = array [1];
		arrayNuovo[2] = z;
		arrayNuovo[3] = array [2];
		arrayNuovo[4] = array [3];
		arrayNuovo[5] = array [4];
		
		System.out.println("3) " + Arrays.toString(arrayNuovo));
	}
	
}
