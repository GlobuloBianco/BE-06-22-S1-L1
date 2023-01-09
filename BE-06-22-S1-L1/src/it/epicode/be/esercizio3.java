package it.epicode.be;

import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci primo messaggio:");
		String mess1 = scanner.nextLine();
		
		System.out.println("Inserisci secondo messaggio:");
		String mess2 = scanner.nextLine();
		
		System.out.println("Inserisci terzo messaggio:");
		String mess3 = scanner.nextLine();
		
		System.out.println("ordine inserimento: " + mess1 + " " + mess2 + " " + mess3);
		System.out.println("ordine inverso: " + mess3+ " " + mess2 + " " + mess1);
	}

}
