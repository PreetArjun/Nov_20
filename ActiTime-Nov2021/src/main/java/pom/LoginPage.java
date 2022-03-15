package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath= "(//input[@ type='text'])[1]")
	private WebElement userName;
	
	@FindBy (xpath= "(//input[@type='password'])[1]")
	private WebElement password;
	
	@FindBy (xpath= "//input[@type='checkbox']")
	private WebElement keepMeLoginCheckbox;
    
	@FindBy (xpath= "//div[text() = 'Login '] ")
	private WebElement login;
    
	
	
	public LoginPage(WebDriver driver)
	
	{	
	  PageFactory.initElements(driver, this);	
	  
	}
	
	public void sendUserName(String user)
	{
		userName.sendKeys(user);
	}
	public void sendPassword(String pass)
	{
		password.sendKeys(pass);
	}
	 
	public void clickOnkeepMeLogin()
	{
		if(! (keepMeLoginCheckbox.isSelected()))
		{
			keepMeLoginCheckbox.click();

		}
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
