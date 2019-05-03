package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1066_EvenOddPositiveAndNegative {

	public static void main(String[] args) {
		int num, i, even = 0, odd = 0, positive = 0, negative = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		for (num = 1; num <= 5; num++) {
			i = sc.nextInt();
			if (i % 2 == 0) {
				even += 1;
			}
			if (i % 2 != 0) {
				odd += 1;

			}
			if (i < 0) {
				negative += 1;

			}
			if (i >= 0) {
				positive += 1;

			}

		}
		System.out.print(even + " valor(es) par(es)\n");
		System.out.print(odd + " valor(es) impar(es)\n");
		System.out.print(positive + " valor(es) positivo(s)\n");
		System.out.print(negative + " valor(es) negativo(s)\n");
		sc.close();
	}

}
