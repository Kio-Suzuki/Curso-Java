package application;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("A = ");
		int A = sc.nextInt();
		System.out.print("B = ");
		int B = sc.nextInt();
		System.out.print("C = ");
		int C = sc.nextInt();
		System.out.print("D = ");
		int D = sc.nextInt();
		
		System.out.println("DIFERENCA = "+(A*B-C*D));
		
		sc.close();

	}

}
