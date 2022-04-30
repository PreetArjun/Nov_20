package selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		

		
	    System.setProperty("webdriver.chrome.driver","E:\\file selenium\\chromedriver.exe");
     	WebDriver driver = new ChromeDriver();
     	
     	driver.get("http://localhost/login.do");
     	WebElement user = driver.findElement(By.xpath("(//input[@ type='text'])[1]"));
     	user.sendKeys("admin");
     	Thread.sleep(2000);
     	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
     	password.sendKeys("manager");
     	WebElement password1 = driver.findElement(By.xpath("//a[@ class='initial']"));
     	password1.click();
     	Thread.sleep(3000);
     	WebElement tasks = driver.findElement(By.xpath("(//img[@class='sizer'])[1]"));
     	tasks.click();
     	WebElement Createtasks = driver.findElement(By.xpath("//div[@id='ext-gen33']"));
     	Createtasks.click();
     	Thread.sleep(3000);
     	WebElement selectcustomer  = driver.findElement(By.xpath("(//button[@ class='x-btn-text'])[1]"));
     	//selectcustomer.click();
     	//Thread.sleep(3000);
     	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
     	WebDriverWait wait = new WebDriverWait(driver, 5);
     			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(null)));
     	Actions act= new Actions(driver);
     	
     	act.moveToElement(selectcustomer).click().build().perform();
     	
     	
     	WebElement selectnew  = driver.findElement(By.xpath("//a[contains(text(), '- New ')]"));
     	act.moveToElement(selectnew).click().build().perform();
     	
     	WebElement customername  = driver.findElement(By.xpath("//input[@id='createTasksPopup_newCustomer']"));
     	customername.sendKeys("AAPreetttt");

     	WebElement projectname  = driver.findElement(By.xpath("//input[@id='createTasksPopup_newProject']"));
     	projectname.sendKeys("AANov20XYZzz");
     
     	WebElement Entername  = driver.findElement(By.xpath("(//input[@ type='text'])[1]"));
     	Entername.sendKeys("AAArjunzA");
   
     	
     	WebElement createTask  = driver.findElement(By.xpath("(//span[text() = 'Create Tasks'])[1]"));
     	createTask.click();
         Thread.sleep(2000);
     	WebElement logout  = driver.findElement(By.xpath("//a[@class='logout']"));
     	logout.click();

     	
     	//input[@id='createTasksPopup_newCustomer']
     	
     //	WebElement checkbox = driver.findElement(By.xpath("//input[@ type = 'checkbox']"));
//		Thread.sleep(3000);
//        checkbox.click();
//        Thread.sleep(5000);
//		boolean result = checkbox.isSelected();
//		System.out.println(result);

}

}
