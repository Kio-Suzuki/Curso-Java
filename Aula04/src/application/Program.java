package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int a = sc.nextInt();
		System.out.print("Digite um valor: ");
		int b = sc.nextInt();
		
		System.out.println("SOMA = "+(a+b));

		sc.close();
	}

}
