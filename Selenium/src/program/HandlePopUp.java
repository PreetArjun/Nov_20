package program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUp {
	
	public static void main(String[] args) throws InterruptedException {
				
		System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();		
		
        Thread.sleep(2000);
        
        Alert alt = driver.switchTo().alert();
        //alt.accept();
        // alt.dismiss();
        
        Thread.sleep(2000);
       
        // driver.switchTo().alert().accept();
        //  alt.accept();
        // alt.dismiss();
        String text = alt.getText();
        System.out.println(text);
        alt.sendKeys("hii");
                 			
	}

}
