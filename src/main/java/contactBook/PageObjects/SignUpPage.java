package contactBook.PageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;
	public SignUpPage(WebDriver driver) {
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
	
//	public void registerUser(HashMap<String,String>userDetails) {
//		firstName.sendKeys(userDetails.get());
//		lastName.sendKeys(userDetails.get());
//		email.sendKeys(userDetails.get());
//		password.sendKeys(userDetails.get());
//	}
}
