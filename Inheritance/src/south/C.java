package south;
import north.A;
import north.B;

public class C   {
	
	public static void main(String[] args) {
		
	   // super class object
		A x = new A();
		x.demo();
		
	  // sub class object
		B y = new B();
		y.demo();
		y.lemo();
	 // upcasting object
		A z = new B();
		z.demo();
	//z.lemo();  new method of subclass
		
		
	}
	
	
	

}
