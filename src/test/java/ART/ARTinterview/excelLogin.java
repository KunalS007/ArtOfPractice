package ART.ARTinterview;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
	        Object[][] data = new Object[rows - 1][2];
	        DataFormatter formatter = new DataFormatter();

	        for (int i = 1; i < rows; i++) 
	        {
	            Row row = sheet.getRow(i);
	            if (row != null) 
	            {
	                Cell userCell = row.getCell(0);
	                Cell passCell = row.getCell(1);

	                data[i-1][0] = (userCell != null) ? formatter.formatCellValue(userCell) : "";
	                data[i-1][1] = (passCell != null) ? formatter.formatCellValue(passCell) : "";
	            }
	        }

	        workbook.close();
	        fis.close();
	        return data;
	    }	
	
	@Test(dataProvider = "loginData")   
	public void secondTest(String username, String password) throws IOException
	{
		loginWithExcelData(username,password);
		
		boolean loginSuccess = driver.findElements(By.linkText("Edit your account information")).size() > 0;
		
		if (loginSuccess)
        {
            System.out.println("Valid login for: " + username);

            driver.findElement(By.xpath("//span[text()='My Account']")).click();
            driver.findElement(By.linkText("Logout")).click();
        }
        else
        {
            String fileName = "InvalidLogin_" + username.replaceAll("[^a-zA-Z0-9]", "_");
            String screenshotPath = getScreenShot(fileName);

            System.out.println("Invalid login for: " + username);
            System.out.println("Screenshot saved at: " + screenshotPath);
        }

	}
	
	
}