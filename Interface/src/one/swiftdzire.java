package one;

public class swiftdzire implements swift  {
	
              
    public void demo()
	{
		System.out.println("demo method");
	}
    public void test()
	{
		System.out.println("test method");
	}
      
	public  void allu() // default method can not call inside the class
	{
		System.out.println("qwert");
	}

    public static void main(String[] args) {
	   
	//arjun(); // static method of interface can not be inherited in implementation class
	// to call static method interface class name is used
	swift.arjun();
	swiftdzire x = new swiftdzire(); //to call default method of interface always  object of implements class is used
	x.allu();
	x.demo();
	System.out.println(a);
	
  }
}
