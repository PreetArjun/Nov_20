package pom;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateTask {
	
	
	@FindBy ( xpath = "//div[@id='ext-gen33']" )
	private WebElement  createNewTask;
	
	@FindBy ( xpath = "(//button[@ class='x-btn-text'])[1]")
	private WebElement selectCustomer;
	 
	@FindBy ( xpath = "//a[contains(text(), '- New ')]")
	private  WebElement selectAsNew;
	
	@FindBy (xpath= "//input[@id='createTasksPopup_newCustomer']")
	private WebElement customerName;
	
	@FindBy (xpath= "//input[@id='createTasksPopup_newProject']")
	private WebElement projectName;
	
	@FindBy (xpath= "(//input[@ type='text'])[1]")
	private WebElement EnterName;
	
	@FindBy (xpath= "(//span[text() = 'Create Tasks'])[1]")
	private WebElement createTask;
	
	@FindBy (xpath= "//a[text()= 'All']")
	private WebElement selectallCreatedTask;
	
	@FindBy (xpath= "(//input[@type=\"button\"])[4]")
	private WebElement deleteTask;
	
	@FindBy (xpath= "(//input[@type=\"button\"])[11]")
	private WebElement confirmDelete;
	
	@FindBy (xpath= "//a[text()= 'Projects & Customers']")
	private WebElement selectArchives;
	
	private WebDriver driver;
	
	public CreateTask(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	this.driver = driver;	
	}	
	public void createNewTask()
	{
		createNewTask.click();
	}
	
	public void selectCustomer()
	{
		selectCustomer.click();
	}
	public void selectAsNew()
	{
		Actions act = new Actions(driver);
	    act.moveToElement(selectAsNew).click().build().perform();
	}	
	public void customerName()
	{
		customerName.click();
		customerName.sendKeys("dvvAffssAppAAAApreetttt");
	}	
	public void projectName()
	{		
		projectName.sendKeys("aAAAAaAaaAAAAAAcoder");
	}
	public void  EnterName()
	{
		EnterName.sendKeys("AaAAAArjun");	
	}	
	public void createTask()
	{
		createTask.click();
	}	
	public void selectArchives() throws InterruptedException
	{
		Thread.sleep(2000);
		selectArchives.click();		
	}
	public void selectallCreatedTask() throws InterruptedException
	{
		Thread.sleep(2000);
		selectallCreatedTask.click();		
	}	
	public void deleteTask() throws InterruptedException
	{	
		deleteTask.click();
		Thread.sleep(2000);	
		confirmDelete.click();
	}
	
	
}
