package test;

import java.util.Scanner;

public class Test_Sinus {
	
	public static void main(String[] args) {
		
		System.out.println("Bitte geben Sie eine Wert für 'x' für sin(x) ein:");	
		Scanner scanner = new Scanner(System.in);
		int grad = scanner.nextInt();  //hier beliebige 'grad'-Zahl eingeben
		scanner.close();
		double intorad = grad*Math.PI/180;// 'grad' muss erst noch in Bogenmaß umgerechnet werden (deg in rad)
		double ergebnis = (sin(intorad));
		System.out.println("sin("+ grad +") = " + ergebnis +"(deg)");
		double sinus = Math.sin(grad);   //mit Formel gerechnet
		System.out.println("sin("+ grad +") = " + sinus +"(rad)");	//ACHTUNG: Formel rechnet in Rad! (2PI)
	}
	public static double sin(double x){
		
		double zaehler = x; 
		double nenner = 1.0;  
		double summe = x; 
		double summand = x;
	
		for (int i = 3; summand > 1E-15 || summand < -1E-15; i = i + 2)
		{
			zaehler = zaehler * x * x * (-1);
			nenner = nenner * i * (i - 1);
			summand = zaehler / nenner;
			summe = summe + summand;
		}
	return summe;
	}
}

