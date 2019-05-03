package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1046_GameTime {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int tempo;
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x >= y) {
			tempo = (24 - x) + y;
			System.out.printf("O JOGO DUROU %d HORA(S) \n", tempo);
		} else {
			tempo = (y - x);
			System.out.printf("O JOGO DUROU %d HORA(S) \n", tempo);
		}

	}

}
