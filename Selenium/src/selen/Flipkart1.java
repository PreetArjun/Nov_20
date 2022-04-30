package selen;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {
	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver", "E:\\file selenium\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();	
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   driver.get("https://www.flipkart.com/");	   
		   WebElement closeLoginTab = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		   closeLoginTab.click();
		   WebElement inputbar = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		   inputbar.click();
		   inputbar.sendKeys("I phone 13");
		   WebElement search = driver.findElement(By.xpath("(//a[@class='_3izBDY'])[2]"));
		   Actions act = new Actions (driver);
		   act.moveToElement(search).click().build().perform();
		 //  search.click();
		   WebElement iphone = driver.findElement(By.xpath("(//div[contains(text(), 'APPLE iPhone 13')])[2]"));
           iphone.click();            
           ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
           driver.switchTo().window(addr.get(1));
     	   WebElement addToCart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		   addToCart.click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
