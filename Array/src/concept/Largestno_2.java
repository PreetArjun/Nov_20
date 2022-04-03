package concept;

public class Largestno_2 {
	public static void main(String[] args) {
		
		
		int a[] = {23,56};
		int size = a.length;
		//System.out.println(size);
	
		for(int i = 0 ; i<a.length; i++)
		{
			for(int j = i+1; j<a.length; j++)
			{
				if(a[i]>a[j])
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
