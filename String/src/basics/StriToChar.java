package basics;

public class StriToChar {
	public static void main(String[] args) {
		String a = "Arjun is an software Engineer";
		
		for(int i=0; i<a.length(); i++)
		{
			char x = a.charAt(i);
		    System.out.println("index " + i  +  " Char:" + x);
		}
		
		//char[] b =a.toCharArray();
		//System.out.println(b);
		
		
		
	}

}
