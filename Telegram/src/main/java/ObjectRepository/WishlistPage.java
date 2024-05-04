package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Jewelry")
	private static WebElement jewelry;
	
	@FindBy(linkText = "Black & White Diamond Heart")
	private static WebElement product;
	
	@FindBy(id="add-to-wishlist-button-14")
	private static WebElement wishlist;
	
	public WebElement getjewelry() {
		return jewelry;
	}
	
	public WebElement getproduct() {
		return product;
	}
	
	public WebElement getwishlist() {
		return wishlist;
	}
	
	
	
		

}
