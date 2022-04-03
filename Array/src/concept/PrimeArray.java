package concept;

public class PrimeArray {
	      static int a[] = {1,12,10,9,11,13,17,14};	
       //   static int i[] = { };
	public static void main(String[] args) {
		for(int i=0; i<a.length; i++)
		{
			{
               for(int j=2; j<=(a[i]/2); j++)
				 {
				
					       if((a[i]%j)==0)
					 {
						 System.out.println();
					 }
					 else
					 { 
						 System.out.println(a[i]);
						 
					 }

		
				 }
				 }
             
         }
	}
}