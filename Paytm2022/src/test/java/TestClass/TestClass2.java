package TestClass;

import java.io.File;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.BusTicket;
import pom.HomePage;
import pom.RechargeModule;

public class TestClass2  extends Browser {
	private WebDriver driver;
	private HomePage homePage;
	private BusTicket busTicket;
	private RechargeModule rechargeModule;
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
		busTicket = new BusTicket(driver);
		rechargeModule = new RechargeModule(driver);
		

	}
	
	
	@BeforeMethod
	public void loginToApplication()
	{
		
		System.out.println(" loginToApplication");
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test(priority = 2)
	public void verifyBusTicket() throws InterruptedException 
	{
		System.out.println(" BusTicketVerify ");
		homePage.busTicket();
	    busTicket = new BusTicket(driver);
		busTicket.radiobuttonfor();
		busTicket.from();
		busTicket.suggestionFrom();
		busTicket.to();
		busTicket.suggestionTo();
		busTicket.departureDate();
		busTicket.next();
		busTicket.date();
		busTicket.returnDate();
		busTicket.dateOfReturn();
		busTicket.search();
		
		

	}
	
	@Test(priority = 1)
	public void verifyrechargeModule()
	{
		//System.out.println(" rechargeModuleIsVerfied ");
		rechargeModule = new RechargeModule(driver);
		rechargeModule.rechareModule();
        String title = driver.getTitle();
		if(title.equals("Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans"))
		{
			System.out.println(" Title is verify");
		}
	}
	
	
	@AfterMethod
	public void logout()
	{
		System.out.println(" logoutFromApllication");

	}
	@AfterClass
	public void clearPOMObject()
	{
		System.out.println(" clearPOMObject");
		homePage = null;
		busTicket = null;
		rechargeModule = null;

	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
		System.gc(); // delete all the object without refrence
	}
	
	
	
}
