package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenter {
	
	@FindBy  ( xpath = "//a[text() ='1800 202 9898']")
	private WebElement telephone;
	
	
private WebDriver driver;
	
	
	public HelpCenter(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  this.driver = driver;
	}
		
	
	
	public void getCustomerNumber()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", telephone);
		String text = telephone.getText();
		System.out.println(text);
		
		
	}

}
