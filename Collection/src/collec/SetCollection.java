package collec;

import java.util.HashSet;
import java.util.Iterator;

public class SetCollection {
	
	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<Integer>();
		// it does not allow duplicate value
		a.add(14);
		a.add(98);
		a.add(23);
		a.add(04);
		a.add(23);
		
		// we cannot retive specific value in set
		
		Iterator<Integer> i = a.iterator();
// adavance for loop is used
//mostly it is used with data
		for(int h : a)
		{
			System.out.println(i.next());
		}
		
		System.out.println("------------");
		i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
