package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTab1 {
	
	@FindBy  ( xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement addToCart;
	
	@FindBy ( xpath = "(//div[@class='_13oc-S']//a)[5]")
	private WebElement addToCartTs;
	
	  private WebDriver driver;
		
		
		public ProductTab1(WebDriver driver)
		{
		  PageFactory.initElements(driver, this);
		  this.driver = driver;
		}
		
	    public void addToCart()
	    {
		
	    	 ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
	           driver.switchTo().window(addr.get(1));
	           addToCart.click();
	    }
	    
	    public void addToCartTs()
		{
			ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(addr.get(1));
			addToCartTs.click();
			
		}
		
	

}
