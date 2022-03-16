package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath= "(//input[@class='_2hvTZ pexuQ zyHYP'])[1]")
	private WebElement userName;
	
	@FindBy (xpath= "(//input[@aria-required='true'])[2]")
	private WebElement password;
    
	@FindBy (xpath= "//button[@class='sqdOP  L3NKy   y3zKF     ']")
	private WebElement login;
	
	@FindBy (xpath= "(//div[@class='XrOey'])[6]")
	private WebElement goForLogout;
	
	@FindBy (xpath= "//div[text()='Log out']")
	private WebElement logout;
	
	public LoginPage(WebDriver driver)
	
	{	
	  PageFactory.initElements(driver, this);	
	  
	}
	
	public void sendUserName(String user) throws InterruptedException
	{
		Thread.sleep(2000);
		userName.sendKeys(user);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	 
	public void Login()
	{
		boolean loginbutton = login.isEnabled();	
		 System.out.println(loginbutton);
		 if(loginbutton==true)
		 {
			 login.click();
		 }
	}
	public void goForLogout()
	{
		goForLogout.click();
	}
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		logout.click();		
	}

}
