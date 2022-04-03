package collec;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashCollection {

	public static void main(String[] args) {
		
		
     Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		
		h.put(1, "Arjun");
		h.put(78, "hii");
		h.put(2, "Software");
		h.put(3, "Engineer");
		h.put(23,"DOB");
		h.put(98, "Arjun");
		// map ka keyword hai hai entry naam ka , // entryset ek ek pair lata hai key or value ka 
		for(Map.Entry<Integer, String> e: h.entrySet() )
		{
	System.out.println("Key = " +e.getKey() +" Value =" + e.getValue());	
		// concatination	
		}
	System.out.println("------------");	
		
		h.put(78, "Patidar");
		h.put(45, "Julmi");
		h.put(12, "kiki");
		h.put(15, "jiji");

		for(Map.Entry<Integer, String> e: h.entrySet() )
		{
	System.out.println("Key = " +e.getKey() +" Value =" + e.getValue());	
		// concatination	
		} 
		
	}
		
		
		
		
		
		
// Hash Map
		
		
		
		
		
//		//key value  -->two type of data we have to store
//		HashMap<Integer, String> h = new HashMap<Integer, String>();
//		
//		h.put(null, "Arjun");
//		h.put(null, "hii");
//		h.put(2, "Software");
//		h.put(3, "Engineer");
//		h.put(23,"DOB");
//		h.put(98, "Arjun");
//		// map ka keyword hai hai entry naam ka , // entryset ek ek pair lata hai key or value ka 
//		for(Map.Entry<Integer, String> e: h.entrySet() )
//		{
//	System.out.println("Key = " +e.getKey() +" Value =" + e.getValue());	
//		// concatination	
//		}
//	System.out.println("------------");	
//		
//		h.put(null, "Patidar");
//		h.put(null, "Julmi");
//		h.put(12, null);
//		h.put(15, null);
//
//		for(Map.Entry<Integer, String> e: h.entrySet() )
//		{
//	System.out.println("Key = " +e.getKey() +" Value =" + e.getValue());	
//		// concatination	
//		} 
//		
//	}
	
}
