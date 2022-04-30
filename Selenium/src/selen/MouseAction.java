package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\file selenium\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		WebElement accAndList = driver.findElement(By.xpath("//span[text() = 'Account & Lists']"));
		WebElement businessAcc = driver.findElement(By.xpath("//span[text()='Your Amazon Business Account']"));
	    Thread.sleep(2000);
        //account.click();
         Actions act = new Actions(driver);
        act.moveToElement(accAndList).moveToElement(businessAcc).click().build().perform();
        
         // drag and drop
       //  driver.get("https://demo.guru99.com/test/drag_drop.html");
       //  Thread.sleep(3000);
        // Actions act = new Actions(driver);
 		// WebElement drag = driver.findElement(By.xpath("//a[text() = ' 5000']"));
 		 //WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        // act.dragAndDrop(drag, drop).perform();

      
         //Scroll up and scroll down
        		 
         
         
      //  JavascriptExecutor js =  (JavascriptExecutor)driver;
       // js.executeScript("window.scrollBy(0, 3000)");
        // Thread.sleep(2000);
        // js.executeScript("window.scrollBy(0, 2000)");// scroll down
        // js.executeScript("window.scroll(, -2000)"); // scroll up
         
         
        // js.executeScript("window.scroll(3000,0)"); // Scroll Right
         // js.executeScript("window.scroll(-3000,0)"); // Scroll Lef      
         
          
		
	}

}
