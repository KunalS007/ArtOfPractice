package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class stepDefination {

	@Given("^User is landing page$")
	public void user_is_landing_page() throws Throwable {
		System.out.println("This is landing page");
	}

	 @When("^user enters the username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_enters_the_username_something_and_password_something(String strArg1, String strArg2) throws Throwable 
	 {
		 System.out.println(strArg1);
		 System.out.println(strArg2);
		 
	 }

	@Then("^user navigate to dashboard$")
	public void user_navigate_to_dashboard() throws Throwable {
		System.out.println("Dashboard navigate");
	}

	@And("^cards are displayed \"([^\"]*)\"$")
    public void cards_are_displayed_something(String strArg1) throws Throwable 
	{
		System.out.println(strArg1);
    }

}

