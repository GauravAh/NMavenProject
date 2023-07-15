package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/java/FeaturePackage/",
	glue = {"StepDefinitionPackage","Hooks"},
	tags = "@sanity",
	/* dryRun = true, */
	monochrome = true,
	publish = true,
	plugin = {"pretty","html:target/cucumber-report/creport.html"}
)
public class HRMRunner extends AbstractTestNGCucumberTests {

}
