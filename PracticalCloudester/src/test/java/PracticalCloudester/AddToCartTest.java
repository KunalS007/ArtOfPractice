package PracticalCloudester;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PracticalCloudester.resources.BaseCloudester;

public class AddToCartTest extends BaseCloudester
{
	@Test
	public void Cart_Unable_to_find_an_exact_match_for_CDPversion_Cart_Unable_to_find_an_exact_match_for_CDPversion() throws IOException, InterruptedException
	{
		driver = initlizeDriver();
		driver = loginApplication();
		
		Thread.sleep(2000);
		AddToCartObject globalAddtoCart = new AddToCartObject(driver);
		globalAddtoCart.addToCartBtnClick().click();
		
		globalAddtoCart.clickOnViewChart().click();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700);");
		Thread.sleep(2000);
		globalAddtoCart.clickOnCheckOutBtn().click();
		

		
		
	}
}
