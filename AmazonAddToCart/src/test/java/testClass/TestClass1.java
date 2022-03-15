package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Browser;
import pom.HomePage;

public class TestClass1 extends Browser{
	private WebDriver driver;
	private HomePage homepage;
	
	@BeforeTest
	@Parameters("browser")
	public void lauchBrowser(String browserName)
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
		System.out.println(" createObjectOfPOMClasses");
		homepage = new HomePage(driver);
	}
	
	@BeforeMethod
	public void launchApplication() throws InterruptedException
	{
		System.out.println(" ApllicationLaunched");
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void AmazonSciencePage() throws InterruptedException
	{
		
		homepage.career();
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Amazon Science Homepage" ,"Title is wrong");
		  
	}
	
	@Test
	public void verifyBabyWishList ()
	{
        System.out.println(" verifyCart");
         homepage.accAndList();
       String title =  driver.getTitle();
       SoftAssert soft = new SoftAssert();
       soft.assertEquals(title, "Amazon: Baby Wish List", "Title is Wrong");
       soft.assertAll();
	}	
		
	
	
	@AfterMethod
	public void logout() throws InterruptedException 
	{
		
		System.out.println(" logout");
	
		
	}
	
	@AfterClass
	public void clearObjectOfPOMClasses()
	{
		
		homepage = null;
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println(" closeBrowser");
		driver.quit();
		driver = null;
		
	}
	
	}
	

