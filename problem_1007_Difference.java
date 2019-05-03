package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class problem_1007_Difference {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int A = sc.nextInt();
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		int D = sc.nextInt(); 
		
		int difference = (A*B-C*D); 
		System.out.printf("DIFERENCA = " + difference + "\n");
		sc.close();
	}

}
