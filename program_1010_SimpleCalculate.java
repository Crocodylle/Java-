package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1010_SimpleCalculate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int code = sc.nextInt(); 
		int quant1 = sc.nextInt(); 
		double valor1 = sc.nextDouble(); 
		
		int code2 = sc.nextInt();
		int quant2 = sc.nextInt(); 
		double valor2 = sc.nextDouble();  
		
		double pagar =  (quant1*valor1)+(quant2*valor2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",pagar,"\n" );
		sc.close();
	}

}
