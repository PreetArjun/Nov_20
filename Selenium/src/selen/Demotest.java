package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demotest {
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	

		  WebElement CreateNewAcc = driver.findElement(By.xpath("(//a [@ role='button'])[2]"));
	        CreateNewAcc.click();
	        Thread.sleep(2000);
	        WebElement DobDay = driver.findElement(By.xpath("//select[@id='day']"));
	        
	   Actions act =new Actions(driver);
	   act.moveToElement(DobDay).click().build().perform();
	   
	        

	
}
}