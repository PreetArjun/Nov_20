package find;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 8;
		int a= 0;
		int c;
		int b = 1;
		System.out.println(a);
 		System.out.println(b);
    	for(int i = 0; i<n ; i++)
    	{
    		c =a+b;
    		a=b;
    		b=c;
    		System.out.println(c);
    		
    	}
    	
    	
	}
	
	

}
