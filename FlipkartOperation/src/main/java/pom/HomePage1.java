package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage1 {
	
	
	@FindBy  ( xpath = "//input[@class='_3704LK']")
	private WebElement inputbar;
	
	@FindBy  ( xpath = "(//a[@class='_3izBDY'])[2]")
	private WebElement search;
	
	@FindBy  ( xpath = "(//div[contains(text(), 'APPLE iPhone 13')])[2]")
	private WebElement iphone;
	
	@FindBy  ( xpath = "(//a[@class=\"_3izBDY\"])[2]")
	private WebElement tShirt;
	
	private WebDriver driver;
	
	public HomePage1(WebDriver driver)
	{
	  PageFactory.initElements(driver, this);
	 this.driver = driver;
	}
	
	
	public void inputbar()
	{
		
		inputbar.click();
		inputbar.sendKeys("I phone 13");
		
	}
	public void search()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(search));		
		 Actions act = new Actions (driver);
		  act.moveToElement(search).click().build().perform();
		
	}
	public void iphone()
	{
		
		iphone.click(); 
		
	}
	
	public void inputbarforTshirt() throws InterruptedException
	{
		
		inputbar.click();
		
		inputbar.clear();
	Thread.sleep(2000);
		inputbar.sendKeys("t shirt");
		
	}
	
	public void tShirt()
	{
		search.click();
	}
}
