package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1071_SumOfConsecutiveOddNumbers1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x;
		int sum = 0;
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A > B) {
			for (x = B + 1; x < A; x++) {

				if (x % 2 != 0) {
					sum = sum + x;
				}
			}
		} else if (A < B)
			for (x = A - 1; x < B; x--) {

				if (x % 2 != 0) {
					sum = sum + x;
				}
			}
		System.out.println(sum+"\n");
	}

}
