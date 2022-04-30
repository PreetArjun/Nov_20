package extra;

public class Practiccee {
	
public static void main(String[] args) {
	
      System.out.println(" Pattern 1");

	  for(int i =0; i<5; i++) // line
		{
		  for(int j =4; j>=i; j--)
			{
				System.out.print(" ");
			}
			 for(int k = 0; k<=i; k++)
			 {
				 System.out.print(" *");
			 }
			     System.out.println();
		}
	  
	  for(int l =0; l<=5; l++) 
	    {
		for(int m = 1; m<=l; m++) //space
		{
			System.out.print(" ");
		}
	  for(int n = 5; n>=l; n--)
		{
			System.out.print(" *");
		}
	  
		  System.out.println();
	    }
	  
	  System.out.println(" Pattern 2");
	  for(int a =0; a<=4; a++)
	  {
		  for(int b = 0; b<=a; b++)
		  {
			  System.out.print("*");
		  }
		      System.out.println();
	  }
	  
	  for(int c = 0; c<=5; c++)
	  {
		  for(int d =5; d>=c; d--)
		  {
			  System.out.print("*");
		  }
		      System.out.println();
	  }
	  
	  System.out.println(" Pattern 3");
	  
	  for(int x =0 ; x<=5; x++) // line
	  {		   
		  for(int y = 4; y>=x; y--)
		  {
			  System.out.print(" ");
		  }
		  for(int z = 0; z<=x; z++)
		  {
			 System.out.print("*");
		  }
		 for(int z1 =1; z1<=x; z1++)
		 {
			 System.out.print("*");
		 }
		     System.out.println();		  
	  }	 	 
	  }			
}