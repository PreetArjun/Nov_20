package concept;

public class Duplicate_No {
	
	
	public static void main(String[] args) {
		
		int a [] = {15,12,12,14,15,12,15,17,18,19,18 };
		
		for(int i =0; i<a.length; i++)
		{ 
		for(int j = i+1; j<a.length; j++)	
		{
			if(a[i]==a[j])
			{
				System.out.println(a[i] + "This Number is Duplicate");
			}
			else
			{
				//System.out.println(a[i]);
			}
			
			
		}
		
	
		
	}

}
}