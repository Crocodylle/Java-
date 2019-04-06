package URI;

import java.util.Locale;
import java.util.Scanner;

public class program_1020_BanknotesAndCoins {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notes = sc.nextDouble();
		double aux;
        notes = (int) notes; 
		System.out.printf("%d\n", notes);

		System.out.printf("%d nota(s) de R$ 100,00\n", notes / 100);
		aux = (notes % 100);

		System.out.printf("%d nota(s) de R$ 50,00\n", Math.ceil(aux / 50));
		aux = (aux % 50);

		System.out.printf("%d nota(s) de R$ 20,00\n", aux / 20);
		aux = aux % 20;

		System.out.printf("%d nota(s) de R$ 10,00\n", aux / 10);
		aux = aux % 10;

		System.out.printf("d nota(s) de R$ 5,00\n", aux / 5);
		aux = aux % 5;

		System.out.printf("%d nota(s) de R$ 2,00\n", aux / 2);
		aux = aux % 2;
		       
		System.out.printf("MOEDAS:\n");
		
		System.out.printf("%d moeda(s) de R$ 1,00\n", aux / 1);
		aux = aux%1; 
		System.out.printf("%d moeda(s) de R$ 0,50\n", aux /0.5);
		aux = aux%0.50; 
		System.out.printf("%d moeda(s) de R$ 0,25\n", aux / 0.25);
		 aux = aux%0.25;
		System.out.printf("%d moeda(s) de R$ 0,10\n", aux / 0.10);
		 aux = aux%0.10; 
		System.out.printf("%d moeda(s) de R$ 0,05\n", aux / 0.05);
		 aux = aux%0.05; 
		System.out.printf("%d moeda(s) de R$ 0,01\n", aux / 1);
		
		sc.close();

	}

}
