package application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A = ");
		double A = sc.nextDouble();
		System.out.print("B = ");
		double B = sc.nextDouble();
		System.out.print("C = ");
		double C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n",(A*C/2));
		System.out.printf("CIRCULO: %.3f%n", (C*C*3.14159));
		System.out.printf("TRAPEZIO: %.3f%n", ((A+B)*C/2));
		System.out.printf("QUADRADO: %.3f%n", B*B);
		System.out.printf("RETANGULO: %.3f%n", A*B);
		
		sc.close();

	}

}
