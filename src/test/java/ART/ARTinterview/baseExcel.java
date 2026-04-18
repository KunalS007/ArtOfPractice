package ART.ARTinterview;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseExcel 
{
	protected WebDriver driver;
	protected Properties prop;
	
	
	public WebDriver initBrowser() throws IOException
	{
		FileInputStream fip = new FileInputStream("E:\\Automation Projects\\1ARTinterview\\Data.properties");
		prop = new Properties();
		prop.load(fip);
		
		String browserName = prop.getProperty("browser");
		switch(browserName)
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
				
			default:
				System.out.println("Invalid browser");
				break;
		}
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public WebDriver loginWithExcelData(String username, String password)
	{
		String companyName = prop.getProperty("URL");
		driver.get(companyName);
		
		 driver.findElement(By.xpath("//a[@title='My Account']")).click();
		 driver.findElement(By.xpath("//*[text()='Login']")).click();

		 driver.findElement(By.name("email")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 return driver;	
	}
	
	public String getScreenShot(String testCaseName) throws IOException
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        File reportsFolder = new File(System.getProperty("user.dir") + "\\reports");
        if (!reportsFolder.exists())
        {
            reportsFolder.mkdirs();
        }

        File destination = new File(reportsFolder, testCaseName + ".png");
        FileUtils.copyFile(source, destination);

        return destination.getAbsolutePath();
    }

	
}
