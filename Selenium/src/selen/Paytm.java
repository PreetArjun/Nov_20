package selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {
public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement busTicket = driver.findElement(By.xpath("(//div[@class='_2EGQY'])[3]"));

		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].scrollIntoView(true);", busTicket);
          busTicket.click();
//		  WebElement radiobutton = driver.findElement(By.xpath("//label[text() ='One Way']"));
//		  boolean result =   radiobutton.isSelected();
//		  System.out.println(result);
       
		  WebElement radiobuttonfor = driver.findElement(By.xpath("//label[text()= 'Round Trip']"));
		  radiobuttonfor.click();
		  WebElement from = driver.findElement(By.xpath("(//input[@id='text-box'])[1]"));
		  from.sendKeys("Mumbai");
		  WebElement suggestionFrom = driver.findElement(By.xpath("(//div[@class='_38Wj']//p)[3]"));
		  suggestionFrom.click();
		  WebElement to = driver.findElement(By.xpath("(//input[@id='text-box'])[2]"));
		  to.sendKeys("Pune");
		  WebElement suggestionTo = driver.findElement(By.xpath("//p[text()='Khandala ']"));
		  suggestionTo.click();
		  
		   WebElement departureDate = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		   Actions act = new Actions(driver);
		   act.moveToElement(departureDate).click().build().perform();
		  
		   WebElement next = driver.findElement(By.xpath("//a[contains(@class,'rea')]"));
		   js.executeScript("arguments[0].click();", next);
           WebElement date = driver.findElement(By.xpath("//div[text()='25']"));
           act.moveToElement(date).click().build().perform();
        
		   WebElement returnDate = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
           act.moveToElement(returnDate).click().build().perform();
           
		   WebElement dateOfReturn = driver.findElement(By.xpath("(//div[text()='28'])[2]"));
		   dateOfReturn.click();
		   WebElement search = driver.findElement(By.xpath("//button[text() = 'Search']"));
		   search.click(); 
		   
		   
        


		 
		
		
		

}
}