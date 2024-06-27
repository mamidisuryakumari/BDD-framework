package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	WebDriver driver;
	
	public EbayHome_Steps(Common_Steps common_Steps) {
		this.driver =common_Steps.getDriver();
	}
	
	@Given("I am on Ebay home page")
	public void i_am_on_ebay_home_page() {
	    driver.get("https://www.ebay.com/");
	}

	@When("I click on advanced link")
	public void i_click_on_advanced_link() {
	     driver.findElement(By.xpath("//a[@title='Advanced Search']")).click();
	}

	@Then("I navigte to search page")
	public void i_navigte_to_search_page() {
	   String expUrl ="https://www.ebay.com/sch/ebayadvsearch";
	   String actUrl =driver.getCurrentUrl();
	   if(!expUrl.equals(actUrl)) {
		  System.out.println("page is not navigated to expected page");	  
		  }
	
	}



}
