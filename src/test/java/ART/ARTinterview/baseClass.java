package ART.ARTinterview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass 
{
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException
	{
		FileInputStream fip = new FileInputStream("E:\\Automation Projects\\1ARTinterview\\Data.properties");
		prop = new Properties();
		prop.load(fip);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		switch (browserName) 
		{
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
				
			case "IE":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("Invalid Browser");
				break;
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver loginApp()
	{
		String companyName = prop.getProperty("URL");
		driver.get(companyName);
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		//Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		return driver;	
	}
	
	public String getScreenShot(WebDriver driver, String testCaseName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest =  new File(System.getProperty("user.dir")+ "//reports//" +testCaseName+ ".png");
		FileUtils.copyFile(source, dest);
		return System.getProperty("user.dir")+ "//reports//" +testCaseName+ ".png";
		
	}
}
