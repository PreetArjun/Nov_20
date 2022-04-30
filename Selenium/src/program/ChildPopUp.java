kpackage program;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_update.asp"); // main window

		

	   WebElement submit = driver.findElement(By.xpath("(//a [@ class='w3-btn w3-margin-bottom'])[1]")); //1
	   WebElement submit1 = driver.findElement(By.xpath("(//a [@ class='w3-btn w3-margin-bottom'])[2]"));//2
		//WebElement submit2 = driver.findElement(By.xpath("(//a [@ class='w3-btn w3-margin-bottom'])[3]"));//3
	//	WebElement next = driver.findElement(By.xpath("(//a[@class='w3-right w3-btn'])[2]"));
		
        submit.click();
        Thread.sleep(10000);
        submit1.click();
        Thread.sleep(2000);
        
         ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(addr.get(1));
       String a =  driver.getCurrentUrl();
        System.out.println(a);
        Thread.sleep(2000);
		//WebElement Run = driver.findElement(By.xpath("//button[text() ='Run SQL »']")); //1
        //Run.click();        
        //driver.close();
        //Thread.sleep(2000);
       // driver.switchTo().window(addr.get(0));     
        
        //submit1.click();
        //submit2.click();
      //  next.click();
        
//      String s =  driver.getWindowHandle();
//      System.out.println(s);
//       
//      Set<String> w = driver.getWindowHandles();
//      System.out.println(w);

     
//      
//   
//       ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
//  
//      
//      String  A = addr.get(0);
//      System.out.println(addr.get(0));
//      System.out.println(driver.getCurrentUrl());
//      
    
      
    

       
	}

}
