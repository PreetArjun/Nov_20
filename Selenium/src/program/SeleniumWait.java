package program;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
	
	public static void main(String[] args) {
		
		
	   System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	   driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	//Impicit:- Waiting time -->applicable for all web element which are present on web page
		
		
	   WebElement test = driver.findElement(By.xpath("//table[@id='customers']//th"));
		
	   String x = test.getText();
		
	   System.out.println(x);
	   WebElement test1 = driver.findElement(By.xpath("//table[@id='customers']//tr"));
       String y = test1.getText();
	   System.out.println(y);

		
		//Explicit - waiting Time + Condition) --> applicabale for only one element, Which are specify by the user
		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//		
//		WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='customers']//th")));
//		
//		 String x = test.getText();	
//		 System.out.println(x);
//		 
//		WebElement test1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='customers']//tr122")));
//		
//		 String y = test1.getText();	
//		 System.out.println(y);
	}

}
