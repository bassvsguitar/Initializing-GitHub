package basiscs;

import java.util.Scanner;

public class IntroductionToElseIf {
	
	public static void main (String[]args){
		
		System.out.println("Bitte geben Sie eine Zahl ein: ");
		Scanner keyboard = new Scanner(System.in);
		
		int a = keyboard.nextInt();
		
		/*
		 * else-if ist eine erweiterte if-Anweisung
		 * läuft aber genauso ab wie eine if- bzw. 
		 * else-Anweisung
		 * */
		
		if(a < 0)
		{
			System.out.println("Die eingegebene Zahl ist negativ");
		}
		else if(a > 0)
		{
			System.out.println("Die eingegebene Zahl ist positiv");
		}
		else
		{
			System.out.println("Die Zahl ist 0");
		}
		
		keyboard.close();
		
	}

}
