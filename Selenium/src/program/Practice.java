package program;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {
	
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
		
		TakesScreenshot s  =	(TakesScreenshot)driver;
		   File source =  s.getScreenshotAs(OutputType.FILE);
		   File Destination = new File("E:\\Selenium Screenshot\\" +  "test"  + ".jpg");
		   FileHandler.copy(source, Destination);
		   
		   
	}
		
		
	}

