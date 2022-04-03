package TestClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base.Browser;
import pom.ApplicationHeaderPage;
import pom.CreateTask;
import pom.LoginPage;
import util.Utility;

public class Test1 extends Browser{
	private WebDriver driver;
	private ApplicationHeaderPage applicationHeaderPage;
	private LoginPage loginpage ;
	private CreateTask createTask;
    String testID;
    static ExtentTest test;
    static ExtentHtmlReporter reporter;
    
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName )
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
		createTask = new CreateTask(driver);
	}
	
	@BeforeMethod
	public void launchApplication() throws InterruptedException, EncryptedDocumentException, IOException
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
	public void verifyUserTab()
	{
		testID ="1101";
		System.out.println(" verifyUserTab");		
		applicationHeaderPage.openusersTab();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(url, "http://localhost/administration/userlist.do");
		soft.assertEquals(title, "actiTIME - User List", "User Tab Title is wrong");
		soft.assertAll();	
	}
	
	@Test
	public void createTask() throws InterruptedException
	{
		testID = "1102";
		applicationHeaderPage.openTaskpage();
		createTask.createNewTask();
		Thread.sleep(2000);
		createTask.selectCustomer();
		createTask.selectAsNew();
		createTask.customerName();
		createTask.projectName();
		createTask.EnterName();
		createTask.createTask();
		createTask.selectArchives();
		createTask.selectallCreatedTask();
		createTask.deleteTask();
		
		
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws InterruptedException, IOException
	{
		if(ITestResult.FAILURE ==  result.getStatus())
		{
		Utility.screenShot(driver, testID);
		}
		System.out.println(" logout");
		Thread.sleep(2000);
		applicationHeaderPage.logout();
		
		
	}
	
	@AfterClass
	public void clearPOMObject()
	{
		loginpage  = null;
		applicationHeaderPage = null;
		createTask = null;
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
		

		



