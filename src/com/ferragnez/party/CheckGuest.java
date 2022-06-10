package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// creare e inizializzare l’array contenente i nomi degli invitati
		String [] listaInvitati = new String[11];	
		
		listaInvitati[0] = "Dua Lipa";
		listaInvitati[1] = "Paris Hilton";
		listaInvitati[2] = "Manuel Agnelli";
		listaInvitati[3] = "J-Ax";
		listaInvitati[4] = "Francesco Totti";
		listaInvitati[5] = "Ilary Blasi";
		listaInvitati[6] = "Bebe Vio";
		listaInvitati[7] = "Luis";
		listaInvitati[8] = "Pardis Zarei";
		listaInvitati[9] = "Martina Maccherone";
		listaInvitati[10] = "Rachel Zeilic";
		
		// Imposto le variabili necessarie
		String nomeOspite;
		boolean nomePresente= false;
		
		// Chiedo all'utente di inserire il nome
		nomeOspite = null;
		System.out.println("Inserisci il tuo nome : ");
		nomeOspite = scan.nextLine();
		
		// Imposto il ciclo per controllare se il nome è in lista
		for (int i=0; i<listaInvitati.length; i++) {
			if (nomeOspite.equalsIgnoreCase(listaInvitati[i]))
			nomePresente = true;
		}
		
		// Restituisco la risposta 
		if (nomePresente == true) {
			System.out.println("Benvenuto a casa Ferragnez");
		} else 
			System.out.println("Il tuo nome non è in lista, non può entrare");
	
			
		
		scan.close();
	}

}
