package MavenSessions1.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport_1 
{
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Web Automation Result");
		reporter.config().setDocumentTitle("Test cases results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Kunal");
	}
	
	@Test
	public void intialDemo()
	{
		extent.createTest("Intial Demo");
		//ExtentTest test = extent.createTest("Intial Demo");
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		//test.fail("Fail case explicitly");
		extent.flush();
	}
}
