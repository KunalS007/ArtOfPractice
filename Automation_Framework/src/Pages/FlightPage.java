package Pages;

import org.openqa.selenium.By;

public class FlightPage extends BasePage{

	//Fields
	
	
		public static By OneWay_RadioButton = By.cssSelector("input[value=oneway]");
		public static By DepartingFrom_Field = By.name("fromPort");
		public static By ArrivingIn_Field = By.name("toPort");
		public static By Continue_Button = By.name("findFlights");
		
		
		
		//Values
		
			public static String DepartingFrom_Value = "London";
			public static String ArrivingIn_Value = "Paris";
			
			
			public static void Enter_FlightDetails_And_Find() {
				
				Click(OneWay_RadioButton);
				Select_From_Dropdown(DepartingFrom_Field, DepartingFrom_Value);
				Select_From_Dropdown(ArrivingIn_Field, ArrivingIn_Value);
				Click(Continue_Button);
			}
	
}
