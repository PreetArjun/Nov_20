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
import pom.HelpCenter;
import pom.HomePage;
import pom.LoginTab;
import pom.ProductTab;

public class Test1 extends Browser {
	 
	private WebDriver driver;
	private LoginTab loginTab;
	private HomePage homePage;
	private HelpCenter helpCenter;
	private ProductTab producttab;
	
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
	public void createObjectOfPOMClasses()
	{
		homePage = new HomePage(driver);
		loginTab = new LoginTab(driver);
	    producttab = new ProductTab(driver);
		homePage = new HomePage(driver);
		helpCenter = new HelpCenter(driver);



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
	public void VerifyMousePad() throws InterruptedException	{

      homePage.electronics();
      homePage.gaming();
      homePage.gamingMousepad();
      homePage.product();
      
      producttab.addToCart();	
      
	}	
	
	@Test
	public void getCustomerNumber() throws InterruptedException
	{
		homePage.more();
		helpCenter.getCustomerNumber();
		
	}
	
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println(" logoutFromApllication");

	}
	
	@AfterClass
	public void clearPOMObject()
	{
		homePage = null;
		loginTab = null;
	    producttab = null;
		homePage = null;
		helpCenter = null;

	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println(" closeBrowser");
		driver.quit();
		driver = null;
	}
}
