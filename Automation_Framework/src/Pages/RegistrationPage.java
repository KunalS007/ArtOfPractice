package Pages;


import java.util.Properties;

import org.openqa.selenium.By;

import Configuration.ExcelUtils;

//import Configuration.ExcelUtils;


public class RegistrationPage extends BasePage {
	
	
	public static Properties Registration_Prop = new Properties();
	
	
	//Fields
	
	public static By Firstname_Field = By.name("firstName");
	public static By LastName_Field = By.name("lastName");
	public static By Phone_Field = By.name("phone");
	
	public static By Address1_Field = By.name("address1");
	public static By City_Field = By.name("city");
	public static By Country_Field = By.name("country");
	
	public static By Username_Field = By.name("email");
	public static By Password_Field = By.name("password");
	public static By ConfirmPassword_Field = By.name("confirmPassword");
	
	public static By Submit_Button = By.name("register");
	
	public static By SucessMessage_Field = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b");
	
	
	//Values
	
	public static String Firstname_Value = "Dhaval";
	public static String LastName_Value = "Pandya";
	public static String Phone_Value = "989898777";
	
	public static String Address1_Value = "111, aum flats";
	public static String City_Value = "Vadodara";
	public static String Country_Value = "INDIA";
	
	public static String Username_Value = "Admin";
	public static String Password_Value = "Test";
	public static String ConfirmPassword_Value="Test";
	
	
	
	
	
	
		
	
	public static void Fill_Registration_Form() {
		

		Enter(Firstname_Field,Firstname_Value);
		Enter(LastName_Field, LastName_Value);
		Enter(Phone_Field, Phone_Value);
		Enter(Address1_Field, Address1_Value);
		Enter(City_Field, City_Value);
		
		Select_From_Dropdown(Country_Field, Country_Value);
		
		Enter(Username_Field, Username_Value);
		Enter(Password_Field, Password_Value);
		Enter(ConfirmPassword_Field, ConfirmPassword_Value);				
				
	}
	
public static void Fill_Registration_Form_By_PropertyFile() {
		
		Set_Properties(Registration_Prop, "Registration.properties");
		

		Enter(Firstname_Field,Registration_Prop.getProperty("Firstname"));
		Enter(LastName_Field, Registration_Prop.getProperty("LastName"));
		Enter(Phone_Field, Registration_Prop.getProperty("Phone"));
		Enter(Address1_Field, Registration_Prop.getProperty("Address1"));
		Enter(City_Field, Registration_Prop.getProperty("City"));
		
		Select_From_Dropdown(Country_Field, Registration_Prop.getProperty("Country"));
		
		Enter(Username_Field, Registration_Prop.getProperty("Username"));
		Enter(Password_Field, Registration_Prop.getProperty("Password"));
		Enter(ConfirmPassword_Field, Registration_Prop.getProperty("ConfirmPassword"));				
				
	}
	
public static void Fill_Registration_Form_By_ExcelFile() throws Exception {
	
	ExcelUtils.setExcelFile(Config_Prop.getProperty("TestData_Excel_Path"), "Registration");
	
	
	Enter(Firstname_Field, ExcelUtils.getCellData(1,1));
	Enter(LastName_Field, ExcelUtils.getCellData(2,1));
	Enter(Phone_Field, ExcelUtils.getCellData(3,1));
	Enter(Address1_Field, ExcelUtils.getCellData(4,1));
	Enter(City_Field, ExcelUtils.getCellData(5,1));
	
	Select_From_Dropdown(Country_Field, ExcelUtils.getCellData(6,1));
	
	Enter(Username_Field, ExcelUtils.getCellData(7,1));
	Enter(Password_Field, ExcelUtils.getCellData(8,1));
	Enter(ConfirmPassword_Field, ExcelUtils.getCellData(9,1));				
			
}


	
	
	public static void Submit_Registration_Form() {
		
		Click(Submit_Button);
			
	}
	
public static String Fetch_Success_Message() {
			
		return driver.findElement(SucessMessage_Field).getText();
			
	}
	

}
