package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "(//img[@class='circle'])[1]")
	private WebElement loginbutton;
	
	@FindBy (xpath = "(//div[@class='settingItem valign-wrapper'])[4]")
	private WebElement logout;
	
	@FindBy (xpath = "//input[@id='globalSearch23']")
	private WebElement searchBar;
//	(//div[@id='globalSearch23-suggestion']//div)[13]
	
	@FindBy (xpath = "//span[text() = 'Stock']")
	private WebElement suggestion;
	
	@FindBy (xpath = "//div[text()='Price']")
	private WebElement clickOnPrice;
			
	@FindBy (xpath = "//div[@class='fs20 clrText fw500']")
	private WebElement price;
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;		
	}
	
	public void loginButton()
	{
		loginbutton.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	public void searchBar() throws InterruptedException
	{
		searchBar.click();
		Thread.sleep(2000);
		searchBar.sendKeys("tcs");			
	}
	
	public void suggestion()
	{
		suggestion.click();		
	}
	public void clickOnPrice()
	{
		clickOnPrice.click();
	}
	public void getPrice() throws InterruptedException
	{
		Thread.sleep(2000);
		String text = price.getText();
		System.out.println(text);
	}	
}
