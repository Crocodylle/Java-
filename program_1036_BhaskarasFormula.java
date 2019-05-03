package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1036_BhaskarasFormula {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
        double A = sc.nextDouble(); 
        double B = sc.nextDouble(); 
        double C = sc.nextDouble(); 
        
        double delta = Math.pow(B,2) - 4*A*C ; 
        
        if(delta <=0 || A ==0) { 
        	System.out.println("Impossivel calcular");
        }
        else {
        double x = (-B + Math.sqrt(delta))/(2*A); 
        double y = ( -B - Math.sqrt(delta))/(2*A); 
        
     //   System.out.println(delta);
        System.out.printf("R1 = %.5f\n", x);
        System.out.printf("R2 = %.5f\n", y);
        }
        
        sc.close(); 
	}
	

}
