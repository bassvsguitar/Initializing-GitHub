package test;

import java.util.Scanner;

public class PI_Berechnung_Test {
	
	/**Einfachstes und k�rzestes Programm zur Berechnung des N�herungswertes
	 * der Kreiszahl Pi im Einheitskreis mit einem Radius von r = 1*/

	public static void main(String[] args) 
	{
		System.out.println("Bitte geben Sie eine Anzahl von\nRechtecken f�r die Ann�herung\nder Kreiszahl Pi an:\n");
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();//Eingabe der Anzahl der Rechtecke
		scanner.close();
		double PI = 0;//N�herungswert f�r PI, PI = 0 ist die Initialisierung der Variable
		int z = 1;//Startwert des Z�hlers
		int r = 1;//Radius des Einheitskreises

		while (z < n) 
		{
			PI = PI + 4*(r/n*Math.sqrt((Math.pow(r, 2)-(Math.pow(z/n, 2)))));//allgemeine Formel zur Berechnung des N�herungswertes f�r Pi
			z++;
		}
		System.out.println("\n");
		System.out.println("Die Annn�herung der Kreiszahl Pi im\nEinheitskreis bei " + z + " Rechtecken\nbetr�gt:\n\n" + PI);
	}
}
