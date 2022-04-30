package program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.w3schools.com/html/html_tables.asp");	
	
	// SAME FOR BROKEN IMAGE , TAGNAME - img, ATTRIBUTE - src
	 // List<WebElement> links = driver.findElements(By.xpath("//a[@href ]"));
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	 
	  int size =  links.size();
	  
	  for(int i =0 ; i<=size-1; i++)
    {	  
	  WebElement data = links.get(i);  
	  String y = data.getAttribute("href");
	  if (y.equals(""))
	  {
		  System.out.println(y);
	  }
	  else
	  {
		  System.out.println("No broken Links");
	  }
		  
    }
	}
	 		

}