package basiscs;

import java.util.Scanner;

public class IntoductionToMathematicalOperators {
	
	public static void main (String [] args){
		
		
		System.out.println("Bitte geben Sie zwei Zahlen ein: ");
		Scanner keyboard   = new Scanner(System.in);//Tastaur-Eingabe
		
		double a = keyboard.nextInt();//Abfrage der Tastatur-Eingabe
		double b = keyboard.nextInt();
		
		double result  = a + b;//Addition
		double result2 = a - b;//Subtraktion
		double result3 = a * b;//Multiplikation
		double result4 = a / b;//Division
		double result5 = a % b;//Modulo (Rest aus der Division)
		double result6 = Math.pow(a, b);//Potenz, Basis a zum Exponenten b
		double result7 = Math.sqrt(a);//Wurzel aus a
		
		keyboard.close();
		
		System.out.println("Das Ergebnis von " + a + " + " + b + " = " + result);
		System.out.println("Das Ergebnis von " + a + " - " + b + " = " + result2);
		System.out.println("Das Ergebnis von " + a + " * " + b + " = " + result3);
		System.out.println("Das Ergebnis von " + a + " : " + b + " = " + result4);
		System.out.println("Der Rest der Division von " + b + " von " + a + " = " + result5);
		System.out.println("Das Ergebnis der Potenz der Basis " + a + " mit dem Exponenten " + b + " = " + result6);
		System.out.println("Das Ergebnis der Wurzel aus " + a + " = " + result7);
		
		
		
		
	}

}
