package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayAdvanced_Elements {
	
	WebDriver driver;
	
	@FindBy(id = "gh-la")public WebElement ebayLogo;
	@FindBy (xpath = "//input[@id='_nkw']") public WebElement searchString;
	@FindBy (id = "_ex_kw")public WebElement excludeString;
	@FindBy (xpath = "//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox']") public WebElement minPrice;
	@FindBy (id  = "s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox") public WebElement maxPrice;
	@FindBy (xpath = "//div[@class='adv-form__actions']//button[@type='submit'][normalize-space()='Search']") public WebElement srcButtonElement;

	public EbayAdvanced_Elements (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
}
