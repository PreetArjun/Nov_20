package north;

public class Delhi {
	
	
     public  void  Allu()
     { 
    	 System.out.println("Public");
     }
     void  demo()
   {
	 System.out.println("Default");
   }
  protected void  pushpa()
   {
	   System.out.println("protected");
   }
  private void Karan()
  {
	  System.out.println("private");
  }

	
	public static void main(String[] args) {
		Delhi  x = new Delhi();
		x.Allu();	
		x.demo();
		x.pushpa();
		x.Karan();
		
	}
	

}