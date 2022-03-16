package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	
	
	@FindBy (xpath= "//div[@class='cmbtv']//button")
	private WebElement saveYourlogin;
	
	@FindBy (xpath= "//button[text() = 'Not Now']")
	private WebElement turnOnNotification;
    
	@FindBy (xpath= "//input[@aria-label='Search input']")
	private WebElement searchBar;
	
	@FindBy (xpath= "(//div[text()='Deepika Padukone'])[1]")
	private WebElement suggestion;
	
	@FindBy (xpath= "(//div[@class=\"QBdPU rrUvL\"])[3]")
	private WebElement sendPost;
	
	@FindBy (xpath= "//div[@class=\"-qQT3\"]")
	private WebElement selectUser;
	
	@FindBy (xpath= "//div[text() = 'Send']")
	private WebElement send;
	
	@FindBy (xpath= "(//button[@class=\"wpO6b  \"]//div)[4]")
	private WebElement likePost;
	
	
	
	
 public ApplicationHeaderPage(WebDriver driver)
	
	{	
	  PageFactory.initElements(driver, this);	
	  
	}
	
	public void saveYourlogin()
	{
		saveYourlogin.click();
	}
	
	public void turnOnNotification() throws InterruptedException
	{
		Thread.sleep(2000);
		turnOnNotification.click();
	}
	
	public void searchBar() throws InterruptedException
	{
		Thread.sleep(2000);
		searchBar.sendKeys("deepikapadukone");
	}
	
	public void suggestion()
	{
		
		suggestion.click();
		
	}
	
	public void sendPost()
	{
		
		sendPost.click();
		
	}
	
	public void selectUser()
	{
		selectUser.click();
	}
	public void sendToUser()
	{
		send.click();
	}
	
	public void likePost()
	{
		
		likePost.click();
	}

}
