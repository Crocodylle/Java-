package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class progam_1040_Average3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double  average2, media;
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();

		double average = ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / (2 + 3 + 4 + 1));
		System.out.printf("Media: %.1f%n", average);
		if (average < 5.0)
			System.out.println("Aluno reprovado.");
		else if (average >= 7.0) {
			System.out.println("Aluno Aprovado.");
		} else if (average >= 5.0 && average <= 6.9) {

			System.out.println("Aluno em exame.");
			media = sc.nextDouble();
			average2 = (average + media) / 2;
			String exame = (average2 >= 5) ? "Aluno aprovado." : "Aluno reprovado.";
			System.out.printf("Nota do exame: %.1f%n", media);
			System.out.println(exame);
			System.out.printf("Media final: %.1f%n", average2);

		}
       sc.close();
	}

}
