package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Common_Steps {
	
	 private WebDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	   
	}
	@After
	public void tearDown() throws InterruptedException {
		driver.quit();
		Thread.sleep(1000);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
}
