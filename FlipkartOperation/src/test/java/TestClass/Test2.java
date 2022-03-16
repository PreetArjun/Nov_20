package TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pom.HomePage1;
import pom.LoginTab;
import pom.ProductTab1;

public class Test2 extends Browser {		   
	 private WebDriver driver;
	 private HomePage1 homePage1;
	 private ProductTab1 productTab1 ;
	 private LoginTab loginTab;
	 
	    @BeforeTest
		@Parameters("browser")
		public void launchBrowser(String browserName)
		{	
			if(browserName.equals("Chrome"))
			{
				
			    driver = launchChromeBrowser();
			}
			if(browserName.equals("Firefox"))
			{	
				 
			     driver = launchFirefoxBrowser();
			}
			if(browserName.equals("Edge"))
			{		
				driver =launchEdgeBrowser();
			}
			
		}
	     @BeforeClass
			public void createObjectOfPOMClassesr()
			{
			  loginTab = new LoginTab(driver);
	    	  homePage1 = new HomePage1(driver);
			  productTab1  = new ProductTab1(driver);

			}
			
			
			@BeforeMethod
			public void launchApllication()
			{
				
				System.out.println(" launchApllication");
			    driver.get("https://www.flipkart.com/");	
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				loginTab.closeLoginTab();
				
			}
			
			@Test
			public void AddToCartProduct() throws InterruptedException
			{
				
				   System.out.println(" mobile is added");
				   homePage1.inputbar();
				   homePage1.search();
				   homePage1.iphone();
				   
				   
				   productTab1.addToCart();
				

			}
			
			@Test
			public void AddToCartShirt() throws InterruptedException
			{
				System.out.println(" Tshirt is added");
				homePage1.inputbarforTshirt();
				homePage1.tShirt();
				Thread.sleep(2000);
				productTab1.addToCartTs();
				
				
			}
			
			
			@AfterMethod
			public void logout()
			{
				System.out.println(" logoutFromApllication");

			}
			@AfterClass
			public void clearPOMObject()
			{
				  loginTab = null;
		    	  homePage1 = null;
				  productTab1  = null;

			}
			@AfterTest
			public void closeBrowser()
			{

				System.out.println(" closeBrowser");
				driver.quit();
				driver = null;

			}

}
