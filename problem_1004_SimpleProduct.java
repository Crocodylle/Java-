package URI;

import java.util.Locale;
import java.util.Scanner;

public class problem_1004_SimpleProduct {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// int PROD = num1*num2;
		// System.out.print("PROD = " + PROD +"\n");
		System.out.print("PROD = " + (num1 * num2) + "\n");

		sc.close();
	}

}
