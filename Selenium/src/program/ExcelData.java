package program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	
	
		
     public static void main(String[] args) throws IOException {
		
		
		String path = "E:\\file selenium\\data2 - Copy.xlsx";
		FileInputStream file = new FileInputStream(path);
		//String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(data);
		
		//double data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(4).getCell(1).getNumericCellValue();
		//System.out.println(data1);
		
		//Date date = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getDateCellValue();
		//System.out.println(date);
		
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		
		for(int i =0; i<lastRowNum; i++)
		{
	    Row row = 	sheet.getRow(i);
	    int lastCellNum = row.getLastCellNum();
	   // System.out.println(row);
	   for(int j =0; j<lastCellNum; j++) 
	   {
	    Cell cell =  row.getCell(j);
		String data = cell.getStringCellValue();
		System.out.print (data + ",");
	  }
	   System.out.println();
	}
	}
}
