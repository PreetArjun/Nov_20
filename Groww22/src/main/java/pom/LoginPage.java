package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//span[text() = 'Login/Register']")
	private WebElement loginbutton;
	
	@FindBy (xpath = "//input[@id='login_email1']" )
	private WebElement Email;
	
	@FindBy (xpath = "//span[text() ='Continue']" )
	private WebElement Continue ;
	
	@FindBy (xpath = "//input[@id='login_password1']" )
	private WebElement password ;
	
	@FindBy (xpath = "//span[text()='Submit']" )
	private WebElement submit ;
	
	@FindBy (xpath = "(//input[@type='number'])[1]" )
	private WebElement pin1 ;
	
	@FindBy (xpath = "(//input[@type='number'])[2]" )
	private WebElement pin2 ;
	
	@FindBy (xpath = "(//input[@type='number'])[3]" )
	private WebElement pin3 ;
	
	@FindBy (xpath = "(//input[@type='number'])[4]" )
	private WebElement pin4 ;
	
	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void loginButton()
	{
		loginbutton.click();
	}
	
	public void enterEmail(String email)
	{
		Email.click();
		Email.sendKeys(email);
		Continue.click();
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void submit()
	{
		submit.click();
	}
	
	public void enterPin()
	{
		pin1.sendKeys("9");
		pin2.sendKeys("6");
		pin3.sendKeys("3");
		pin4.sendKeys("6");
	}
	
	
	
	

}
