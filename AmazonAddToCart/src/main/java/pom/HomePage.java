package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy ( xpath =  "//input[@ id='twotabsearchtextbox']")
	private WebElement  searchbar;
	
    @FindBy	( xpath = "//input[@id='nav-search-submit-button']" )
    private WebElement clickOnSearch;
    
    @FindBy ( xpath = "(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]" )
    private WebElement watch;
    
    @FindBy	( xpath = "//a[text()= 'Amazon Science']" )
    private WebElement career;
    
    @FindBy	( xpath = "//a[@data-csa-c-content-id='nav_ya_signin']" )
    private WebElement accAndList;
    
    @FindBy	( xpath = "(//a[@class='nav-link nav-item'])[3]" )
    private WebElement babyWishList;
  
    
    private WebDriver driver;
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver = driver;  	
    }
    
    public void searchbar()
    {
    	searchbar.sendKeys("watch for man");
    }
    public void clickOnSearch()
    {
	   clickOnSearch.click();
    }
    public void watch()
    {
    	watch.click();
    }
    
   
    public void career() throws InterruptedException
    {
    	Thread.sleep(2000);
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
   	     js.executeScript("arguments[0].scrollIntoView(true);", career);
    	 career.click();
    }
    public void accAndList()
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(accAndList).moveToElement(babyWishList).click().build().perform();
    }
   
   
    
    
    
    
    

}
