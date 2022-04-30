package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicEle {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				submit.sendKeys("Mobile under 10000");
				Thread.sleep(2000);
		WebElement ok = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        ok.click();
        Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-1']//h2"));
     String x =mobile.getText();
     System.out.println(x);
	}
	

}
