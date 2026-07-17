package SyncProject.CombinationOfAll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Combination_Practice 
{
	@Test
	public void Auto_Suggestion() throws InterruptedException
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\Kunal S\\Downloads\\chromedriver_win32");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='No thanks']")).click();

	//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("tes");
//		driver.findElement(By.xpath(""));
//		
//		List<WebElement> str = driver.findElements(By.xpath("//body/div[2]/div[1]/div[3]/main[1]/form[1]/div[4]/div[1]"));
//		for(WebElement option: str)
//		{
//			if(option.getText().equalsIgnoreCase("testbook"))
//			{
//				//Thread.sleep(2000);
//				option.click();
//				break;
//			}
//		}
	}
}
