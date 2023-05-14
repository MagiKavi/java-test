package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.baseclass;

public class LoginPage extends baseclass {

	public LoginPage(WebDriver driver) {
	      this.driver=driver;
	      PageFactory.initElements(driver, this);
	      }

	      @FindBy(css = "img[src='img/AdactIn_logo.png']")
	      public WebElement Adactin_Logo;
	      
	      @FindBy(id = "username")
	      public WebElement User_Name;
	      
	      @FindBy(id = "password")
	      public WebElement Pass_Word;
	      
	      @FindBy(id ="login")
	      public WebElement Login_button;
	      
	      @FindBy(xpath ="//div[@class='auth_error']")
	      public WebElement LoginError;
	      
	}
	 

