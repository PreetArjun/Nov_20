package basics;

public class Palindrome {
	public static void main(String[] args) {
	String n = "lool";	
	String reverse = "";

	for (int i = n.length()-1; i>=0; i--)
	{
		
		reverse= reverse+n.charAt(i);
	}	
	
	boolean result = n.equals(reverse);
	//System.out.println(result);
	
	if(result == true)
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("Not palindrome");

	}
	
	}

}























































