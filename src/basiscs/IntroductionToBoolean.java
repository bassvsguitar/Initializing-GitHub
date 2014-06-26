package basiscs;

import java.util.Scanner;

public class IntroductionToBoolean {
	
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie zwei Zahlen ein: ");
		int a = input.nextInt();
		int	b = input.nextInt();
		input.close();
		
		/*
		 * Initialisierung der boolean-Variable
		 * */
		
		boolean correct = true;//boolean-Variable "correct" wird mit wahr belegt
		boolean wrong 	= false;//boolean-Variable "wrong" wird mit falsch belegt
		
		/*
		 * Vergleich der beiden eingegebenen Zahlen,
		 * es wird verglichen, ob die beiden Zahlen
		 * den selben Wert haben.
		 * */
		
		if(a == b){//Überprüfung ob "a" und "b" gleich sind 
					
			System.out.println(correct);//"a" und "b" sind gleich, deshalb "true"
		}
		else{//alle anderen Ereignisse 
			
			System.out.println(wrong);//bei allen anderen Ereignissen "a" ungleich "b", deshalb "false"
		}
	}
}

