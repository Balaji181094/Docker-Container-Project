package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class OrangeHRMHomePage extends PageObject {
	
	public void enterUname() {
		$(By.name("username")).type("venkatesh.balaji9@gmail.com");
		
		
	}

	public void enterpassword() {
		$(By.name("password")).type("Balaji@18");
		
	}
	
	public void clickLogin() {
		$(By.xpath("//div[text()='Log In']")).click();
		
	}
}


