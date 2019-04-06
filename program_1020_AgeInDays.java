package URI;

import java.util.Locale;
import java.util.Scanner;

public class program_1020_AgeInDays {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int days = sc.nextInt(); 
		
		int meses = days%365; 
		int dias = meses%30; 
		
		System.out.printf("%d ano(s)\n", days/365);
        System.out.printf("%d mes(es)\n", meses/30);
        System.out.printf("%d dia(s)\n", dias);
        
        sc.close(); 
	}

}
