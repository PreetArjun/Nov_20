package collec;

import java.util.ArrayList;

public class ArrayCollection {
	
	public static void main(String[] args) {
		
		
	//	List a = new ArrayList(); upcasting list 
		ArrayList a = new ArrayList(); // without generic
		 a.add("Arjun");
		 a.add(23);
		 a.add('P');
		 a.add(1.23);
		 a.add(1.23);
		 a.add(1.23);
		 // Collection is hetro and hemogenous in Nature
		 for(int i =0 ; i<a.size(); i++)
		 {
		 System.out.println(a.get(i));
		 }
		 System.out.println("---------------");
		 a.remove(2);
		 
		 
		 for(int i =0 ; i<a.size(); i++)
		 {
		 System.out.println(a.get(i));
		 }
		 //List allow duplicate value
		 // It act homegenous in nature when we not use generic
		 ArrayList<String> b = new ArrayList<String>(); // with generic
		 b.add("Arjun");
		 b.add("Patidar");
		 b.add("Patidar");
		 b.add("Patidar");
		// a.add(23/04/98);
		 //a.add('P');
		 System.out.println("------");
		 for(int i =0 ; i<b.size(); i++)
		 {
		 System.out.println(b.get(i));
		 }
		
		 
	}

}
