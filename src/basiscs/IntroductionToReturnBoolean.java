package basiscs;

import java.util.Scanner;

public class IntroductionToReturnBoolean {

	public static void main (String[]args){
		
		System.out.println("Please enter the password: ");
		Scanner input = new Scanner(System.in);
		String password = input.nextLine();
		
		if(password.equals("PASSWORD")){
			
			System.out.println("Access granted!");
		}
		else if(!(password.equals("PASSWORD"))){
			
			System.out.println("Access denied!");
		}
		input.close();
		
	}
	
	/*
	 * boolean-return-Methode
	 * (return-Methoden: Siehe "Introduction to return-Method"
	 * */
	public static boolean checkpassword(String a){
		
		if(a.equals("PASSWORD")){//object x.equals(object y) wird für die Überprüfung von Strings verwendet
								 //Zusatz: Mit ignoreCase kann Groß- bzw. Kleinschreibung vernachlässigt werden
			return true;		 
		}
		else if(!(a.equals("PASSWORD"))){//!(object x.equals(object y) bedeutet, dass die Objekte ungleich sind
			
			return false;
		}
		return false;	
	}
}
