package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusTicket {

	
	@FindBy ( xpath = "//label[text()= 'Round Trip']")
	private WebElement radiobuttonfor;
	
	@FindBy	( xpath = "(//input[@id='text-box'])[1]")
	private WebElement from;
	
	@FindBy	( xpath = "(//div[@class='_38Wj']//p)[3]")
	private WebElement suggestionFrom;
	
	@FindBy	( xpath = "(//input[@id='text-box'])[2]")
	private WebElement to;
	
	@FindBy	( xpath = "//p[text()='Khandala ']")
	private WebElement suggestionTo;
	
	@FindBy	( xpath = "(//input[@type='text'])[3]")
	private WebElement departureDate;
	
	@FindBy	( xpath = "//a[contains(@class,'rea')]")
	private WebElement  next;
	
	@FindBy	( xpath = "//div[text()='25']")
	private WebElement date;

	@FindBy	( xpath = "(//input[@type='text'])[4]")
	private WebElement returnDate;
	
	@FindBy	( xpath = "(//div[text()='28'])[2]")
	private WebElement dateOfReturn;
	
	@FindBy	( xpath = "//button[text() = 'Search']")
	private WebElement search;
	
	private WebDriver driver;
	private  Actions act;
	private JavascriptExecutor js;
	
	public BusTicket(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		act = new Actions(driver);
		js =(JavascriptExecutor)driver;
		
	}
	
	public void radiobuttonfor() throws InterruptedException
	{
		Thread.sleep(2000);
		radiobuttonfor.click();
	}
	
	public void from()
	{
		from.sendKeys("Mumbai");
	}
	
	public void suggestionFrom()
	{
		suggestionFrom.click();
	}
	
	public void to()
	{
		to.sendKeys("Pune");
	}
	
	public void suggestionTo()
	{
		suggestionTo.click();
	}
	
	public void departureDate()
	{
		Actions act = new Actions(driver);
		act.moveToElement(departureDate).click().build().perform();
	}
	
	public void next()
	{
		js.executeScript("arguments[0].click();", next);
	}
	
	public void date()
	{
        act.moveToElement(date).click().build().perform();
	}
	
	public void returnDate()
	{
        act.moveToElement(returnDate).click().build().perform();
	}
	
	public void  dateOfReturn()
	{
		   dateOfReturn.click();

	}
	
	public void  search()
	{
		search.click(); 

	}
	
	
	
}
