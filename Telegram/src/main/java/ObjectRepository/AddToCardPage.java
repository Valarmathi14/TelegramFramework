package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCardPage {
	
	public AddToCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Jewelry")
	private static WebElement jewelry;
	
	@FindBy(linkText = "Black & White Diamond Heart")
	private static WebElement product;
	
	@FindBy(id = "add-to-cart-button-14")
	private static WebElement AddToCardButton;
	
	public WebElement getjewelry() {
		return jewelry;
		
	}
	
	public WebElement getproduct() {
		return product;
	}
	
	public WebElement getAddToCardButton() {
		return AddToCardButton;
	}
	

}
