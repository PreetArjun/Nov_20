package basics;

public class Method_In_String {
 public static void main(String[] args) {
	

	String a = "ARRJUN PATIDAR is cool ";
	String b = " arjun patidar";
	String z ="";
   //	int z1 =a.length(); // return type of length is interger
  //	System.out.println(z1);
   // System.out.println(a.equals(b));  Return type is boolean
	//System.out.println(a.equalsIgnoreCase(b));
//	a = a.toUpperCase(); // return type is string
//	System.out.println(a);
//	System.out.println(a.toUpperCase());
	//System.out.println(a.toLowerCase());
//char v = a.charAt(1) ; // return type is char and int type argument
	//System.out.println(a.charAt(10));
	
	
	//concate method --> to combine two string

//	System.out.println(a.concat( b));  return type is string
	
	// sub string --> Remove any sub string from main string  ???

	 System.out.println(a.substring(8));     // return type is string
//	 System.out.println(b.substring(2, 8));
 System.out.println(a.subSequence(2, 5));
	
	// to remove the start and ending space of string by using trim method
	
	//System.out.println(a.trim());
	
	// Replace<----->method
	
   System.out.println(b.replace('a', 'A'));
	b = b.replace("a", "A");
	System.out.println(b);
//	 System.out.println(b.replace("a", "AAA"));
//	 
	 // break the string using split   
	
	
	String [] x = a.split("is");
     for(int i =0; i<x.length ; i++)
	{
		System.out.println(x[i]);
	}
//	 
//	 //find first and last index
//	 
//	  System.out.println(a.indexOf('R'));
//	  System.out.println(a.lastIndexOf('R'));

     //	 
//	 
//	
	   
	
}
}