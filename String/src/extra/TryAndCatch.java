package extra;

public class TryAndCatch {

	public static void main(String[] args) {
		
		int a =10;
		int b =0;
		int c = 0;
		int  d[] = {1,2,3,4,5,6};
		
		System.out.println("Start");
		try
		{
		    c = a/b;
			System.out.println(d[8]);
				
			    

		}
		
//		catch(ArithmeticException x)
//		{
//
//			System.out.println(" b is 0");
//		}
		catch(ArithmeticException x)
		{
			System.out.println("  b is 0");
			try
			{
				System.out.println(d[8]);

			}
			catch(ArrayIndexOutOfBoundsException  y)
			{
				System.out.println(" Array index is not present inner");

		    }
		}
		catch(ArrayIndexOutOfBoundsException  y)
		{
			System.out.println(" Array index is not present outer");

	    }
		catch(Exception z)
		{
			z.printStackTrace();
		}
		
		
		
		System.out.println(c);
	}
}
