package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver launchChromeBrowser()
	{	
		System.out.println(" launchBrowser");
		System.setProperty("webdriver.chrome.driver","E:\\file selenium\\hi\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		return driver;
	}
	
	public static WebDriver launchFirefoxBrowser()
	{	
		System.out.println(" launchBrowser");
		System.setProperty("webdriver.gecko.driver","E:\\file selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();	
		return driver;
	}
	
	public static WebDriver launchEdgeBrowser()
	{	
		System.out.println(" launchBrowser");
		System.setProperty("webdriver.edge.driver","E:\\file selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();	
		return driver;
	}

}
