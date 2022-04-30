package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		

	     WebElement  email = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement  password = driver.findElement(By.xpath("//input[contains (@ type,'password')]"));
        WebElement  login  = driver.findElement(By.xpath("//button[text()='Log In']"));
        
      //  email.click();
       // email.sendKeys("Arjun@yahoo.in");
        
        //password.click();
     //  password.sendKeys("987654321");
        
      //  login.click();
       
       
        WebElement CreateNewAcc = driver.findElement(By.xpath("(//a [@ role='button'])[2]"));
        CreateNewAcc.click();
        
        Thread.sleep(3000);
        WebElement Name = driver.findElement(By.xpath("//input[@ name='firstname']"));
        WebElement Surname = driver.findElement(By.xpath("(//input[contains (@ class,'inputtext')])[4]"));
        WebElement mobileno = driver.findElement(By.xpath("(//input[@ type='text'])[4]"));
        WebElement passwordd = driver.findElement(By.xpath("(//input[@ class='inputtext _58mg _5dba _2ph-' ] )[5]"));
        
        Name.sendKeys("Arjun");
        Surname.sendKeys("Patidar");
        mobileno.sendKeys("7896541230");
        passwordd.sendKeys("963145@qaw");
        
       Thread.sleep(2000);

        WebElement DobDay = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement DobMonth = driver.findElement(By.xpath("//select[@ aria-label='Month']"));
        WebElement DobYear = driver.findElement(By.xpath("//select[@ aria-label='Year']"));

        Select s = new Select(DobDay);
        s.selectByIndex(2);
        
        //DobDay.sendKeys("12");
        //DobDay.click()
       
       
         Select c = new Select(DobMonth);
         c.selectByVisibleText("Apr");
      //  DobMonth.sendKeys("Aug");
       // DobMonth.click();
        
       Select d = new Select(DobYear);
       d.selectByValue("2001");
        //DobYear.sendKeys("2000");
        //DobYear.click();
        
       // WebElement Gender = driver.findElement(By.xpath("//label[text() = 'Male']"));
        //Gender.click();
        
        WebElement Custom = driver.findElement(By.xpath("(//label[@class='_58mt'])[3]"));
        Custom.click();
   //  boolean  result = Custom.isDisplayed();
     //  System.out.println(result);
       WebElement pronoun = driver.findElement(By.xpath("//select[@ name='preferred_pronoun']"));
     boolean result = pronoun.isDisplayed();
      if (result==true)
      {
    	  System.out.println("pass");
      }
      else
      {
    	  System.out.println("fail");
      }
        //WebElement Signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
        //Signup.click();
        
        
        
  
	}
		
	}


