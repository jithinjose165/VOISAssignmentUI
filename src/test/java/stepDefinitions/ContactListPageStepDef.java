package stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AddContactPageObjects;
import pageObjects.ContactListPage;
import pageObjects.LoginPageObjects;
import testComponents.BaseTest;

public class ContactListPageStepDef extends BaseTest {
	List<String> userDetailsList = new ArrayList<String>();
	LoginPageObjects loginPageObjects;
	AddContactPageObjects addPageObjects;
	ContactListPage contactListPage;

	@Given("User is at login page")
	public void user_is_at_login_page() throws IOException {
		launchApplication();
	}

	@Given("User logs in with {string} and {string}")
	public void user_logs_in_with_and(String email, String password) {
		loginPageObjects = new LoginPageObjects(driver);
		loginPageObjects.login(email, password);
	}

	@When("User clicks on Add new contact button and fill the following details")
	public void user_clicks_on_add_new_contact_button_and_fill_the_following_details(DataTable dataTable)
			throws InterruptedException {
		List<List<String>> userDetails = dataTable.asLists(String.class);
		addPageObjects = new AddContactPageObjects(driver);
		contactListPage = new ContactListPage(driver);
		contactListPage.createNewContact();
		for (List<String> userDetail : userDetails) {
			addPageObjects.addUser(userDetail);
			userDetailsList = userDetail;
		}
	}

	@Then("Verify the newly created user")
	public void verify_the_newly_created_user() {
		boolean result = addPageObjects.verifyCreatedContact();
		Assert.assertTrue(result);
	}

}
