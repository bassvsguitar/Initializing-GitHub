package basiscs;

import java.util.Scanner;

public class IntroductionToReturnMethod {
	
	public static void main (String[]args){
		
		System.out.println("Bitte eine Zahl eingeben: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		input.close();
		
		System.out.println(multiplication(a));//Ausgabe des Rückgabewerts
	}
	/*
	 * Methoden ohne "void" erfordern einen Rückgabe-Befehl
	 * --> Rückgabe über "return"
	 */
	public static int multiplication(int a){//"Return"-Methode, IMMER STATIC!
		
		int result = a * a;
		return result;//Rückgabewert			
	}
}
