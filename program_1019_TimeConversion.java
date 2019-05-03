package uri_Basics;

import java.util.Locale;
import java.util.Scanner;

public class program_1019_TimeConversion {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int sec = sc.nextInt(); 
		
		int hora =  sec%3600;
        int min = hora%60;
            
        System.out.printf("%d:%d:%d\n", sec/3600,hora/60,min/1);
        sc.close();  
	}

}
