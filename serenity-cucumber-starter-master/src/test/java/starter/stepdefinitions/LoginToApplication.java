package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class LoginToApplication {
    @Steps
	HomePage home;
	
	@Given("Users on home page")
	public void users_on_home_page() {
	    home.openApplication();
	    home.getDriver().manage().window().maximize();
	    
	}

	@When("user enter admin as username")
	public void user_enter_admin_as_username() throws InterruptedException {
	    home.enterUserName();
	    Thread.sleep(5000);
	}

	@When("user enter admin123 as password")
	public void user_enter_admin123_as_password() throws InterruptedException {
	    home.enterPassword();
	    Thread.sleep(5000);
	    
	}

	@Then("user sholud be able to login")
	public void user_sholud_be_able_to_login() {
	 home.clickonLoginButton();   
	}
}
