package find;

public class Palindrome {
	public static void main(String[] args) {
		
	int number = 1000000001;
	int reverse = 0;
	int Lastdigit = 0;
	int n=number;
	while(number>0)
	  { 
		  Lastdigit = number%10; // take last digit out
		
		  reverse = reverse*10+Lastdigit; // store the last digit
		
		  number = number/10;  // eliminate last digit	
	    
	 }
	  //System.out.println(reverse+ " number is reverse");
	
	  if(n==reverse)
	  {
		  System.out.println("Number is palindrome");
	  }
	  else
	  {
		  System.out.println("not palindrone");
	  }
	  }   //System.out.println(reverse);
}
