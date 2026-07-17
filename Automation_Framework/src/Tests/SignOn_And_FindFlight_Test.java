package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import com.aventstack.extentreports.Status;

import Pages.*;

public class SignOn_And_FindFlight_Test extends BaseTest {

	@Test(priority = 0)
	
	public static void SignOn() {
		
		Start_Extent_Test("SignOn");
		BaseTest.Extent_Test.assignCategory("SignOn and FindFlight");
		
		HomePage.Click_SignOn_Link();
		BaseTest.Extent_Test.log(Status.INFO, "Clicked on SignOn Link");
		
		SignOnPage.Enter_login_Details();
		BaseTest.Extent_Test.log(Status.INFO, "Entered Login Details");
		
		
		SignOnPage.Submit_Login_Details();
		BaseTest.Extent_Test.log(Status.INFO, "Clicked Submit Button");
		
		
		Wait_For_Element_to_Visible(HomePage.SignOff_Link);
	
		
		assertTrue(driver.getTitle().equals("Find a Flight: Mercury Tours:"));
		assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		
		BaseTest.Extent_Test.log(Status.INFO, "Validated Successful Login");
	}
	

	@Test(priority = 1)
	@Parameters({ "Username", "Password" })
	public static void SignOn_With_Parameters(String username, String password) {
		
		Start_Extent_Test("SignOn_With_Parameters");
		BaseTest.Extent_Test.assignCategory("SignOn and FindFlight");
		
		HomePage.Click_SignOn_Link();
		BaseTest.Extent_Test.log(Status.INFO, "Click on SignOn Link");
		
		SignOnPage.Enter_login_Details_With_Parameters(username, password);
		BaseTest.Extent_Test.log(Status.INFO, "Enter Login Details");
		
		SignOnPage.Submit_Login_Details();
		BaseTest.Extent_Test.log(Status.INFO, "Clicked Submit Button");
		
		Wait_For_Element_to_Visible(HomePage.SignOff_Link);
	
		
		assertTrue(driver.getTitle().equals("Find a Flight: Mercury Tours:"));
		assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
		
		BaseTest.Extent_Test.log(Status.INFO, "Validated Successful Login");
	}
	
	@Test(priority = 2)
	public static void SignOn_And_FindFlight() throws InterruptedException {
		
		Start_Extent_Test("SignOn_And_FindFlight");
		BaseTest.Extent_Test.assignCategory("SignOn and FindFlight");
		
		HomePage.Click_SignOn_Link();
		BaseTest.Extent_Test.log(Status.INFO, "Clicked on SignOn Link");
		
		SignOnPage.Enter_login_Details();
		BaseTest.Extent_Test.log(Status.INFO, "Entered Login Details");
		
		
		SignOnPage.Submit_Login_Details();
	    BaseTest.Extent_Test.log(Status.INFO, "Clicked Submit Button");
		
		
		FlightPage.Enter_FlightDetails_And_Find();
		BaseTest.Extent_Test.log(Status.INFO, "Fight Detailes Entered and Click button to Find it");
		
		Thread.sleep(6000);
		
		assertTrue(driver.getTitle().equals("Select a Flight: Mercury Tours"));
		BaseTest.Extent_Test.log(Status.INFO, "Validatd Flight is Searched");
		
	}
	
	
	
	
	
}
