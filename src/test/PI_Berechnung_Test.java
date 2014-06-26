package test;

import java.util.Scanner;

public class PI_Berechnung_Test {
	
	/**Einfachstes und kürzestes Programm zur Berechnung des Näherungswertes
	 * der Kreiszahl Pi im Einheitskreis mit einem Radius von r = 1*/

	public static void main(String[] args) 
	{
		System.out.println("Bitte geben Sie eine Anzahl von\nRechtecken für die Annäherung\nder Kreiszahl Pi an:\n");
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();//Eingabe der Anzahl der Rechtecke
		scanner.close();
		double PI = 0;//Näherungswert für PI, PI = 0 ist die Initialisierung der Variable
		int z = 1;//Startwert des Zählers
		int r = 1;//Radius des Einheitskreises

		while (z < n) 
		{
			PI = PI + 4*(r/n*Math.sqrt((Math.pow(r, 2)-(Math.pow(z/n, 2)))));//allgemeine Formel zur Berechnung des Näherungswertes für Pi
			z++;
		}
		System.out.println("\n");
		System.out.println("Die Annnäherung der Kreiszahl Pi im\nEinheitskreis bei " + z + " Rechtecken\nbeträgt:\n\n" + PI);
	}
}
