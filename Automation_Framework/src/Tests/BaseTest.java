package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;

import org.testng.ITestResult;

import Configuration.Setup;

public class BaseTest extends Setup {
	
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports Extent_Report;
	public static ExtentTest Extent_Test;
	
	
	
	

	@BeforeMethod
	

	public static void Launch_Application() {
		
		Setup.intiate_webdriver();
		driver.navigate().to(Config_Prop.getProperty("baseURL"));
		
	}
	
	
	
	@AfterMethod
	
	
	public static void Tear_Down(ITestResult result) throws IOException {
		
		String methodName=result.getName().toString().trim();
		
		if(ITestResult.SUCCESS==result.getStatus())
		{
		
			Extent_Test.log(Status.PASS, "Test : '"+ methodName+"' Passed");
			
		}else if (ITestResult.FAILURE==result.getStatus())
		{
			try 
			{	
				
				Setup.takeScreenShot(methodName);		
			    
			} 
			catch (Exception e)	{
			 
			System.out.println("Exception while taking screenshot "+e.getMessage());
			} 
			
			Extent_Test.log(Status.FAIL, "Test : '"+ methodName+"' Failed");
			Extent_Test.addScreenCaptureFromPath(Setup.Screenshot_Path);
			
		}
			
		
		driver.quit();
	
		}
	
@BeforeSuite
	
	public static void OneTime_SetUp() {
		
		System.out.println("Enter in one time setup");
		
		// initialize the HtmlReporter
		htmlReporter = new ExtentHtmlReporter("E:\\JAVA_Automation\\Framework_Workplace\\Automation_Framework\\Extent_Report\\TestExecutionReport.html");
		
		//htmlReporter.config().setTheme(Theme.DARK);
		// attach HtmlReporter
		Extent_Report =  new ExtentReports();
		Extent_Report.attachReporter(htmlReporter);
		
	}
	
	
@AfterSuite
	
	public static void OneTime_TearDown() {
		
	Extent_Report.flush();

		
	}
	
	public static void Start_Extent_Test(String Test_Name) {
		
	Extent_Test = Extent_Report.createTest(Test_Name);
		
	}
	
	
	
	
	
	
}
	

