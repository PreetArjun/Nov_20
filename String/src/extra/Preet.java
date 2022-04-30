package extra;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Preet{
	
	
	public static void takeScreenShot(WebDriver driver , String testID)
	{
		String dateTime = new SimpleDateFormat("dd-MM-yyy-hh-mm-ss").format(new Date());
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination  = new File("Path of folder" + "Name" + testID + dateTime + ".jpg");
		FileHandler.copy(source , destination);
		
	}
	
	public static void screenShot(WebDriver driver , String testID) throws IOException
	{
	   String DateTime = new SimpleDateFormat( "").format(new Date());
	   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File destination = new File ("E:\\Selenium Screenshot\\" +  "Test" + testID + DateTime + ".jpg");
	   FileHandler.copy(source, destination);	   
	}
	
	public static String getDataFromExcel(String sheet, int row , int cell )
	{
		String data = "";
		String path = "path of  file";
		FileInputStream file  = new FileInputSream(path);
		Sheet Sheet = WorkbookFactory.create(file).getSheet(sheet);
		try
		{
		    data =Sheet.getRow(row).getCell(cell).getStringCellValue();			
		}
		catch(IllegalStateException e)
		{
			double value =sheet.getRow(row).getCell(cell).getNumericCellValue();
			data = Double.toString(value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
		
	}
	public static String getDataFromExcel(String sheet , int row , int cell) throws EncryptedDocumentException, IOException	
	{
		String data = "";
		String path = "E:\\file selenium\\data2 - Copy.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet Sheet = WorkbookFactory.create(file).getSheet(sheet);
		try
		{
		data = Sheet.getRow(row).getCell(cell).getStringCellValue();	
		}
		catch(IllegalStateException e)
	    {
		double value = Sheet.getRow(row).getCell(cell).getNumericCellValue();
		data = Double.toString(value);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
	
	}
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.Executesccript("arguments[0].scrollIntoView(true);", refrence of webElement);
	
	
	
	 JavascriptExecutor  js = (JavascriptExecutor)driver;
     js.Executescript("arguments[0].scrollIntoView(true);", scrolldown);

     
     Alert  alt = driver.switchTo.alert();
     alt.accept();
     alt.dismiss();
     alt.getText();
     alt.sendkeys();
     
     
     ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo.window(addr.get(1));
     String url =  driver.getCurrentUrl();
     System.out.println(url);
    
     
     ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
     driver.switchTo().window(addr.get(1));
     String a =  driver.getCurrentUrl();
     System.out.println(a);
     
     
     List<WebElement> cells = driver.findelEments(By.xpath(" relative xpath"));
     WebElement value = cells.get(i);
     String data = value.getText();
     
     
     List<WebElement> xyz = driver.findelements(By.Tagname("a"));
     WebElement cell = xyz.get(int);
     String data = cell.getattribute("href");
     if(data.equal(""))
     {
    	 System.out.println(data);
     }
     
     
     driver.manage().timeouts().implicitlywait(12, TimeUnit.SECONDS);
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
     
    WebDriverWait wait = new WebDriverWait(driver, 15);
    WebElement test =  wait.until(ExpectedConditions.VisisbilityofElementLocated(By.xpath("")));
     
 	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	WebElement test = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='customers']//th")));
     
     
     
     
     
     
     
     
	
public static void main(String[] args)
  
  {	
	      
	
	
	
  }
}
