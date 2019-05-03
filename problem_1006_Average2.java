package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class problem_1006_Average2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		double MEDIA = ((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5);

		System.out.printf("MEDIA = %.1f%n", MEDIA, "\n");
		sc.close();

	}

}
