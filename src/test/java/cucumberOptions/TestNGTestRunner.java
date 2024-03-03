package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//src/test/java/features/UserRegistration.feature
@CucumberOptions(features={"src/test/java/features"},
monochrome=true,glue="stepDefinitions",tags="@registration")
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
