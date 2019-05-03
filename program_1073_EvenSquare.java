package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1073_EvenSquare {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, i;
		int N = sc.nextInt();

		for (i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				x = (int) Math.pow(i, 2);

				System.out.printf("%d^2 = %d\n", i, x);
				System.out.println();

			}

		}

	}
}
