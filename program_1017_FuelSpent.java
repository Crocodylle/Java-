package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1017_FuelSpent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double hours = sc.nextDouble();
		double km = sc.nextDouble();

		double total = hours * km / 12;

		System.out.printf("%.3f%n", total, "\n");
		sc.close();

	}

}
