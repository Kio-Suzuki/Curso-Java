package application;

import java.util.Locale;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee number: ");
		int num = sc.nextInt();
		System.out.print("Hours worked: ");
		int hour = sc.nextInt();
		System.out.print("Salary per hour: ");
		float salary = sc.nextFloat();
		
		System.out.println("NUMBER = "+num);
		System.out.println("SALARY = U$ "+(hour*salary));
		
		sc.close();
	}

}
