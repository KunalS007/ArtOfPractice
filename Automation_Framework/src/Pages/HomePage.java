package Pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

	public static By Register_Link = By.linkText("REGISTER");
	public static By SignOn_Link = By.linkText("SIGN-ON");
	public static By SignOff_Link = By.linkText("SIGN-OFF");
	
	public static void Click_Register_Link() {
		 
		Click(Register_Link);
	}
	
public static void Click_SignOn_Link() {
		
	Click(SignOn_Link);
	}
	
}
