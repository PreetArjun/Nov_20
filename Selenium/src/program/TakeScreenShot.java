package program;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	public static void screenshot() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		
	String DateTime = new SimpleDateFormat(" dd_MM_yyyy_hh_mm_ss").format(new Date());
		
		for(int i = 1 ; i<=10; i++)
		{
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("E:\\Selenium Screenshot\\" +  "test" + i + DateTime + ".jpg" );

		FileHandler.copy(source, destination);	
		}
	}
	public static void main(String[] args) throws IOException  {
		
		screenshot();
	
		
		
	}

}
