package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 1; i++) { // Løkke som starter på nytt dersom feil input blir gitt

			String x = showInputDialog("Hvor mye brutto lønn og annen personinntekt har du?: "); // Åpner dialogvindu for å få verdi fra bruker

			int Brutto = parseInt(x); // Gjør om input til tall

			int y = 100;

			double Prosent = Brutto / y; // Finner 1% av verdi

			double Trinnskatt = 0;	//Lager ny variabel som blir bestemt senere i koden

			if (Brutto >= 0 && Brutto < 208051) { // Bestemmer verdi av trinnskatt basert på input
				Trinnskatt = Prosent * 0;
			} else if (Brutto >= 208051 && Brutto < 292851) {
				Trinnskatt = Prosent * 1.7;
			} else if (Brutto >= 292851 && Brutto < 670001) {
				Trinnskatt = Prosent * 4.0;
			} else if (Brutto >= 670001 && Brutto < 937901) {
				Trinnskatt = Prosent * 13.6;
			} else if (Brutto >= 937901 && Brutto < 1350001) {
				Trinnskatt = Prosent * 16.6;
			} else if (Brutto >= 1350001) {
				Trinnskatt = Prosent * 17.6;
			} else { // Feilmelding dersom ugyldig verdi blir satt inn
				System.out.println("Ugyldig bruttoverdi, prøv på nytt");
			}
			if (Brutto >= 0) { // Tilbakemelding ved gyldig input
				System.out.println("Bruttolønn " + Brutto + ", Trinnskatt = " + Trinnskatt);
			} else { // Restart dersom feil input blir gitt
				i--;
			}
		}
	}
}