package find;

import java.util.Scanner;

public class AmstrongNo {            // 153, 370, 371, 407, 1634
	
	//SUM OF THE CUBES OF THE DIGITS OF ANY NUMBER IS EQUAL TO THE NUMBER ITSELF
	
	public static void main(String[] args) {
		
	  int number; // 1*1*1+5*5*5+6*6*6
		int store = 0;
		int n,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter number=");
		n= sc.nextInt();
		number = n;
		
		while(n > 0)
	   // for(n = number; number!=0; number = number/10)
		{
			temp = n%10; 
			store = store+temp*temp*temp;
			n = n/10;
		}
		
		
		if(store == number)
		{
			System.out.println("No. is Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}
		
		
	}

}
