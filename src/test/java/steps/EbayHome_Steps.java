package steps;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	Common_Actions common_Actions;
	EbayHome_Actions ebayHome_Actions;

	public EbayHome_Steps(Common_Actions common_Actions, EbayHome_Actions ebayHome_Actions) {
		this.common_Actions = common_Actions;
		this.ebayHome_Actions = ebayHome_Actions;
	}

	@Given("I am on Ebay home page")
	public void i_am_on_ebay_home_page() {
		common_Actions.goToUrl("https://www.ebay.com/");
	}

	@When("I click on advanced link")
	public void i_click_on_advanced_link() {
		ebayHome_Actions.clickAdvancedLink();
	}

	@Then("I navigte to search page")
	public void i_navigte_to_search_page() {
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = common_Actions.getCurrentPageUrl();
		if (!expUrl.equals(actUrl)) {
			System.out.println("page is not navigated to expected page");
		}

	}

	@Given("I am on ebay homepege")
	public void i_am_on_ebay_homepege() {
		common_Actions.goToUrl("https://www.ebay.com/");
	}

	@When("I search for {string}")
	public void i_search_for(String item) {
		ebayHome_Actions.searchAnItem(item);
		ebayHome_Actions.clickSearchButton();
	}

	@Then("I validate {int} search item present")
	public void i_validate_search_item_present(int count) {
	//	String itemcount = driver
			//	.findElement(By.cssSelector("div[class='srp-controls__control srp-controls__count'] span:nth-child(1)"))
			//	.getText();
		String itemcount =ebayHome_Actions.searchAnItemCount(count);
		
		int itemcount1 = Integer.parseInt(itemcount);
		if (itemcount1 < count) {
			System.out.println("results shown");
		}
	}

	@Given("I am on  homepege")
	public void i_am_on_homepege() throws InterruptedException {
		common_Actions.goToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

	@When("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
		ebayHome_Actions.clickLink();
		Thread.sleep(5000);

	}

	@Then("I validate that page navigates to {string} and title contains {string}")
	public void i_validate_that_page_navigates_to_and_title_contains(String string, String string2) {

	}

}
