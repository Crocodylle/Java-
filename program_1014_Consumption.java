package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1014_Consumption {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double X = sc.nextDouble();
		double Y = sc.nextDouble();

		System.out.printf("%.3f km/l\n", (X/Y));
		sc.close();

	}

}
