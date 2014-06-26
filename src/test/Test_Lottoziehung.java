package test;

public class Test_Lottoziehung {

	public static void main(String[] args) {
		

		int[] a = new int [6];//Lottozahlen
 		for(int i = 0; i < a.length; i++)//Zufällige Wertzuweisung für den Array
		{
			a[i] = (int) (Math.random()*49 + 1);//Lottoziehung, zufällige Zahlen aus 49 Möglichkeiten
			System.out.println(i + 1 + ". gezogene Zahl ist: " + a[i]);//a[i] ist Zugriff auf den zugewiesenen Wert des Arrays	
		}
 		System.out.println("Die Lottozahlen in sortierter Reihenfolge:");
 		
	}
	public static int sort(int[] a, int n)
	{
		int x;
		int i;
		int j;
		for(i = 1; i < n; i++)
		{
			x = a[i];
			j = i-1;
			
			while((x < a[j]) && (j >= 0))
			{
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = x;
		}
		return i;
	}
}

/**void EinfSort(int a[], int n)
{
int x, i, j;
for (i=1; i< n; ++i) // Array an Position i teilen
{
x = a[i]; // einzuordnendes Element
j = i-1;
while ( (x < a[j]) && (j >= 0)) // a[i] solange nach links schieben
// bis an der richtige Stelle
{
a[j+1] = a[j]; // linker Nachbar nach rechts verschieben
j--;
}
a[j+1] = x; //Einfuegen an richtiger Position
}
}
*/