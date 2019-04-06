package URI;

import java.util.Locale;
import java.util.Scanner;

public class program_1016_Distance {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in); 
	
	 int  km = sc.nextInt(); 
	
	 int min = (int) (km / ((90 / 60.0) - (60 / 60.0)));

	 System.out.printf("%d minutos\n", min);
	 sc.close(); 
	}

}
