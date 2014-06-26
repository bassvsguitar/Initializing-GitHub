package basiscs;

public class IntroductionIntFloatDouble {
	
	public static void main (String[]args){
		
		int a = 1; //int = ganz-rationale Zahlen, keine Nachkommastellen
		double b = 1.1111111111111111; //double = gebrochen-rationale Zahlen mit 64 Bit, 15 Nachkommastellen
		float c = (float) 1.11111111; //float = gebrochen-rationale Zahlen mit 32 Bit, 7 Nachkomastellen, Achtung: Muss ge-casted werden!
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
