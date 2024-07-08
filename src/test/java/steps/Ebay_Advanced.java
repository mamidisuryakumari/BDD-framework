package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import actions.Common_Actions;
import actions.EbayAdvanced_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_Advanced {
	Common_Actions common_Actions;
	EbayAdvanced_Actions ebayAdvanced_Actions;

	public Ebay_Advanced(Common_Actions common_Actions, EbayAdvanced_Actions ebayAdvanced_Actions) {
		this.common_Actions = common_Actions;
		this.ebayAdvanced_Actions = ebayAdvanced_Actions;
	}

	@Given("I am on Ebay advanced search page")
	public void i_am_on_ebay_advanced_search_page() {
		common_Actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");

	}

	@When("I click on Ebay logo")
	public void i_click_on_ebay_logo() {
		ebayAdvanced_Actions.clickOnEbayLogo();

	}

	@Then("I am navigated to Ebay homepage")
	public void i_am_navigated_to_ebay_homepage() {
		String expUrl = "https://www.ebay.com/";
		String actUrl =common_Actions.getCurrentPageUrl();
		if (expUrl.equals(actUrl)) {
			System.out.println("I am navigated to ebay home page");

		}

	}

	@Given("I am on advanced search page")
	public void i_am_on_advanced_search_page() {
		common_Actions.goToUrl("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("I search an item")
	public void i_search_an_item(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		ebayAdvanced_Actions.enterSearchString(dataTable.cell(1, 0));
		Thread.sleep(2000);
		ebayAdvanced_Actions.enterExcludeString(dataTable.cell(1, 1));
		ebayAdvanced_Actions.enterMaxPrice(dataTable.cell(1, 2));
		Thread.sleep(2000);
		ebayAdvanced_Actions.enterMinPrice(dataTable.cell(1, 3));
		ebayAdvanced_Actions.clickSearchbutton();
		

	}

}
