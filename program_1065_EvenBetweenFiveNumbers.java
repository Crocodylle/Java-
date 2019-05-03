package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1065_EvenBetweenFiveNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num, i, x, even = 0;

		for (num = 1; num <= 5; num++) {
			i = sc.nextInt();
			if (i % 2 == 0) {
				even += 1;
			}  
			
		}
		System.out.printf(even+" valores pares\n");
		
		
	}

}
