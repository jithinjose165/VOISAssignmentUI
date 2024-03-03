package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	WebElement emailTextbox;
	@FindBy(id="password")
	WebElement passwordTextbox;
	@FindBy(id="signup")
	WebElement signUpButton;
	@FindBy(id="submit")
	WebElement submitButton;
	public void signUp() {
		signUpButton.click();
	}
	
	public void login(String email,String password) {
		emailTextbox.sendKeys(email);
		passwordTextbox.sendKeys(password);
		submitButton.click();
		
	}
}
