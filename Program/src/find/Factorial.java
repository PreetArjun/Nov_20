package find;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int a,Input , fact = 1;
		//int Input =5;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter No. for factorial  = ");
		Input = obj.nextInt();
		for(a=1; a<=Input; a++)
		{
			fact = fact*a;
		}
		System.out.println(fact);
	}
}
