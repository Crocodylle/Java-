package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1035_SelectionTest1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		if ((B>C)&&(D>A)&&(C+D > A+B)&&(C>0 && D>0)&&(A%2 ==0)) { 
			System.out.printf("Valores aceitos\n");
		}
		else { 
			System.out.printf("Valores nao aceitos\n");
		}
	}

}
