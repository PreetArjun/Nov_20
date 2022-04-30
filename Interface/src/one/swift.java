package one;

public interface swift {
	 int a = 10; // default --> public, static and final
     void demo(); // public abstract
	 void test();
	 static void arjun()
	{	
		System.out.println("hello");
	}
   default  void allu()  // with the help of default keyword we declare complete method
	{
	   
		System.out.println("hii");
	}
 
   
    public static void main(String[] args) {
	
	arjun();
	
  }
}
