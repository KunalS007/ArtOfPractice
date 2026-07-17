import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide_Excel {

	DataFormatter formater = new DataFormatter();
	@Test(dataProvider="driveTest")
	public void testCaseData(String greeting,String communication,String id)
	{
		System.out.println(greeting+communication+id);
	}

	@DataProvider(name="driveTest")
	public void getData() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Kunal S\\OneDrive\\Desktop\\ExcelDriven1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount= row.getLastCellNum();
		Object Data[][] = new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++)
		{
			row = sheet.getRow(i+1);
			for(int j=0;j<colCount;j++)
			{
				System.out.println(row.getCell(j));
			}
		}
	}
}

	