package uri_Basics;

import java.util.Locale;
import java.util.Scanner;



public class problem_1009_SalaryWithBonus {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		String name = sc.next();
		double fixSal = sc.nextDouble(); 
		double sales = sc.nextDouble(); 
		
		double total = fixSal +(sales*0.15); 
		
		System.out.printf("TOTAL = R$ %.2f%n", total ,"\n");
		sc.close(); 

	}

}
