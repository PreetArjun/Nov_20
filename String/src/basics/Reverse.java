package basics;

public class Reverse {
	public static void main(String[] args) {
		
      String a = "ARJUN IS GOOD";
      String b = "";
      for(int i = a.length()-1 ; i>=0; i--)
      {
    	  b = b+a.charAt(i);
    	
      }
            
        a = b;
       System.out.println(a);
     
}
}
