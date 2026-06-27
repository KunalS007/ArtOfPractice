package ART.ARTinterview;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelRead 
{
	@Test
	public void readExcelData() throws IOException
	{
		String path = System.getProperty("user.dir")+ "\\TestData.xlsx";
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Rows" +totalRows);
		DataFormatter formatter = new DataFormatter();

		
		for(int i=0; i< totalRows; i++)
		{
			Row row = sheet.getRow(i);
			if(row != null)
			{
				Cell userCell = row.getCell(0);
				Cell passCell = row.getCell(1);
				
				 String userName = (userCell != null) ? formatter.formatCellValue(userCell) : ""; 
				 String password = (passCell != null) ? formatter.formatCellValue(passCell) : "";

				System.out.println(userName + "|" + password);
			}
		}
		workbook.close();
		fis.close();
	}
}
