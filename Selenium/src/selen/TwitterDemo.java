package selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TwitterDemo {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\file selenium\\chromedriver.exe");
			
		   WebDriver  driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   driver.get("https://twitter.com/i/flow/signup");
		   Thread.sleep(5000);
		   
		   WebElement name = driver.findElement(By.xpath("//input[@autocomplete='name']"));
            name.click();
	       name.sendKeys("Arjun Patidar");
	       
	       Thread.sleep(5000);
	       
		   WebElement password = driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]"));
		   password.click();
           password.sendKeys("7976752881");
	     
		   WebElement month = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[1]"));
		   WebElement day = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]//option[24]"));
		   WebElement year = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[3]//option[26]"));


          // month.click();
           // (//select[@aria-invalid='false'])[1]//option[4]
		   Select s = new Select(month);
		   s.selectByVisibleText("April");
		   day.click();
		   year.click();
		   Thread.sleep(2000);
		   WebElement next = driver.findElement(By.xpath("(//div[@role='button'])[3]"));
           next.click();
           
           WebDriverWait wait = new WebDriverWait(driver, 10);
           WebElement Nexxxt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text() ='Next'])[1]")));
           Nexxxt.click();
		  
           WebElement signup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text() ='Sign up'])[1]")));
           signup.click();
		
           WebElement ok = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@dir='auto'])[2]")));
		   ok.click();
           
		
		
		
	}

}
