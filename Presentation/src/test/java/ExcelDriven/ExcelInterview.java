package ExcelDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelInterview 
{
	
	    public static void main(String[] args) throws Exception 
	    {

	        // Setup WebDriver properly
	        WebDriverManager.chromedriver().setup();

	        FileInputStream fis = new FileInputStream("E:\\Automation Projects\\Presentation\\reports\\Cruise Booking_Test Cases.xlsx");
	        Workbook wb = WorkbookFactory.create(fis);
	        Sheet sheet = wb.getSheet("Sheet1");

	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
	            Row row = sheet.getRow(i);
	            String username = row.getCell(0).getStringCellValue();
	            String password = row.getCell(1).getStringCellValue();

	            WebDriver driver = new ChromeDriver(); // new browser for each row
	            driver.manage().window().maximize();
	            driver.get("https://sandbox.dev.clover.com/login");

	            WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email-input"))).sendKeys(username);
	            driver.findElement(By.id("password-input")).sendKeys(password);

	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'Log In')]"))).click();

	            Thread.sleep(3000); // see result (replace with assertion in real test)
	            driver.quit();
	        }

	        wb.close();
	        fis.close();
	    }
	}
