package concept;

public class Swaping {
	public static void main(String[] args) {
	int c[] = {0};
	int a[] = {23,78};
		c[0]=  a[0];
	    a[0] = a[1];
	    a[1]=  c[0];

		for(int i=0; i<a.length; i++)
		{
		System.out.println(a[i]);
	}
	}

}
