package Stepdefintion;

import org.junit.Assert;

import Baseclass.baseclass;
import PageObjectModel.PageObjectModel;
import io.cucumber.java.en.Given;

public class Steps extends baseclass {

	PageObjectModel obj = new PageObjectModel(driver);

	@Given("^user launch the \"([^\"]*)\" browser$")
	public void user_launch_the_browser(String arg1) throws Throwable {

		BrowserLaunch(arg1);
	}

	@Given("^user navigate the url \"([^\"]*)\"$")
	public void user_navigate_the_url(String arg1) throws Throwable {
		geturl(arg1);

	}

	@Given("^user verify the login is opened successfully$")
	public void user_verify_the_login_is_opened_successfully() throws Throwable {
		Assert.assertTrue(elementisDisplayed(obj.getLoginPage().Adactin_Logo));

	}

	@Given("^user enter valid \"([^\"]*)\" username to login$")
	public void user_enter_valid_username_to_login(String arg1) throws Throwable {
		sendkeys(obj.getLoginPage().User_Name, arg1);

	}

	@Given("^user enter valid \"([^\"]*)\" password login$")
	public void user_enter_valid_password_login(String arg1) throws Throwable {

		sendkeys(obj.getLoginPage().Pass_Word, arg1);
	}

	@Given("^the user login using the valid inputs to login$")
	public void the_user_login_using_the_valid_inputs_to_login() throws Throwable {
		clickelement(obj.getLoginPage().Login_button);
	}

	@Given("^User enter username \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_and(String arg1, String arg2) throws Throwable {
		sendkeys(obj.getLoginPage().User_Name, arg1);
		sendkeys(obj.getLoginPage().Pass_Word, arg2);
	}

	@Given("^User Verfiy login error message$")
	public void user_Verfiy_login_error_message() throws Throwable {

		Assert.assertTrue(elementisdisplay(obj.getLoginPage().LoginError));
	}

}
