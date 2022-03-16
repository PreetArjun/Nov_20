package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy (xpath = "(//div[@class='_2EGQY'])[3]")
	private WebElement busTicket;
	
	@FindBy (xpath = "(//div[text()= 'Pay'])[1]")
	private WebElement payRentPayment ;
	
	@FindBy (xpath = "//a[text() = 'Company']")
	private WebElement company;
	
	@FindBy (xpath = "//a[text() = 'Contact Us']")
	private WebElement contactUs;
	
	
	private WebDriver driver;
	//private WebDriverWait wait;

  public HomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  this.driver =driver;
  }

  public void busTicket() throws InterruptedException
  {

	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);", busTicket);
	  Thread.sleep(2000);
      busTicket.click();
	  
  }
  public void payRentPayment() throws InterruptedException
  {

	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].scrollIntoView(true);",payRentPayment );
	  Thread.sleep(2000);
	 // wait.until(ExpectedConditions.visibilityOf(payRentPayment));
	  payRentPayment.click();
	  
	  
  }
  public void company()
  {
	  Actions act = new Actions(driver);
	  act.moveToElement(company).perform();
	  act.moveToElement(contactUs).click().build().perform();
	  
  }
  

  
}
