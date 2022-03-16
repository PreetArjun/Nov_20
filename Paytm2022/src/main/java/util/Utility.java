package util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void screenShot(WebDriver driver , String testID) throws IOException
	{
		
		String DateTime = new SimpleDateFormat(" dd-MM-yyyy-hh-mm-ss").format(new Date());
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);				
		File destination = new File("E:\\Selenium Screenshot\\" +  "Test" + testID + DateTime + ".jpg" );		
		FileHandler.copy(source, destination);	
		
	}
	
	public static String getDataFromExcel(String sheet , int row , int cell)
	{
		
		String data = "";
		
		
		return data;
	}
	
	

}
