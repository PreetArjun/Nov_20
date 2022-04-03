package find;

public class Pattern7 {
	public static void main(String[] args) {
		
		
		for(int a = 1; a<=5; a++)
		{
			for(int b =2; b<=a; b++) 
			{
				System.out.print(" ");
			}
			for(int c= 5; c>=a; c--)
			{
				System.out.print("*");
			}
			for(int d=4; d>=a; d--) {
				System.out.print("*");
			}
		       System.out.println();	
		}
		//System.out.println();

	}

}
