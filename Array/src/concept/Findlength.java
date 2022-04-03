package concept;

public class Findlength {
	
	public class Array {   // find  length of array
		
		
		
		
		public static void main(String[] args) {
			int v[] = {1,2,3,4,5};
			
			
			
			
			
			
			int size = v.length; // to find array length
//	    System.out.println(size);
//	    for(int a = v.length-1; a>=0; a--)
//	    {
//	    	System.out.println(v[a]);
//	    }
//	    
	    
		for(int i = size-1; i>=0; i--)
		{
			System.out.print(v[i] + ",");
		}
			
			
		}

	}
}
