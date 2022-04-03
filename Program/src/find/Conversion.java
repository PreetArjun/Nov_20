package find;

public class Conversion {
	
	public static void main(String[] args) {
		String  z = "Ar";
        int a =10;
        String s = Integer.toString(a);
        
        System.out.println(s +z); 
        
        int b = Integer.valueOf(s);
        System.out.println(b);
		
        
        double x = 12;
        String c = Double.toString(x);
		
	}

}
