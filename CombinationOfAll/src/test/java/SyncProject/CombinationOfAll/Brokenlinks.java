package SyncProject.CombinationOfAll;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks {

	@Test
	public void ad() throws IOException
	{
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links )
		{
			String Url = link.getAttribute("href");
			HttpURLConnection con = (HttpURLConnection)new URL(Url).openConnection();
	        con.setRequestMethod("HEAD");
	        con.connect();
	        int respCode = con.getResponseCode();
	        System.out.println(respCode);
	        a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
		}
	      a.assertAll();         

	}
	
	

}
