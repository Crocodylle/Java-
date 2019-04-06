package URI;

import java.util.Locale;
import java.util.Scanner;

// Somatoria de 2 numeros 

public class problem_1001_ExtremelyBasic {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc =  new Scanner(System.in); 
	   
	  
	   int a = sc.nextInt(); 
	   int b = sc.nextInt(); 
	   
	   int X = a + b; 
	   System.out.print("X = "+X+"\n"); 
	   sc.close();
	}

}
