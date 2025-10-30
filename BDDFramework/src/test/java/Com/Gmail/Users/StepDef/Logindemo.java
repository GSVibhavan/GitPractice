package Com.Gmail.Users.StepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
public class Logindemo {
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
		
	}
	//When I entered "admin1" and "pass1"
	@When("I entered {string} and {string}")
	public void i_entered_and(String unm, String pwd) {
		System.out.println(unm + " "+ pwd);
	}
	    
	@And("I clicked signin button")
	public void i_clicked_signin_button() {
	  
	}
	@Then("Its navigated to the home page")
	public void its_navigated_to_the_home_page() {
	  
	}		
}