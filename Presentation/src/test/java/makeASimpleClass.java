import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class makeASimpleClass 
{
	public WebElement selectSingle(WebElement selectElement, int index)
	{
		Select sel = new Select(selectElement);
		sel.selectByIndex(index);
		return selectElement;
	}
	
	public WebElement selectCheckBox(WebElement selectElement)
	{
		
		return selectElement;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.gecko.driver","E:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();
		makeASimpleClass op = new makeASimpleClass();
		
	}

}
