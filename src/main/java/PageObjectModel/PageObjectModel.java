package PageObjectModel;

import org.openqa.selenium.WebDriver;

import Baseclass.baseclass;
import Locators.LoginPage;

public class PageObjectModel extends baseclass {

	public PageObjectModel(WebDriver driver) {                 ///constructr
		this.driver = driver;
	
	}
	
	private LoginPage LoginPage;
	public LoginPage getLoginPage() {
		if (LoginPage==null) {
			LoginPage = new LoginPage (driver);
		}
		return LoginPage;
	}
}


