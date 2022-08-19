package pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePage extends PageObject{
	
	private static Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
	
	OrangeHRMHomePage homepage;
	@Step
	public void openApplication() {
		
		homepage.open();
		
	}
    @Step
    public void enterUserName() {
    	homepage.enterUname();
		LOGGER.info("User Enter Unser name");
	}
    @Step
    public void enterPassword() {
    	homepage.enterpassword();
    	LOGGER.info("User Enter Password");
	}
    @Step
    public void clickonLoginButton() {
	homepage.clickLogin();
	LOGGER.info("User Clicked on Login Button");
}

}
