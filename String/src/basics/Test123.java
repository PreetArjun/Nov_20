package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test123 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println(" before class");
	}
	
   @BeforeMethod
   public void beforeMethod()
   {
	   System.out.println(" before method");
   }
   
   @Test
   public void test1234()
   {
	   System.out.println(" test");
   }
   
   @AfterMethod
   public void afterMethod()
   {
	   System.out.println(" after method");
   }
   
   @AfterClass
   public void afterClass()
   {
	   System.out.println(" after class");
   }
   
   @AfterTest
   public void afterTest()
   {
	   System.out.println("After Test");
   }
   
}
