package Pages;


import org.openqa.selenium.By;

public class SignOnPage extends BasePage {
	
	//Fields
	
	
	public static By Username_Field = By.name("userName");
	public static By Password_Field = By.name("password");
	public static By Submit_Button = By.name("login");
	
	
	
	//Values
	
	public static String Username_Value = "mercury";
	public static String Password_Value = "mercury";
	
	
	
	
	public static void Enter_login_Details() {
		
		Enter(Username_Field, Username_Value);
		Enter(Password_Field, Password_Value);	
	}

public static void Enter_login_Details_With_Parameters(String username,String password) {
		
		Enter(Username_Field, username);
		Enter(Password_Field, password);	
	}

	
	
	public static void Submit_Login_Details() {
		
		Click(Submit_Button);
	}

	
}
