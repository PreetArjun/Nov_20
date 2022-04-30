package program;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/"); 
		Thread.sleep(3000);
		
		 WebElement Tryitcss = driver.findElement(By.xpath("(//a[text()='Try it Yourself'])[2]"));
		 Tryitcss.click();
		 Thread.sleep(3000);
		 ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(addr.get(1));
			Thread.sleep(2000);
		 WebElement iframe  = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		 driver.switchTo().frame(iframe);
		 Thread.sleep(2000);
		 WebElement text  = driver.findElement(By.xpath("//h1[contains(text() , 'My')]"));
         String x = text.getText();
        System.out.println(x);
		   
		   Thread.sleep(2000);
         driver.switchTo().defaultContent();
         driver.switchTo().parentFrame();
		
		
		
		
		
	}

}
