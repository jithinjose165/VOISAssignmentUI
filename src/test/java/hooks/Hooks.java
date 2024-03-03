package hooks;

import java.time.Duration;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import testComponents.BaseTest;

public class Hooks extends BaseTest{
	
	@BeforeAll
	public static void waitSetup() {
		System.out.println("Test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	@AfterAll
	public  static void afterAll() throws InterruptedException {
		
	   driver.quit();
	}
}
