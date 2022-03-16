package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTab {

	@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeLoginTab;
	
	public LoginTab(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);	
	}
	
	public void closeLoginTab()
	{
		closeLoginTab.click();
	}
}
