package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddContactPageObjects {
	WebDriver driver;
	public AddContactPageObjects(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="birthdate")
	WebElement birthdate;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(id="street1")
	WebElement street1;
	@FindBy(id="street2")
	WebElement street2;
	@FindBy(id="city")
	WebElement city;
	@FindBy(id="stateProvince")
	WebElement stateProvince;
	@FindBy(id="postalCode")
	WebElement postalCode;
	@FindBy(id="country")
	WebElement country;
	@FindBy(id="submit")
	WebElement submitButton;
	@FindBy(xpath="//tr[@class='contactTableBodyRow']//td[4]")
	List<WebElement>emailList;
	String userEmail;
	public void addUser(List<String> userDetail) throws InterruptedException {
		Thread.sleep(3000);
		firstName.sendKeys(userDetail.get(0));
		lastName.sendKeys(userDetail.get(1));
		birthdate.sendKeys(userDetail.get(2));
		email.sendKeys(userDetail.get(3));
		userEmail=userDetail.get(3);
		phone.sendKeys(userDetail.get(4));
		street1.sendKeys(userDetail.get(5));
		street2.sendKeys(userDetail.get(6));
		city.sendKeys(userDetail.get(7));
		stateProvince.sendKeys(userDetail.get(8));
		postalCode.sendKeys(userDetail.get(9));
		country.sendKeys(userDetail.get(10));
		submitButton.click();
		
	}
	
	public boolean verifyCreatedContact() {
		if(emailList.contains(userEmail)) {
			
		}
		return true;
	}
	
}
