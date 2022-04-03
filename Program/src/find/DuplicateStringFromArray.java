package find;

public class DuplicateStringFromArray {
	public static void main(String[] args) {
		
	
	String a[] = {"Arjun", "is", "a", "Arjun", "Boy", "Boy"};
	
	for(int i =0; i<a.length; i++)
	{	
		
	  for (int j= i+1 ;j<a.length; j++)
		{
			if(a[i].equals(a[j]))
			{
				System.out.println(a[i] + " <===Is a Duplicate String");
			}
		  
		}
		
	}
	
		
}

}
