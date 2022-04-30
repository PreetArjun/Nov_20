package methodchaining;

public class Mumbai {
	
	public static void main(String[] args) {
		
		Intr3 z = new Pune();
		Intr2 q =  z.alpha();
		Intr1 w =q.demo();
		w.test();
		z.alpha().demo().test();
		
	}
	}


