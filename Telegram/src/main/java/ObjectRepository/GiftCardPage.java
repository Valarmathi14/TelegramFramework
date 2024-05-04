package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage {
	
	public GiftCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText ="Gift Cards")
	private static WebElement giftcardlink;
	
	public WebElement getgiftcardlink() {
		return giftcardlink;
	}
	

}
