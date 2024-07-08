package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHome_Elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Advanced Search']") public WebElement advancedLink;
	@FindBy(id = "gh-ac")public WebElement searchBox;
	@FindBy(id = "gh-btn")public WebElement searchButton;
	@FindBy(xpath = "//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']")public WebElement linkedinLink;
	@FindBy(css = "div[class='srp-controls__control srp-controls__count'] span:nth-child(1)")public WebElement itemCount;

	
	public EbayHome_Elements(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	
}
