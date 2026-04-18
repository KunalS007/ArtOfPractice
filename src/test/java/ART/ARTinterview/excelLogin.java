package ART.ARTinterview;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelLogin extends baseExcel 
{
	@Test
	public void firstTest() throws IOException
	{
		driver = initBrowser();
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData() throws Exception 
	{
	        String path = System.getProperty("user.dir") + "\\TestData.xlsx";
	        FileInputStream fis = new FileInputStream(path);
	        XSSFWorkbook workbook = new XSSFWorkbook(fis);

	        Sheet sheet = workbook.getSheet("Sheet1");
	        int rows = sheet.getPhysicalNumberOfRows();
	        Object[][] data = new Object[rows][2];

	        for (int i = 1; i < rows; i++) 
	        {
	            Row row = sheet.getRow(i);
	            if (row != null) 
	            {
	                Cell userCell = row.getCell(0);
	                Cell passCell = row.getCell(1);

	                data[i][0] = (userCell != null) ? userCell.toString() : "";
	                data[i][1] = (passCell != null) ? passCell.toString() : "";
	            }
	        }

	        workbook.close();
	        fis.close();
	        return data;
	    }	
	
	@Test(dataProvider = "loginData")   
	public void secondTest(String username, String password)
	{
		loginWithExcelData(username,password);
	}
}