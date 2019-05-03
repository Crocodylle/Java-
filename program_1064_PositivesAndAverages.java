package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1064_PositivesAndAverages {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float num, i, x = 0, y = 0;
		int positive = 0;
		for (num = 1; num <= 6; num++) {
			i = sc.nextFloat();
			if (i >= 0) {
				positive += 1;
				y += i;
				x = y / positive;
		}
		}
		System.out.print(positive + " valores positivo\n");
		System.out.printf("%.1f%n\n", x);
	}
}
