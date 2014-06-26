package test;

import java.util.Scanner;

public class Dreieck_Test {

	public static void main(String[] args) {
			
			print_triangle();
		
	}
	public static void print_triangle(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie die Anzahl der Reihen an:\n");
		int a = scanner.nextInt();
		scanner.close();
		System.out.println("\n");
		System.out.println("Ausgabe:\n\n");
		
		int b = a;//Anzahl der Reihen
		char star = '*';//ASCII Stern
		char space = ' ';//ASCII Leerzeichen
		String empty_space = new String();//Leerstellen
		String star_row = new String();//Sternreihe
 
		while(b > 0)
		{
			
			star_row = star_row + star + space;
			b--;
			empty_space = "";
			for(int i = 0; i < b; i++)
			{
				empty_space = empty_space + space;
			}
			System.out.println(space + empty_space + star_row);
		}
	}
}