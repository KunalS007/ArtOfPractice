package Growwx.Growwx_rsrc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseGrowx 
{
	public WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initlizeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fip = new FileInputStream("E:\\Automation Projects\\Growwx_rsrc\\Data.properties");
		prop.load(fip);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.contains("firefox"))
		{
			FirefoxOptions options = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			if(browserName.contains("headless"))
			{
				options.addArguments("headless");
			}
			driver = new FirefoxDriver(options);
		}
		
		else if(browserName.equals("IE"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
	public WebDriver loginApplication() throws InterruptedException, IOException
	{
		String betaportal = prop.getProperty("url");
		driver.get(betaportal);
		
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		//Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("login-button")).click();
		
		return driver;
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir")+ "//reports//" +testCaseName +".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir")+ "//reports//" +testCaseName +".png";
	}
	
}
