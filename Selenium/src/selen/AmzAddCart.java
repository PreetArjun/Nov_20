package selen;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzAddCart {
	 public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "E:\\file selenium\\chromedriver.exe");		
		   WebDriver  driver = new ChromeDriver();		
		   driver.get("https://www.amazon.in/");
		   Thread.sleep(2000);
		   WebElement amzon = driver.findElement(By.xpath("//input[@ id='twotabsearchtextbox']"));
		   amzon.sendKeys("watch for man");
		   WebElement click = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		   click.click();
		   WebElement watch = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]"));
		   String g =watch.getText();
		   System.out.println(g);
		   watch.click();
		   Thread.sleep(2000);
		   ArrayList<String> addr =  new ArrayList<String>(driver.getWindowHandles());
		   driver.switchTo().window(addr.get(1));
           System.out.println(driver.getCurrentUrl());
		   
		   WebElement AddToCart = driver.findElement(By.xpath("//input[contains (@ name, 'submit.add-to-cart')]"));
		   AddToCart.click();
		   System.out.println(driver.getCurrentUrl());
		   
		  //  WebElement scrolldown = driver.findElement(By.xpath("//a[text() = 'Amazon Pay on Merchants']"));

	      // WebElement AddToCart = driver.findElement(By.xpath("//div[@data-asin='B002LZUAFM']//h2"));
		//   JavascriptExecutor js =  (JavascriptExecutor)driver;
           //Thread.sleep(2000);
        //  js.executeScript("arguments[0].scrollIntoView(true);", scrolldown);
          // js.executeScript(null, args);
		   //js.executeScript("arguments[0].scrollIntoView(true);", AddToCart);
       //   Thread.sleep(5000);
		//  WebElement scrollup = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		//  js.executeScript("arguments[0].scrollIntoView(true);",scrollup);
	 //	  scrollup.click();
} 

}