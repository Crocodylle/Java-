package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1067_OddNumbers {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i;
		int X = sc.nextInt();
		for (i = 1; i <= X; i++) {
			if (i % 2 != 0) {
				System.out.printf(i +"\n");
			}
		}
	}
}
