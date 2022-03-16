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
import pom.ProfilePage;
import util.Utility;

public class Test2 extends Browser {
	private WebDriver driver;
	private LoginPage loginPage;
	private ApplicationHeaderPage applicationHeaderPage;
	private ProfilePage profilePage;
	 static ExtentTest test;
	 static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browserName)
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
	public void createObjectOfPOMClasses()
	{
		System.out.println(" createObjectOfPOMClasses");
        loginPage = new LoginPage(driver);
		applicationHeaderPage = new ApplicationHeaderPage(driver);
        profilePage = new ProfilePage(driver);

	}
	
	@BeforeMethod
	public void loginToApplication() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.out.println(" launchApplication");

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
	public void verifyDeepikaProfile() throws InterruptedException
	{
		System.out.println(" VerifyInstaUser");
	       // applicationHeaderPage.turnOnNotification();
		    applicationHeaderPage.searchBar();
	        applicationHeaderPage.suggestion();
	        profilePage.follow();
	        String url = driver.getCurrentUrl();
	        if(url.equals("https://www.instagram.com/deepikapadukone/"))
	        {
	        	System.out.println("Profile Verify");
	        }
	        
	        profilePage.photo();
	        profilePage.like();
	        profilePage.closePhoto();
	        profilePage.unfollow();
	        profilePage.YesUnfollow();
		
	}
	@Test
	public void likeOnFirstPost() throws InterruptedException
	{
		applicationHeaderPage.turnOnNotification(); 
		applicationHeaderPage.likePost();
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
		 loginPage = null;
	     applicationHeaderPage = null;
	     profilePage = null;
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
		System.gc();
	}

}
