package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveAddtocardPage {
	
	public RemoveAddtocardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText ="Shopping cart")
	private static WebElement shoppingCard;
	@FindBy(name ="removefromcart")
	private static WebElement checkbox;
	@FindBy(name = "updatecart")
	private static WebElement removefromcard;
	
	public WebElement getshoppingCard() {
		return shoppingCard;
	}
	
	public WebElement getcheckbox() {
		return checkbox;
	}
	
	public WebElement getremovefromCard() {
		return removefromcard;
	}
	 
}