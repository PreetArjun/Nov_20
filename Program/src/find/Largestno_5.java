package find;

public class Largestno_5 {
	
	 public static void main(String[] args){
			int a = 100080;
			int b = 399;
			int c = 9996;
			int d = 99999;
			int e = 51;
			
			if(a>b)
			{ 
				if(a>c) 
				{
				  if (a>d)
				  {
					 if (a>e) 
				{
					System.out.println(a);
				}
				else
				{
					System.out.println(e);
				}
			}	
				}
			}
			else
			{
				if(b>c)
				{
				  if(b>d) 
				  {
					  if(b>e)
					  {
				  
					  System.out.println(b);
				  }
				  }
				}
				  else
				  {
					  if(c>d) 
					  {
						  if (c>e)
						  {
					  
						  System.out.println(c);  
					  }
					  }
					  else 
					  {
						 if(d>e)
						 {
							 System.out.println(d);
						 }
						 else {
							 System.out.println(e);
						 }
					  }
				   }
				  }
				}  

}
