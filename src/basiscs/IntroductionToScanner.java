package basiscs;

import java.util.Scanner; //Import Deklaration, man kann Klassen aus der Java Bibliothek importieren, diese  muss man nicht schreiben, einamal importiert kann man sie verwenden

public class IntroductionToScanner {
	
	public static void main (String[]args){
		
		Scanner scanner = new Scanner(System.in);//Eingabe lesen
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("Bitte ein ganze Zahl eingeben:");
		int z1 = scanner2.nextInt();//Eingabe liest eine ganze Zahl
		System.out.println("Bitte eine weitere ganze Zahl eingeben:");
		int z2 = scanner2.nextInt();
		System.out.println("Bitte ein Wort mit 5 Buchstaben eingeben:");
		int z3 = z1+z2;//Addition
		
		String line = scanner.nextLine();//Eingabe liest eine Zeichenkette
		char c1 = line.charAt(0);//Zeichen an 1. Stelle usw.(in Java fängt man bei 0 an zu zählen)
		char c2 = line.charAt(1);
		char c3 = line.charAt(2);
		char c4 = line.charAt(3);
		char c5 = line.charAt(4);
		
		
		scanner.close(); //Beenden des Lesevorgangs
		scanner2.close();
		
		System.out.println("Buchstabe an 1. Stelle = " + c1);
		System.out.println("Buchstabe an 2. Stelle = " + c2);
		System.out.println("Buchstabe an 3. Stelle = " + c3);
		System.out.println("Buchstabe an 4. Stelle = " + c4);
		System.out.println("Buchstabe an 5. Stelle = " + c5);
		
		System.out.println("\nDas Ergebnis der Summe der Zahlen " + z1 + " und " + z2 + " = " + z3);
		
	}


}
