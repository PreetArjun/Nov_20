package pom;

import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductTab {
	
	@FindBy ( xpath = "//button[text() = 'ADD TO CART']")
	private WebElement addToCart;
	
	
	
	private WebDriver driver;
	public ProductTab(WebDriver driver)
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
	
	

}
