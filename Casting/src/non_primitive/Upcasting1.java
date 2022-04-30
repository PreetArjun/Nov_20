package non_primitive; // subclass


public class Upcasting1 extends Upcasting {
	
	void demo()
	{
		System.out.println("demo Sub class");
	}
	
  void allu()
  {
	  System.out.println("tryiii");
  }
	public static void main(String[] args) {
		
		
		
		// super class object
		Upcasting x = new Upcasting();
		x.demo();
		
		// sub class object
		Upcasting1 y = new Upcasting1();
		y.demo();
		y.lemo();
		// Upcasting object
		Upcasting z = new Upcasting1();  // syntax
		z.demo();
		z.allu();   //new method of subclass
		
		
	}
}
