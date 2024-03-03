package stepDefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import pageObjects.RegisterPageObjects;
import testComponents.BaseTest;

public class RegisterPageStepDef extends BaseTest {

	RegisterPageObjects registerPageObjects;
	LoginPageObjects loginPageObjects;
	

@Given("User launch the application")
public void user_launch_the_application() throws IOException {
	launchApplication();
	registerPageObjects = new RegisterPageObjects(driver);
}
@Given("Click on Signup")
public void click_on_signup() {
	loginPageObjects = new LoginPageObjects(driver);
	loginPageObjects.signUp();
}
@When("I register as new user with following details")
public void i_register_as_new_user_with_following_details(DataTable dataTable) {
   List<List<String>>userDetails = dataTable.asLists(String.class);
   for(List<String>userDetail : userDetails) {
	   registerPageObjects.registerUser(userDetail);
   }
}
@Then("I should be able to register")
public void i_should_be_able_to_register() throws InterruptedException {
	String url = registerPageObjects.verifyRegisterSuccessfull();
	Assert.assertEquals(url, "https://thinking-tester-contact-list.herokuapp.com/contactList");
}
}
