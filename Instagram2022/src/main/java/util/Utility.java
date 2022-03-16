package util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility {
	
	
	
	public static String getDataFromExcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException
	{
		String data ="";
		String path = "E:\\file selenium\\InstaData.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet Sheet = WorkbookFactory.create(file).getSheet(sheet);
		try
		{
		 data =	Sheet.getRow(row).getCell(cell).getStringCellValue();
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

}
