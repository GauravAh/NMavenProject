package Hooks;

import org.openqa.selenium.WebDriver;

import DriverFactory.BrowserClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	
	public WebDriver driver;

	@Before
	public void init_browser() {
		BrowserClass.setBrowser("chrome");
		driver = BrowserClass.getBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
}
