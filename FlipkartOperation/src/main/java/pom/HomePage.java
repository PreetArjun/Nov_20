package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy  ( xpath = "//div[text()='Electronics']")
	private WebElement Electronics;
	
	@FindBy  ( xpath = "(//a[@class='_6WOcW9'])[3]")
	private WebElement gaming;
	
	@FindBy  ( xpath = "(//a[@class='_6WOcW9 _3YpNQe'])[10]")
	private WebElement gamingMousepad;
	
	@FindBy  ( xpath = "(//div[contains(@ data-id, 'ACCG')])[15]")
	private WebElement product;
	
	@FindBy  ( xpath = "(//div[@class='go_DOp'])[1]")
	private WebElement more;
	
	@FindBy  ( xpath = "(//a[@class='_2kxeIr'])[3]")
	private WebElement customer;
	
	
	
	private WebDriver driver;
	
	
	public HomePage(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	  this.driver = driver;
	}
	
	public void electronics()
	{
		Actions act = new Actions(driver);
		act.moveToElement(Electronics).perform();
		
	}
	
	public void gaming()
	{
		Actions act = new Actions(driver);
		act.moveToElement(gaming).perform();
		
	}
	
	public void gamingMousepad()
	{
		Actions act = new Actions(driver);
		act.moveToElement(gamingMousepad).click().build().perform();	
	}
	
	public void product()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", product);
		product.click();
		
	}
	public void more() throws InterruptedException
	{
	    Actions act = new Actions(driver);
		act.moveToElement(more).perform();
		Thread.sleep(2000);
		act.moveToElement(customer).click().build().perform();
		
	}
	
	
	
	
	
	
	


}
