package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1012_Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in); 
		double pi = 3.14159;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble(); 
		
		double triangulo = (C*A)/2;
		double circulo = pi*Math.pow(C, 2); 
		double trapezio = C*(A+B)/2 ;  
		double square = Math.pow(B, 2); 
		double rectangle = A*B; 
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", square);
		System.out.printf("RETANGULO: %.3f%n", rectangle, "\n");
		sc.close();
		

	}

}
