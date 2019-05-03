package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1043_Triangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double trap, tri;
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
       	boolean tri1 =  (Math.abs(B - C) < A) &&(A < (B + C));
		boolean tri2 = (Math.abs(A - C) < B) && (B < (A + C));
		boolean tri3 = ((Math.abs(A - B) < C) && C < (A + B));
        
	
//		System.out.println(tri1);
//		System.out.println(tri2);
//		System.out.println(tri3);
		
		if (tri1 == true && tri2 == true && tri3 == true) {
			 tri = A + B + C;
			System.out.printf("Perimetro = %.1f%n", tri);
		} else {
			trap = C * ((A + B) / 2);
			System.out.printf("Area = %.1f%n", trap);

		}
		sc.close();

	}
}
