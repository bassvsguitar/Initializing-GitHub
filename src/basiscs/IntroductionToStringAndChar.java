package basiscs;

public class IntroductionToStringAndChar {
	
	public static void main (String[]args){
		
		char c1 = 'H'; //char beschreibt "Characters" also Buchstaben
		char c2 = 'A'; //durch ' ' ersetzt man den Wert für Buchstaben in der ASCII-Tabelle mit den eigentlichen Zeichen 
		char c3 = 'L'; //chars sind int, also als ganze Zahlen definiert
		char c4 = 'O';
		
		String s1 = "WELT"; //ein String ist eine Zeichenkette aus Buchstaben
		
		
		System.out.println(c1 + "" + c2 + "" + c3 + "" + "" + c3 + "" + c4); //um einzelne chars aneinander zu hängen um ein Wort zu schreiben muss man die chars voneinander trennen, sonst wird es als mathematische Operation verstanden und es wird eine Zahl ausgegeben
		System.out.println(s1);
	}

}
 