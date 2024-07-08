package actions;

import org.openqa.selenium.WebDriver;

import elements.EbayAdvanced_Elements;
import steps.Common_Steps;

public class EbayAdvanced_Actions {
	
	private WebDriver driver;
	EbayAdvanced_Elements ebayAdvanced_Elements;
	
	public EbayAdvanced_Actions(Common_Steps common_Steps) {
		this.driver=common_Steps.getDriver();
		ebayAdvanced_Elements = new EbayAdvanced_Elements(driver);
	}

	public void clickOnEbayLogo() {
		ebayAdvanced_Elements.ebayLogo.click();
	}
	public void enterSearchString(String string) {
		ebayAdvanced_Elements.searchString.sendKeys(string);
	}
	
	public void enterExcludeString(String string) {
		ebayAdvanced_Elements.excludeString.sendKeys(string);
	}
	public void enterMinPrice(String string) {
		ebayAdvanced_Elements.minPrice.sendKeys(string);
	}
	
	public void enterMaxPrice(String string) {
		ebayAdvanced_Elements.maxPrice.sendKeys(string);
	}
	
	public void clickSearchbutton() {
		ebayAdvanced_Elements.srcButtonElement.click();;
	}
}
