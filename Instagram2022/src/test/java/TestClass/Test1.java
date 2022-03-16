package TestClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import pom.ApplicationHeaderPage;
import pom.LoginPage;
import pom.ProfileCheck;
import util.Utility;

public class Test1 extends Browser {
	private WebDriver driver;
	private LoginPage loginPage;
	private ApplicationHeaderPage applicationHeaderPage;
	private ProfileCheck ProfileCheck;
	 static ExtentTest test;
	 static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName )
	{	
		reporter = new ExtentHtmlReporter("test-output"+File.separator+"ExtentReport"+File.separator+"extentReport.html");
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
	public void createObjectOfPOMClasses() throws InterruptedException
	{	       
		System.out.println(" createObjectOfPOMClasses");
        loginPage = new LoginPage(driver);
        applicationHeaderPage = new ApplicationHeaderPage(driver);
  	     ProfileCheck = new ProfileCheck(driver);

	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException, EncryptedDocumentException, IOException
	{	
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	; 
        String userName = Utility.getDataFromExcel("Sheet1", 0, 0);
        loginPage.sendUserName(userName);
        String passWord = Utility.getDataFromExcel("Sheet1", 0, 1);
        loginPage.sendPassword(passWord);
	    loginPage.Login();
	    applicationHeaderPage.saveYourlogin();
		
	}
		

	
	@Test 
	public void verifyAkshayProfile() throws InterruptedException
	{
		
		

	 // applicationHeaderPage.turnOnNotification();
	  ProfileCheck.searchBar();
	  ProfileCheck.suggestion();
	  ProfileCheck.follow();
	  String url =  driver.getCurrentUrl();
	  System.out.println(url);
	  ProfileCheck.photo();
	  ProfileCheck.like();
	  ProfileCheck.closePhoto();
	  ProfileCheck.unfollow();
	  ProfileCheck.YesUnfollow();
		
		
		
		
	}
	
	@Test 
	public void sendPostToUser() throws InterruptedException
	{
	
		
	    applicationHeaderPage.turnOnNotification(); 
		applicationHeaderPage.sendPost();
		applicationHeaderPage.selectUser();
		applicationHeaderPage.sendToUser();
		
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException
	{
	  System.out.println(" logoutInsta");
      Thread.sleep(2000);
      loginPage.goForLogout();
      loginPage.logout();	
	}
	
	@AfterClass
	public void clearPOMObject() throws InterruptedException
	{
		System.out.println(" clearPOMObject");
		 loginPage = null;
	     applicationHeaderPage = null;
		  ProfileCheck = null;


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
