package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1037_Interval {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		float x = sc.nextFloat();

		if (x >= 0 && x <= 25.0000) {
			System.out.printf("Intervalo [0,25]\n");
		} else if (x >= 25.00001 && x <= 50.0000000) {
			System.out.printf("Intervalo (25,50]\n");
		} else if (x >= 50.0000001 && x <= 75.0000000) {
			System.out.printf("Intervalo (50,75]\n");
		} else if (x >= 75.0000001 && x <= 100.0000000) {
			System.out.printf("Intervalo (75,100]\n");
		} else {
			System.out.print("Fora do intervalo\n");
		}
		sc.close();
	}
}
