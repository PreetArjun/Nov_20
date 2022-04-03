package find;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		int n,m;
		Scanner  obj = new Scanner(System.in);
		System.out.println("Enter numbers for lcm =  ");
		n = obj.nextInt();
		m = obj.nextInt();
	//	int n = 64;
		//int m = 8;
		int g = 1;
		 
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0&&m%i==0)
			{
			
				g=i;
				
			}
			//System.out.println(g);
		}
		//System.out.println(g);
		int lcm = n*m/g;
		System.out.println("LCM of NUmber is = " + lcm);
		
	}

}
