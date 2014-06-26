package test;

import java.util.Scanner;

public class Methoden_Test1 {
	
	public static void main (String[]args){
		
		System.out.println("Bitte einen Wert Eingeben:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		System.out.println("Rückgabewert für " + a + " quadriert: " +Rechnung(a));//Ausgabe der Methode
		
	}	
	public static int Rechnung(int a){//Methode "Rechnung"
			
		return a*a;//Rückgabe 
	}
}
