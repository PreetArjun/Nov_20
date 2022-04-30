package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	

	public WebDriver launchChromebrowser(String browser)
	{
		
	System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	return  driver;
	}
	

}
