package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Utility {

	
	public static String getDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		String data = "";
		String path = "E:\\file selenium\\Groww.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet Sheet  = WorkbookFactory.create(file).getSheet(sheet);
		try
		{
			data = Sheet.getRow(row).getCell(cell).getStringCellValue();
		}
		catch(IllegalStateException e)
		{
			double Value = Sheet.getRow(row).getCell(cell).getNumericCellValue();
			data = Double.toString(Value);
		}		
		return data;
	}
	
	
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		String DateTime = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss").format(new Date());
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		FileHandler.copy(source, destination);
		
		
		
	}
	

	
}
