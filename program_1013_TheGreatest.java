package URI;

import java.util.Locale;
import java.util.Scanner;



public class program_1013_TheGreatest {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int A = sc.nextInt();
		int B = sc.nextInt(); 
		int C = sc.nextInt(); 
		
		int MaiorAB = (A+B+Math.abs(A-B))/2 ; 
		int Maior = (MaiorAB+C+Math.abs(MaiorAB - C))/2 ; 
		
		System.out.println(Maior +" eh o maior");
		sc.close(); 
		
	}

}
