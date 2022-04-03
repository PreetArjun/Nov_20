package find;

public class Arrayprime {
	public static void main(String[] args) {
		
	
	 int i,x;
	
	 int a[] = {9,4,1,6,7,98,97,11,17};
	  for(i=0; i<a.length; i++)		  
	  {
	       for(x=2; x<a[i]/2; i++)
	       {
		     if(a[i]%x==0)
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


