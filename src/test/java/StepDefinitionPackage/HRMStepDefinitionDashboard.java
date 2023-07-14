package StepDefinitionPackage;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import DriverFactory.BrowserClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class HRMStepDefinitionDashboard {
	public WebDriver driver;

	@Then("User should redirect to PIM module page")
	public void user_should_redirect_to_pim_module_page() throws Exception {
		Thread.sleep(20000);
		driver = BrowserClass.getBrowser();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
		Thread.sleep(5000);
	}
	
	@Then("Enter Employee details")
	public void enter_employee_details(DataTable dataTable) {
		List<Map<String, String>> hmaps = dataTable.asMaps(String.class, String.class);
		for(Map<String, String> mmaps : hmaps) {
			driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']/div/input")).sendKeys(mmaps.get("EmpName"));
			driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/label[contains(text(),'Username')]/following::input[@autocomplete='off'][1]")).sendKeys(mmaps.get("UserName"));
			driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/label[contains(text(),'Username')]/following::input[@type='password'][1]")).sendKeys(mmaps.get("Password"));
			driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']/div/label[contains(text(),'Username')]/following::input[@type='password'][2]")).sendKeys(mmaps.get("Confirm_Password"));
		}
	}
	@Then("User select userrole from dropdown")
	public void user_select_userrole_from_dropdown() {
	    
	}

}
