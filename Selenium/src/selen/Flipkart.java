package selen;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

public static void main(String[] args) {
	
		   
		   System.setProperty("webdriver.chrome.driver", "E:\\file selenium\\chromedriver.exe");		
		   WebDriver driver = new ChromeDriver();	
		   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   driver.get("https://www.flipkart.com/");
		   Actions act = new Actions(driver);
		   WebElement closeLoginTab = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		   closeLoginTab.click();
		   WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
		   act.moveToElement(electronics).perform();
		   WebElement gaming = driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[3]"));
		   act.moveToElement(gaming).perform();
		   WebElement gamingMousepad = driver.findElement(By.xpath("(//a[@class='_6WOcW9 _3YpNQe'])[10]"));
		   act.moveToElement(gamingMousepad).click().perform();
		   WebElement product = driver.findElement(By.xpath("//div[@data-id='ACCG3PZ54TGMBEXK']"));
		   JavascriptExecutor js =  (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView(true);", product);
		   product.click();
		   
		   ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(addr.get(1));
		   WebElement AddToCart = driver.findElement(By.xpath("//button[text() = 'ADD TO CART']"));
           AddToCart.click();
		   
           
           
           
		   
	}
}
