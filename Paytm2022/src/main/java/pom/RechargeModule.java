package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RechargeModule {
	
	@FindBy ( xpath = "(//div[text()='Recharge'])[1]")
	private WebElement rechargeModule;
	
	private WebDriver driver;
	  public RechargeModule(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  this.driver =driver;
	  }

	  public void rechareModule()
	  {

		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true);", rechargeModule);
		  rechargeModule.click();
		  
	  }
	  

}
