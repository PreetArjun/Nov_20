package find;

public class ReverseStringSamePosition {
	
	
	public static void main(String[] args) {
		
	
	String a = "Arjun is a Software Engineer";
	String x[] = a.split(" ");

	for(int i =0; i<=(x.length-1); i++)
	{	
	//Arjun
	for(int j= x[i].length()-1; j>=0; j--)
	{
	
	 System.out.print(x[i].charAt(j));;
	}	
	System.out.print(" ");
	}
}
}