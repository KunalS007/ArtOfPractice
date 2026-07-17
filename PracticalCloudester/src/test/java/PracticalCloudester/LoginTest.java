package PracticalCloudester;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PracticalCloudester.resources.BaseCloudester;


public class LoginTest extends BaseCloudester
{
	
	@Test(dataProvider="getData")
	public void loginInApp(String ProductName) throws IOException, InterruptedException
	{
		//String ProductName = "Macbook";
		
		//Open the browser
		driver = initlizeDriver();
	
		//Login webpage
		driver = loginApplication();
		
		SubmitOrder golbalCloudester = new SubmitOrder(driver);
		
		//enter product
		golbalCloudester.enterProduct().sendKeys(ProductName);
		
		//click on search
		Thread.sleep(2000);
		golbalCloudester.clickOnSearch().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][] {{"Macbook"}};
	}
	
	@Test
	public void selectProduct() throws InterruptedException
	{
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		
		String[] name12= {"MacBook Air" ,"MacBook Pro"};
	    int j=0;
	    
	    List<WebElement> Product_Name = driver.findElements(By.xpath("//a[contains(text(),'MacBook')]"));
	    for(int i=0; i<Product_Name.size();i++)
	    {
	    	String Fetch_Product = Product_Name.get(i).getText().trim();
			List<String> list_Array = Arrays.asList(name12);
			
			if(list_Array.contains(Fetch_Product))
			{
				j++;
				driver.findElements(By.xpath("//*[text()='Add to Cart']")).get(i).click();
				if(j==3)
				{
					break;
				}
			}
	    }
	 }
}
