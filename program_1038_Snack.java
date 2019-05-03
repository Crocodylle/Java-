package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1038_Snack {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();

		switch (x) {
		case 1:
			num = y * 4;
			System.out.printf("Total: R$ %.2f\n", num);
			break;
		case 2:
			num = y * 4.5;
			System.out.printf("Total: R$ %.2f\n", num);
			break;
		case 3:
			num = y * 5;
			System.out.printf("Total: R$ %.2f\n", num);
			break;
		case 4:
			num = y * 2;
			System.out.printf("Total: R$ %.2f\n", num);
			break;
		case 5:
			num = y * 4.5;
			System.out.printf("Total: R$ %.2f\n", num);
			break;

		}
		sc.close();
	}

}
