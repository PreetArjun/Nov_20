package concept;

public class Largest_NO {
	
	 
	   
	   public static void main(String[] args) {
		   
		   int  a [] = {12,11,56,78,99,34,67,999,56,85};
		   int maxa = a[0];
		  
		   
		   for (int i=0; i<a.length; i++)
		   {
			   if(a[i]>maxa)
			   {
				   maxa = a[i];
			   }
		   }
		   System.out.println("Largest No is " +  maxa);
	}

}
