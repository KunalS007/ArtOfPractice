package Pages;

import Configuration.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends Setup {

	public static void Enter(By Field_Name, String Field_Value) {
		
		driver.findElement(Field_Name).sendKeys(Field_Value);
	}
	
public static void Click(By Field_Name) {
		
		driver.findElement(Field_Name).click();
	}
	
	
	public static void Select_From_Dropdown(By Field_Name, String VisibleText) {
		
		WebElement dropdown_field = driver.findElement(Field_Name);
		Select dropdown = new Select (dropdown_field);
		
		dropdown.selectByVisibleText(VisibleText);
	}
	
}






