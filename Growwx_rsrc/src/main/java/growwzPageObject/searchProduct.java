package growwzPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Growwx.Growwx_rsrc.BaseGrowx;


public class searchProduct 
{
	public WebDriver driver;
	
	By productSearch = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	
	public searchProduct (WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement selectProduct()
	{
		return driver.findElement(productSearch);	
	}
}
