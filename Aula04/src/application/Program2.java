package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do raio: ");
		double raio = sc.nextDouble();
		
		double area = raio * raio * 3.14159;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
