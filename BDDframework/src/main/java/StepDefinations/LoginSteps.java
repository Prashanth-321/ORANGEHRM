package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import Pageobjects.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	public WebDriver driver;
	Loginpage lp = new Loginpage(driver);
	
	@Given("user Browse the URL {string}")
	public void user_browse_the_url(String string) {
	    lp.openurl("http://flights.qedgetech.com/");
	}

	@And("User enter the email id {string} and password {string}")
	public void user_enter_the_email_id_and_password(String string1, String string2) {
	    lp.setusernamepassword(string1,string2);
	}
	
	@And("User click on Login")
	public void user_click_on_login() {
	    lp.clicklogin(); 
	}

	@Then("User should see {string}")
	public void user_should_see(String string) {
		
		lp.homepage();
	 
	}

	@When("User clicks on logout")
	public void user_clicks_on_logout() {
	
		
	   
	}


}
