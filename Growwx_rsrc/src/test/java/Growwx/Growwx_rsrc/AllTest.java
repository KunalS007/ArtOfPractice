package Growwx.Growwx_rsrc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllTest 
{
	WebDriver driver;
	String username = "standard_user";
	String password = "secret_sauce";
	String invaliduser ="abc";
	String invalidpwd ="123";
	String Validationmsg = "Epic sadface: Username and password do not match any user in this service";
	
	@Test(priority=1)
	public void initializeDriver() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String actualText = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		if(actualText.equals(Validationmsg))
		{
			System.out.println("Correct Validation message");
		}
		else
		{
			System.out.println("Incorrect Validation message");
			
		}
		
		
		driver.findElement(By.id("user-name")).sendKeys(invaliduser);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(invalidpwd);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
	}
}
