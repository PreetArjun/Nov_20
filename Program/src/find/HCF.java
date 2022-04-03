package find;

public class HCF {
	public static void main(String[] args) {
		
		int b = 8;
		int a = 64;
		int gcd =1;
		
		for(int i=1; i<=a; i++)
		{
			if(a%i==0&&b%i==0)
			{
				gcd=i;
			}
			//System.out.println(gcd);
		}
		System.out.println(gcd);
	}

}
