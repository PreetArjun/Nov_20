package TestClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ContactUs;
import pom.HomePage;
import util.Utility;

public class TestClass1 extends Browser {
	
	private WebDriver driver;
	private HomePage homePage;
	private ContactUs contactUs;
	String testID;
    static ExtentTest test;
    static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
	{	
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtendReport"+File.separator+"extendReport.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
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
		System.out.println(" createObjectOfPOMClasses");
		homePage = new HomePage(driver);
		contactUs =new ContactUs(driver);	

	}
	
	@BeforeMethod
	public void launchApllication()
	{
		System.out.println(" PaytmSuccesfullyLaunched");
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void getCustomerNumber() throws InterruptedException 
	{
		testID = "101";
		homePage.company();
		contactUs = new ContactUs(driver);
		contactUs.getCustomerNo();
		

	}
	
	@Test
	public void verifyRentModuleModule() throws InterruptedException
	{
		testID = "102";
		homePage = new HomePage(driver);
		homePage.payRentPayment();
        String title = driver.getTitle();
		if(title.equals("Rent Payment - Pay Rent using Credit Card | Rent Transfer"))
		{
			System.out.println(" Title is verify");
		}
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException
	{		//itresult are used to maintain the result   
		// itestresult is a interface they have static  integer variable
		 
		if(ITestResult.FAILURE == result.getStatus())
		{
			
		 Utility.screenShot(driver, testID);
		 
		}
		
		System.out.println(" logoutFromApllication");
	}
	
	@AfterClass
	public void clearPOMObject()
	{	
		System.out.println(" clearPOMObject");
		homePage = null;
		contactUs =null;
	}
	@AfterTest
	public void closeBrowser()
	{

		System.out.println(" closeBrowser");
		driver.quit();
		driver = null;
        System.gc();
	}

}

