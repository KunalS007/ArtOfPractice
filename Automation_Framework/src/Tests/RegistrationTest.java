package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Pages.*;



public class RegistrationTest extends BaseTest {
	
	@Test(priority = 0)
	public static void Register_User() throws InterruptedException {
		
		Start_Extent_Test("Register_User");
		BaseTest.Extent_Test.assignCategory("Registration");
		
		HomePage.Click_Register_Link();
		BaseTest.Extent_Test.log(Status.INFO, "Navigate to Home Page");
		
		RegistrationPage.Fill_Registration_Form();		
		BaseTest.Extent_Test.log(Status.INFO, "Registration Form Filled");
		
		RegistrationPage.Submit_Registration_Form();
		BaseTest.Extent_Test.log(Status.INFO, "Submitted Registration Form");
			
		Thread.sleep(15000);
		assertTrue(driver.getPageSource().contains("Thank you for registering."), "Registration Failed");
		assertEquals(RegistrationPage.Fetch_Success_Message(), "Note: Your user name is Admin.");
		
		BaseTest.Extent_Test.log(Status.INFO, "Validated Successful Registration");
		
				
	}
	
	@Test(priority = 1)
	public static void Register_User_TestData_From_PropertyFile() throws InterruptedException {
		
		Start_Extent_Test("Register_User_TestData_From_PropertyFile");
		BaseTest.Extent_Test.assignCategory("Registration");
		
		HomePage.Click_Register_Link();
		BaseTest.Extent_Test.log(Status.INFO, "Navigate to Home Page");
		
		RegistrationPage.Fill_Registration_Form_By_PropertyFile();
		BaseTest.Extent_Test.log(Status.INFO, "Registration Form Filled from PrpertyFile");
		
		
		RegistrationPage.Submit_Registration_Form();
		BaseTest.Extent_Test.log(Status.INFO, "Submitted Registration Form");
		
		Thread.sleep(15000);
		assertTrue(driver.getPageSource().contains("Thank you for registering."), "Registration Failed");
		assertEquals(RegistrationPage.Fetch_Success_Message(), "Note: Your user name is dkp.");
		
		BaseTest.Extent_Test.log(Status.INFO, "Validated Successful Registration");
				
	}
	
	@Test(priority = 2)
	public static void Register_User_TestData_From_ExcelFile() throws Exception {
		
		Start_Extent_Test("Register_User_TestData_From_ExcelFile");
		BaseTest.Extent_Test.assignCategory("Registration");
		
		HomePage.Click_Register_Link();
		BaseTest.Extent_Test.log(Status.INFO, "Navigate to Home Page");
		
		RegistrationPage.Fill_Registration_Form_By_ExcelFile();
		BaseTest.Extent_Test.log(Status.INFO, "Registration Form Filled From ExcelFile");
		
		RegistrationPage.Submit_Registration_Form();
		BaseTest.Extent_Test.log(Status.INFO, "Submitted Registration Form");
		
		Thread.sleep(15000);
		assertTrue(driver.getPageSource().contains("Thank you for registering."), "Registration Failed");
		assertEquals(RegistrationPage.Fetch_Success_Message(), "Note: Your user name is James0071.");
		
		BaseTest.Extent_Test.log(Status.INFO, "Validated Successful Registration");
				
	}
	
}
	


