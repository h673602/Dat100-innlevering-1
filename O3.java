package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {

		int a = 1;

			String x = showInputDialog("Gi et tall: "); // Åpner dialogvindu for å få verdi fra bruker

			int tall = parseInt(x); // Gjør om input til tall
			
			for (int i = 1; i <= tall; i++) { // Løkke som repeterer utregning x ganger
				a = a * i;
		}
			System.out.print(tall + "! = " + a );
	}
}