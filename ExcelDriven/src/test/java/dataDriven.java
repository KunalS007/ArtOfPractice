import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven 
{
	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		/* XLS to Sheet
		 * Sheet to Rows
		 * Rows to Cell
		 */
		
		ArrayList<String> a = new ArrayList<String>();
		
		//xls file setup code and file input stream argument
		FileInputStream fip = new FileInputStream("C:\\Users\\DELL\\Desktop\\demoData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fip);
		
		//XLS File >> XLS Sheet, Setup Code
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testcase"))
			{
				XSSFSheet sheetcount = workbook.getSheetAt(i);
				
				//Identify testcases column by scanning the entire 1st row
				Iterator<Row> rows = sheetcount.iterator();
				Row Firstrow = rows.next();
				
				//Cell Identify
				Iterator<Cell> ce = Firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell cellValue = ce.next();
					if(cellValue.getStringCellValue().equalsIgnoreCase("testCase"))
					{
						column=k;
					}
					k++;
				}
				System.out.println(column);
				
				// Once column is identified then scan entire testcase column to identify purchase testcase row
				while(rows.hasNext())
				{
					Row r = rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("testcaseName"))
					{
						Iterator<Cell> cv= r.cellIterator();
						while(cv.hasNext())
						{
							Cell c = cv.next();
							if(c.getCellType()==CellType.STRING)
							{
								a.add(cv.next().getStringCellValue());
							}
							else
							{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return a;
	}
	
	public static void main(String[] args) throws IOException 
	{

	}
}
                                                                                           