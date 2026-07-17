package PracticalCloudester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custommethodinsingleclass 
{

	public WebElement erer(WebElement ele)
	{
		String rr = ele.getText();
		System.out.println(rr);
		
		System.out.println("The text is " +rr);
		return ele;
		
	}
	
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		Custommethodinsingleclass p = new Custommethodinsingleclass();
		WebElement rc= p.erer(driver.findElement(By.xpath("//a[contains(text(),'MacBook')]")));
		
		
	}

}
