package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Advanced {
	WebDriver driver;
	
	public Ebay_Advanced (Common_Steps common_Steps) {
		this.driver =common_Steps.getDriver();
	}

	@Given("I am on Ebay advanced search page")
	public void i_am_on_ebay_advanced_search_page() {
		driver.get("https://www.ebay.com/sch/ebayadvsearch");
	    
	}
	@When("I click on Ebay logo")
	public void i_click_on_ebay_logo() {
		driver.findElement(By.id("gh-la")).click();
	   
	}
	@Then("I am navigated to Ebay homepage")
	public void i_am_navigated_to_ebay_homepage() {
	   String expUrl = "https://www.ebay.com/";
	   String actUrl = driver.getCurrentUrl();
	   if(expUrl.equals(actUrl)) {
		   System.out.println("I am navigated to ebay home page");
		   
	   }
	   
	}
	




}
