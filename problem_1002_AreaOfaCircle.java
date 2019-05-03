package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class problem_1002_AreaOfaCircle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		// double pi = 3.14159;d
		
		double raio = sc.nextDouble();
		double A = 3.14159*(Math.pow(raio, 2)); 
		System.out.printf("A=%.4f\n ", A);
		sc.close();

	}

}
