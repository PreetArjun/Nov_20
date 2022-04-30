package testClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import pom.LoginPage;
import util.Utility;

public class TestClass1 extends Browser {
	private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	
   @BeforeTest
   @Parameters("browser")
   public void launchBrowser()
   {
	   System.out.println("Browser launch");
	   System.setProperty("webdriver.chrome.driver", "E:\\file selenium\\hi\\chromedriver.exe");
	   driver = new ChromeDriver();
   }
    
    @BeforeClass
    public void  createPOMObject()
    {
    	System.out.println("Create POM Object");
       loginPage = new LoginPage(driver);
       homePage = new HomePage(driver);
    }
	
    @BeforeMethod
    public void launchGroww() throws EncryptedDocumentException, IOException, InterruptedException
    {  	
       System.out.println("Launch Groww");
       driver.get("https://groww.in/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       loginPage.loginButton();
       String email = Utility.getDataFromExcel("Sheet1", 1, 0);
       loginPage.enterEmail(email);
       String password = Utility.getDataFromExcel("Sheet1", 1, 1);
       loginPage.enterPassword(password);
       loginPage.submit();
       loginPage.enterPin();
       Thread.sleep(2000);
    }
    
    @Test
    public void  verify() throws InterruptedException
    {
    	System.out.println("Verify");
    	homePage.searchBar();
    	homePage.suggestion();
    	homePage.clickOnPrice();
    	homePage.getPrice();
    	
    }
    
    @AfterMethod
    public void logoutGroww()
    {
    	System.out.println("Logout");
    	//homePage.loginButton();
    	//homePage.logout();
    	
    }
    
    @AfterClass
    public void clearPOMObject()
    {
    	System.out.println("ClearPOMObject");
    	//loginPage = null;
        //homePage = null;
    }
    
    @AfterTest
    public void closeBrowser()
    {
    	System.out.println("CloseBrowser");
    //	driver.quit();
    //	driver =null;
    //	System.gc();
    }
    

}
