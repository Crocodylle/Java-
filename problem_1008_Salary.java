package URI;

import java.util.Locale;
import java.util.Scanner;

public class problem_1008_Salary {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		int  hours = sc.nextInt();
		double pay = sc.nextDouble();

		double salary = hours * pay;

		System.out.printf("NUMBER = " + id);
		System.out.println();
		System.out.printf("SALARY = U$ %.2f%n", salary, "\n");
					
		sc.close();
	}

}
