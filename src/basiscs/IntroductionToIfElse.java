package basiscs;

import java.util.Scanner;

public class IntroductionToIfElse {
	
	public static void main (String[]args){
		
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		/*
		 * if-else-Abfragen sind Überprüfungen von Eingaben
		 * */
		
		if(a < 0)//Abfrage, ob die Zahl kleiner als 0 ist
		{
			System.out.println("Die eingegebene Zahl ist negativ");	
		}
		else//Falls die eingegebene Zahl größer 0 ist, wird  
		{
			System.out.println("Die eingegebene Zahl ist positiv");
		}
		
		scanner.close();
	}

}
