package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeaderPage {
	
	@FindBy (xpath = "//a[@class='content tt_selected selected']")
	private WebElement Timetrack;
	
	@FindBy (xpath ="//a[@class='content tasks']")
	private WebElement  Task;
	
	@FindBy (xpath = "//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy (xpath = "//a[@class='content users']")
	private WebElement users;
	@FindBy (xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	
	
	public ApplicationHeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void openTaskpage()
	{
		Task.click();
	}
	public void openReportPage()
	{
		reports.click();
	}
	
	   public void logout()
	    {
	    	logout.click();
	    }
	   public void openusersTab()
	   {
		   users.click();
	   }

}
