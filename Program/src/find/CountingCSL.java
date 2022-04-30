package find;

public class CountingCSL {
	
	public static void main(String[] args) {
		
	
	String a = "ArjunIs2AG43ood34Boy1";
	
	int upper =0;
	int lower = 0;
	int number = 0;
	
	for(int i =0;  i<a.length()-1; i++)
	{
		char x = a.charAt(i);
		if(x>= 'A' && x<= 'Z')
		{
         	upper++;	
		}
		if(x>='a'&& x<='z')
		{
			lower++;
		}
		if(x>='0'&& x<='9')
		{
			number++;
		}
		
	}
	System.out.println(upper);
	System.out.println(lower);
	System.out.println(number);


}
}