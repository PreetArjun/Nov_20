package find;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		
		int n,temp=0;
		 
		 System.out.println("Enter a Number:");
	     Scanner sc = new Scanner(System.in);
	     n = sc.nextInt();
	     
	     for(int i =1; i<=n; i++)
	     {
	    	 for(int j =2; j<i; j++)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			temp = temp+1;
	    		 }
	    	 }
	    	 if(temp == 0)
	    	 {
	    		 System.out.println(i);
	    	 }
	    		 else
	    		 {
	    			 temp =0;
	    		 }
	    	 
	     }
		
	 }
	
}

