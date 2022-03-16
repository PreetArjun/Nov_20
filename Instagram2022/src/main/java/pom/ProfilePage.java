package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy (xpath= "(//button[contains(@class, '_5f5mN')])[1]")
	private WebElement follow;
	
	@FindBy (xpath= "(//div[@class='eLAPa'])[1]")
	private WebElement photo;
    
	@FindBy (xpath= "(//button[@class=\"wpO6b  \"])[5]")
	private WebElement like;
	
	@FindBy (xpath= "(//button[@class='wpO6b  '])[2]")
	private WebElement closePhoto;
	
	@FindBy (xpath= "(//button[contains(@class, '_5f5mN')])[1]")
	private WebElement unfollow;
	
	@FindBy (xpath= "//button[text() ='Unfollow']")
	private WebElement YesUnfollow;
	

	private WebDriver driver;
	
    public ProfilePage(WebDriver driver)
	
	{	
	  PageFactory.initElements(driver, this);
	  this.driver = driver;
	  
	}
    public void follow()
    {
    	follow.click();
    	
    }
	
	public void photo() throws InterruptedException
	{
		photo.click();
		Thread.sleep(2000);
	}
	public void like() throws InterruptedException
	{
		Thread.sleep(2000);
		like.click();
		Thread.sleep(2000);
	}
	public void closePhoto() throws InterruptedException 
	{
		closePhoto.click();
		Thread.sleep(2000);
	}
	public void unfollow()
	{
		Actions act = new Actions(driver);
		act.moveToElement(unfollow).click().build().perform();
	}
	public void YesUnfollow()
	{
		YesUnfollow.click();
	}
	
	

}
