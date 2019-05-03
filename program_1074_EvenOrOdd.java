package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1074_EvenOrOdd {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int N = sc.nextInt();

		for (x = 1; x <= N; x++) {

			int num1 = sc.nextInt();

			if (num1 % 2 == 0 && num1 < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (num1 % 2 == 0 && num1 > 0) {
				System.out.println("EVEN POSITIVE\n");
			} else if (num1 % 2 != 0 && num1 > 0) {
				System.out.println("ODD POSITIVE\n");
			} else if (num1 % 2 != 0 && num1 < 0) {
				System.out.println("ODD NEGATIVE\n");
			} else if (num1 == 0) {
				System.out.println("NULL\n");
			}
			sc.close();
		}

	}

}
