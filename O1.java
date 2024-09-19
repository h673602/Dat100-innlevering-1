package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) { // Løkke som setter opp for 10 inputs

			String x = showInputDialog("Gi et tall: "); // Åpner dialogvindu for å få verdi fra bruker

			int tall = parseInt(x); // Gjør om input til tall

			String Karakter = (""); // Setter variabel for karakter

			if (tall >= 0 && tall < 40) { // Bestemmer verdi av karakter variabel
				Karakter = ("F");
			} else if (tall >= 40 && tall < 50) {
				Karakter = ("E");
			} else if (tall >= 50 && tall < 60) {
				Karakter = ("D");
			} else if (tall >= 60 && tall < 80) {
				Karakter = ("C");
			} else if (tall >= 80 && tall < 90) {
				Karakter = ("B");
			} else if (tall >= 90 && tall <= 100) {
				Karakter = ("A");
			} else { // Feilmelding dersom ugyldig verdi blir satt inn
				System.out.println("Ugyldig poengsum, prøv på nytt");
			}
			if (tall >= 0 && tall <= 100) { // Tilbakemelding basert på input
				System.out.println("Student " + i + ", Poengsum = " + tall + " Karakter: " + Karakter);
			} else { // Fiks for løkketall dersom feil input blir gitt
				i--;
			}
		}
	}
}