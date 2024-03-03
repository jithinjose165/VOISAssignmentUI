package testComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static  WebDriver driver;
	FileInputStream fis;
	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\GlobalData.properties");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
		
	}
	
	@BeforeMethod()
	public void launchApplication() throws IOException {
		driver = initializeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.manage().window().maximize();
		
	}
	
	public WebDriverWait explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		 return wait;
	}

}
