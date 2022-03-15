package TestClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeaderPage;
import pom.LoginPage;
import util.Utility;


public class Test2 extends Browser {
	private WebDriver driver;
	private ApplicationHeaderPage applicationHeaderPage;
	private LoginPage loginpage ;
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
			driver = launchEdgeBrowser();
		}
		
	}
	
	@BeforeClass
	public void createObjectOfPOMClasses()
	{
		loginpage  = new LoginPage(driver);
		applicationHeaderPage = new ApplicationHeaderPage(driver);

	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.out.println(" loginToApllication");
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String username = Utility.getDataFromExcel("Sheet1", 1, 0);
		loginpage.sendUserName(username);
		String password = Utility.getDataFromExcel("Sheet1", 1, 1);
		loginpage.sendPassword(password);
		loginpage.clickOnkeepMeLogin();
        Thread.sleep(2000);

	}
	
	
	@Test
	public void verifyTaskTab() 
	{
		SoftAssert soft = new SoftAssert();
		applicationHeaderPage.openTaskpage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Assert.assertEquals(url, "http://localhost/tasks/otasklist.do", "Url is not matching");
		soft.assertEquals(title, "actiTIME - Open Tasks" , "title is not matching");
		soft.assertAll();
		
	}
	
	@Test
	public void verifyReportTab()
	{

		SoftAssert soft = new SoftAssert();
		applicationHeaderPage.openReportPage();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		Assert.assertEquals(url, "http://localhost/reports/reports.do" , "Url is not matching");
		soft.assertEquals(title, "actiTIME -  Saved Reports" , "title is not matching");
	

	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println(" logout");
		applicationHeaderPage.logout();
	}
	
	@AfterClass
	public void clearPOMObject()
	{
		loginpage  = null;
		applicationHeaderPage = null;

	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println(" closeBrowser");
		driver.quit();
		driver = null;

	}
	
	

}
