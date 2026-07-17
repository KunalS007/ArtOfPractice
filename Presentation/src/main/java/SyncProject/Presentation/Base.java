package SyncProject.Presentation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initlizeDriver() throws IOException
	{
		prop = new Properties();
		FileInputStream fip = new FileInputStream("E:\\Automation Projects\\Presentation\\data.Properties");
		prop.load(fip);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browserName.equals("fireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equals("IE"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public WebDriver loginApplication() throws InterruptedException
	{
		String betaportal = prop.getProperty("url");
		driver.get(betaportal);
		
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtpassword")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='log in]")).click();
		
		return driver;
		
	}
}
