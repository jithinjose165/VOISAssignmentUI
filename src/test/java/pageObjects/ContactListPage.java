package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testComponents.BaseTest;

public class ContactListPage extends BaseTest {
	WebDriver driver;
	
	public ContactListPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	private By addNewContactButton = By.id("add-contact");
	
	
	public void createNewContact() {
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(addNewContactButton));
		driver.findElement(addNewContactButton).click();
	}
	
	
}
