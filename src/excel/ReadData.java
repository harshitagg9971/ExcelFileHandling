package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData 
{
	@Test
	public void readData() throws IOException
	{
		FileInputStream fis =  new FileInputStream("F:/NCSA6_part2/ExcelFileHandling/ExcelSheet.xlsx");
		XSSFWorkbook wb = new 	XSSFWorkbook(fis);
		/*
		 * Sheet s = wb.getSheet("harshit"); 
		 * Row r = s.getRow(8); 
		 * Cell c = r.getCell(6);
		 * System.out.println(c.getStringCellValue());
		 * //System.out.println(c.toString());
		 */	
		System.out.println(wb.getSheet("harshit").getRow(8).getCell(6).getStringCellValue());
		//System.out.println(wb.getSheet("harshit").getRow(8).getCell(6).toString());
		wb.close();
	}
}
