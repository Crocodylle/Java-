package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class problem_1011_Sphere {

	public static void main(String[] args) {
	  Locale.setDefault(Locale.US);
	  Scanner sc = new Scanner(System.in); 
	  double pi = 3.14159;  
	  double radius = sc.nextDouble(); 
	  
	  double volume = (4/3.0)*pi*(Math.pow(radius, 3)); 
      System.out.printf("VOLUME = %.3f%n", volume, "\n");
      sc.close();
	}

}
