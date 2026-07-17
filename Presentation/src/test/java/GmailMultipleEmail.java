import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GmailMultipleEmail 
{
	@Test
	public void Gmail() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/mail/u/3/#inbox");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kunal.shah296@gmail.com");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[contains(text(),'Next')]")).click();
		
	}
}
