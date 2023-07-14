package StepDefinitionPackage;

import javax.swing.JScrollBar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import DriverFactory.BrowserClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmStepDefinition {
	
	public WebDriver driver;
	BrowserClass bro;
	String title;

	@Given("We are on home page")
	public void we_are_on_home_page() {
		driver = BrowserClass.getBrowser();
	    String cUrl = driver.getCurrentUrl();
	    System.out.println("Current Url is.." + cUrl);
	    Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login",cUrl);
	}
	
	@When("I get the title of page")
	public void i_get_the_title_of_page() {
		title = driver.getTitle();
		System.out.println("Title is.." + title);
	}
	@And("Verify the expected with actual")
	public void verify_the_expected_with_actual() {
	   Assert.assertEquals(title,"OrangeHRM");
	}
	@Then("Result should be true")
	public void result_should_be_true() {
	    Assert.assertTrue(true);
	}

	@When("Enter username as {string}")
	public void enter_username_as(String uname) throws Exception {
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@placeholder='Username']")).sendKeys(uname);
	}
	@When("enter password as {string}")
	public void enter_password_as(String pass) {
	    WebElement passwordField = driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@placeholder='Password']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value='"+pass+"';", passwordField);
	}

	@When("Click on button")
	public void click_on_button() {
	   WebElement loginButton = driver.findElement(By.xpath("//*[@class='oxd-form-actions orangehrm-login-action']/button[@type='submit']"));
	   Actions actions = new Actions(driver);
	   actions.moveToElement(loginButton).click().build().perform();
	}
	
	@Then("Validation should appear")
	public void validation_should_appear() {
	 System.out.println("Validation Appearss");   
	}

	@When("Enter valid username as {string}")
	public void enter_valid_username_as(String uname) throws Exception {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@placeholder='Username']")).sendKeys(uname);
		System.out.println("Uname is.." + uname);
	}
	@When("Enter  valid password as {string}")
	public void enter_valid_password_as(String pass) {
		WebElement passwordField = driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[@placeholder='Password']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value='"+pass+"';", passwordField);
	    System.out.println("Password is.." + pass);
	}
	@Then("Validation should not appear")
	public void validation_should_not_appear() {
	   System.out.println("Validation should not appear");
	}





	
}
