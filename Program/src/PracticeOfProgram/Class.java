package PracticeOfProgram;

 import java.util.Scanner;

 public class Class {
	
 public static void main(String[] args) {
		int  a,n,ld,store=0;
	    System.out.println("Enter a Number:");
		Scanner sc =new Scanner(System.in);
		a = sc.nextInt();
		n=a;
		while(n>0)
		{
			ld = n%10;
			store = store+ld*ld*ld;			
			n = n/10;			
		}		
		
		if(store==a)
		{			
         System.out.println("No is Amstrong");	  
		}
		else
		{ 
			System.out.println("Not Amstrong ");
		}
		
	}
 }

