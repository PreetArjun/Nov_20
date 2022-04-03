package concept;

public class ASC_DESC {  // Ascending 
	public static void main(String[] args) {
		
		int a[] = {23,45,122,56,98,9,789,12,0,-0};
		
		int store;
		int size = a.length;
		System.out.println(size +" <--Size");
		
		for(int i=0; i<a.length; i++)
		{ 
			for(int j=i+1; j<a.length; j++) ///
			{
				if(a[i]>a[j])
				{
					store = a[i];
					a[i]=a[j];
					a[j]= store;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
			
		

	
	
	
	}

}
