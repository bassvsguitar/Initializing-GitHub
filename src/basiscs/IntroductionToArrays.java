package basiscs;

public class IntroductionToArrays {

	public static void main(String[] args) {
		
		int a[];//Initialisierung des Arrays 
		a = new int[10];//a ist ein Array mit 10 Feldern bzw. Komponenten
						//--> konventionellerweise wird bei 0 an Stelle von 1 angefangen, deshalb 
						//    wird in diesem Beispiel wie folgt indexiert:
						//    [0][1][2][3][4][5][6][7][8][9]
		
		a[0] =  10;
		a[1] =  20;
		a[2] =  30;
		a[3] =  40;
		a[4] =  50;
		a[5] =  60;
		a[6] =  70;
		a[7] =  80;
		a[8] =  90;
		a[9] = 100;
		
		System.out.println(a[0] + "|" +
						   a[1] + "|" +
						   a[2] + "|" +
						   a[3] + "|" +
						   a[4] + "|" +
						   a[5] + "|" +
						   a[6] + "|" +
						   a[7] + "|" +
						   a[8] + "|" +
						   a[9] + "|");

	}

}
