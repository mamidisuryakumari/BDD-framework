package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayHome_Elements;
import steps.Common_Steps;

public class EbayHome_Actions {

	private WebDriver driver;
	EbayHome_Elements ebayHome_Elements;
	
	public EbayHome_Actions(Common_Steps common_Steps) {
		this.driver=common_Steps.getDriver();
		ebayHome_Elements=new EbayHome_Elements(driver);
	}
	public void clickAdvancedLink() {
		ebayHome_Elements.advancedLink.click();
	}
	
	public void searchAnItem(String searchString) {
		ebayHome_Elements.searchBox.sendKeys(searchString);
	}
	
	public void clickSearchButton() {
		ebayHome_Elements.searchButton.click();
	}
	
	public String searchAnItemCount(int count) {
		return ebayHome_Elements.itemCount.getText();
	}
	
	public void clickLink() {
		ebayHome_Elements.linkedinLink.click();
	}
	
	
}
