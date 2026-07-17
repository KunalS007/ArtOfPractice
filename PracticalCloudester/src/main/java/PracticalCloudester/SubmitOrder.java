package PracticalCloudester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitOrder 
{
	public WebDriver driver;
	
	By enterText = By.name("search");
	By clickOnSearch = By.xpath("//i[@class='fa fa-search']");
	
	By clickOnAddToCart = By.xpath("//*[text()='Add to Cart']");
	
	public SubmitOrder(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement enterProduct()
	{
		return driver.findElement(enterText);
	}
	
	public WebElement clickOnSearch()
	{
		return driver.findElement(clickOnSearch);
	}
	
	public WebElement clickAddCart()
	{
		return driver.findElement(clickOnAddToCart);
		
	}
}
