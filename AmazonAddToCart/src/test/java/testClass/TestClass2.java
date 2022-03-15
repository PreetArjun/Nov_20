package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Browser;
import pom.HomePage;
import pom.PopUpClass;

public class TestClass2 extends Browser{
	private WebDriver driver;
	private HomePage homepage;
	private PopUpClass popUpClass;
	
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver = launchChromebrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			driver = launchFirefoxbrowser();
		}
		
		if(browserName.equals("Edge"))
		{
			driver = launchEdgeBrowser();
		}
	}
	@BeforeClass
	public void createObjectOfPOMClasses()
	{
		homepage = new HomePage(driver);
		 popUpClass = new PopUpClass(driver);
	}
	
	@BeforeMethod
	public void launchApplication() throws InterruptedException
	{
		System.out.println(" ApllicationLaunched");
		
		driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
	       homepage.searchbar();
		   homepage.clickOnSearch();
	}
	
	@Test
	public void verifyProductPage()
	{
		 
		System.out.println(" verifyProductPage");
		   String title = driver.getTitle();
			 if(title.equals("Amazon.in : watch for man"))
			 {
				 System.out.println(" Product page Url is Verified");
			 }
		 
		  
	
	}
	
	@Test
	public void verifyCart ()
	{
        System.out.println(" verifyCart");
           homepage.watch();
		   popUpClass.AddToCart();
		   String title = driver.getTitle();
			 if(title.equals("Amazon.in Shopping Cart"))
			 {
				 System.out.println(" Verify product cart title");
			 } 
	
	}	
		
	
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		
		System.out.println(" logout");
	
		
	}
	
	@AfterClass
	public void clearPOMObject()
	{
		homepage = null;
		 popUpClass = null;
	}
	@AfterTest
	public void closeBrowser()
	{
		
		System.out.println(" closeBrowser");
		driver.quit();
		driver = null;
	}
}	


