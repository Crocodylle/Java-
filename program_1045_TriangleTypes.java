package uri_Basics;


import java.util.Scanner;

public class program_1045_TriangleTypes {

	Scanner sc = new Scanner(System.in);
	
	double A = sc.nextDouble();
	double B = sc.nextDouble();
	double C = sc.nextDouble();
	{
	

	if(A>=(B+C)){
		System.out.println("NAO FORMA TRIANGULO");
	}
	else if((Math.pow(A,2)==(Math.pow(B,2)+Math.pow(C,2))))
	{
		System.out.println("TRIANGULO RETANGULO");
	}
	else if((Math.pow(A,2)>(Math.pow(B,2)+Math.pow(C,2))))
	{
		System.out.println("TRIANGULO OBTUSANGULO");
	}
	else if((Math.pow(A,2)>(Math.pow(B,2)+Math.pow(C,2))))
	{
		System.out.println("TRIANGULO ACUTANGULO");
	}
	else if((A==B)&& (A==C))
	{
		System.out.println("TRIANGULO EQUILATERO");
	}
	else if(((A==B)&&(A!=C))||((B==C)&&(A!=B)))
	{
		System.out.println("TRIANGULO ISOSCELES");
	}
	  sc.close();
  
	}
}
