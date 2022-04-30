package selen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InstaLogin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\file selenium\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)		;
		WebElement user = driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]"));
		WebElement password = driver.findElement(By.xpath("(//input[@aria-required='true'])[2]"));
		WebElement login = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		
		 user.sendKeys("jabalpur.official");
	     password.sendKeys("Arjun@123");
	     boolean loginbutton = login.isEnabled();	
		 System.out.println(loginbutton);
		 if(loginbutton==true)
		 {
			 login.click();
		 }
			WebElement saveYourlogin = driver.findElement(By.xpath("//button[text()='Not Now']"));
			saveYourlogin.click();
			
			WebElement turnOnNotification = driver.findElement(By.xpath("//button[text() = 'Not Now']"));
			turnOnNotification.click();
			WebElement searchBar = driver.findElement(By.xpath("//input[@aria-label='Search input']"));
			//searchBar.click();
			Thread.sleep(2000);
			searchBar.sendKeys("deepikapadukone");
			WebElement suggestion = driver.findElement(By.xpath("(//div[text()='Deepika Padukone'])[1]"));
            suggestion.click();
			WebElement follow = driver.findElement(By.xpath("(//button[contains(@class, '_5f5mN')])[1]"));
	     	String x =	follow.getText();
	     	System.out.println(x);
			follow.click();
			WebElement photo = driver.findElement(By.xpath("(//div[@class='eLAPa'])[1]"));
            photo.click();
			WebElement like = driver.findElement(By.xpath("(//button[@class=\"wpO6b  \"])[5]"));
            like.click();
			WebElement closePhoto = driver.findElement(By.xpath("(//button[@class='wpO6b  '])[2]"));
			closePhoto.click();
			Thread.sleep(2000);
			
			WebElement unfollow = driver.findElement(By.xpath("(//button[contains(@class, '_5f5mN')])[1]"));
			Actions act = new Actions(driver);
			act.moveToElement(unfollow).click().build().perform();
			WebElement YesUnfollow = driver.findElement(By.xpath("//button[text() ='Unfollow']"));
			YesUnfollow.click();
			WebElement goForLogout = driver.findElement(By.xpath("(//div[@class='XrOey'])[6]"));
			goForLogout.click();
			WebElement logout = driver.findElement(By.xpath("//div[text()='Log out']"));
			logout.click();
			

		
		
	
	
		//String S = login.getText();
		//System.out.println(S);
		//Thread.sleep(2000);
	    //String A = login.getText(); //html text is not present
	    //System.out.println(A);
		
	    //String B = user.getAttribute("aria-label");
	    //System.out.println(B);
	    
	    
		
		
	}

}
