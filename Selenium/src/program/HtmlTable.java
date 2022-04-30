package program;

import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\file selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
//   List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//td"));
//      int noOfWeb  =   cells.size();
//       for(int i =0; i<noOfWeb; i++)
//       {      
//        WebElement ele =   cells.get(i);
//        String x = ele.getText();	
//        System.out.println(x);
//	  }
//		
		  List<WebElement> head = driver.findElements(By.xpath("//table[@id='customers']//th"));
		 for(int k=0; k<head.size(); k++) 
		 {
			WebElement d = head.get(k);
			String aaa = d.getText();
			System.out.print(aaa + ",");
		 }	
		 System.out.println();
  List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
  int noOfWeb  =   row.size();

       for(int i =1; i<noOfWeb; i++)
       {
   List<WebElement> cells = driver.findElements(By.xpath("//table[@id='customers']//tr[" + (i+1) +"]//td"));
   int noOf  =   cells.size();
   for (int j = 0; j<noOf; j++)
   {
   WebElement ele =   cells.get(j);
    String x = ele.getText().concat(",");	
     System.out.print(x);        
       
       }
      System.out.println(); 
       
       
       
		
       }    
		
   	}
}

