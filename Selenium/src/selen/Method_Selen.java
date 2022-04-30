package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Selen {
	
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","E:\\file selenium\\chromedriver.exe"); //set property are used to instruct the browser which will be used
	        //	webdriver.chrome.driver  Chrome driver  
		    //  webdriver.gecko.driver  Firefox
	    	//  webdriver.i.e.driver   Internet explorer
		 
		 WebDriver driver = new ChromeDriver(); //browser launched by this
		 driver.get("https://www.youtube.com/"); // to launch the application
		 
		 driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		 Thread.sleep(3000);
		 
		 driver.navigate().forward();
		 Thread.sleep(3000);
		 
		 driver.navigate().back();
		 Thread.sleep(3000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 
		 driver.close();
		 
		 driver.quit();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		     
		 Dimension d = new Dimension(100, 100);
		 driver.manage().window().setSize(d); // change size of the browser
		 
		 Point p = new Point(12,45);
		 driver.manage().window().setPosition(p);
		 
		  By b = By.xpath(""); // to find specific web element
		  driver.findElement(b);
		    
		   WebElement DobDay = driver.findElement(By.xpath(null));
		   DobDay.sendKeys("12");
	       DobDay.click();
	         
	      String url =  driver.getCurrentUrl();
	      System.out.println(url);
			     
	      String title = driver.getTitle();
		  System.out.println(title);
			     
	}

}
