package program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\file selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	    WebElement scrolldown = driver.findElement(By.xpath("//a[text() = 'Amazon Pay on Merchants']"));
	    
	    JavascriptExecutor  js = (JavascriptExecutor)driver;
	     js.executeScript("arguments[0].scrollIntoView(true);", scrolldown);
	   // js.executeAsyncScript("window.scrollby(", args)

	}

}
