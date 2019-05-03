package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1070_SixOddNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i;
		int N = 12;
		int X = sc.nextInt();

		for (i = X; i <= (X + N); i++) {
			if (i % 2 != 0) {

				System.out.printf(i + "\n");
			}

		}

		sc.close();
	}

}
