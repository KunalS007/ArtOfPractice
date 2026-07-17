package PracticalCloudester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartObject 
{
public WebDriver driver;
	
	By clickOnAddToCartBtn = By.xpath("(//i[@class='fa fa-shopping-cartr'])[2]");
	By clickOnViewCart = By.xpath("//*[text()=' View Cart']");
	
	By clickOnCheckOut = By.xpath("(//*[text()='Checkout'])[2]");
	
	
	public AddToCartObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement addToCartBtnClick()
	{
		return driver.findElement(clickOnAddToCartBtn);
	}

	public WebElement clickOnViewChart()
	{
		return driver.findElement(clickOnViewCart);
	}
	
	public WebElement clickOnCheckOutBtn()
	{
		return driver.findElement(clickOnCheckOut);
	}
}
