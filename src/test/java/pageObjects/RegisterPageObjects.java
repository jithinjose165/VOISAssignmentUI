package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testComponents.BaseTest;

public class RegisterPageObjects extends BaseTest {
	WebDriver driver;
	public RegisterPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="submit")
	WebElement submitButton;
	public void registerUser(List<String>userDetails) {
		firstName.sendKeys(userDetails.get(0));
		lastName.sendKeys(userDetails.get(1));
		email.sendKeys(userDetails.get(2));
		password.sendKeys(userDetails.get(3));
		submitButton.click();
	}
	public String verifyRegisterSuccessfull() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	
	
}
