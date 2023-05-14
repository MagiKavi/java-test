package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Baseclass.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends baseclass {

	@Before
	
	public void BeforeHooks() {
       System.out.println("Am Before Hooks");
	}
	
	@After
	public void AfterHooks(Scenario scenario) {
		
		byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "screenshot");
		driver.quit();
		
		
	}
	
	
	
}
