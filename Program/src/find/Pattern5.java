package find;

public class Pattern5 {
	public static void main(String[] args) {
		
		for(int a = 1;  a<=5; a++) //Line
		{
			for(int b = 4 ; b>=a; b--) //Space
			{
				System.out.print(" ");
			}
			for(int c = 1; c<=a; c++)   //star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	      for(int d = 1; d<=5; d++) //line
		{
			for(int e = 2; e<=d; e++ ) // space
			{
				System.out.print(" ");
			}
			for(int f = 5; f>=d; f--) //star
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	

}
