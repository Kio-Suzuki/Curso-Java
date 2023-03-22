package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Code of piece 1: ");
		int code1 = sc.nextInt();
		System.out.print("Number of pieces: ");
		int np1 = sc.nextInt();
		System.out.print("Value: ");
		float v1 = sc.nextFloat();
		
		System.out.print("Code of piece 2: ");
		int code2 = sc.nextInt();
		System.out.print("Number of pieces: ");
		int np2 = sc.nextInt();
		System.out.print("Value: ");
		float v2 = sc.nextFloat();
		
		System.out.printf("TOTAL : R$ %.2f",(np1*v1+np2*v2));
		
		sc.close();
	}

}
