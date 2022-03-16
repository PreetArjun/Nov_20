package pom;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopUpClass {
	
	@FindBy ( xpath = "//input[contains (@ name, 'submit.add-to-cart')]")
	private WebElement AddToCart;
	private WebDriver driver;
	
	
	public PopUpClass(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);
	   this.driver = driver;
	}
	
	public void AddToCart()
	{
		 ArrayList<String> addr =  new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(addr.get(1));
         AddToCart.click();
	}
			

}
