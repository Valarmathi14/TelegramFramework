package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCardPage {
	
	public ShoppingCardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText ="Shopping cart")
	private static WebElement shoppingcardlink;
	
	@FindBy(id="termsofservice")
	private static WebElement checkbox;
	
	@FindBy(id="checkout")
	private static WebElement checkoutbutton;
	
	@FindBy(id="BillingNewAddress_FirstName")
	private static WebElement FN;
	
	@FindBy(id="BillingNewAddress_LastName")
	private static WebElement LN;
	
	@FindBy(name ="BillingNewAddress.Email")
	private static WebElement Email;
	
	@FindBy(id="BillingNewAddress_CountryId")
	private static WebElement dropdown;
	
	@FindBy(id="BillingNewAddress_City")
	private static WebElement citydropdown;
	
	@FindBy(id="BillingNewAddress_Address1")
	private static WebElement address;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private static WebElement zipcode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private static WebElement PN;
	
	@FindBy(className = "button-1")
	private static WebElement button;
	
	
	
	public WebElement getshoppingcardlink() {
		return shoppingcardlink;
	}
	
	public WebElement getcheckbox() {
		return checkbox;
	}
	
	public WebElement getcheckoutbutton() {
		return checkoutbutton;
	}
	public WebElement getFN() {
		return FN;
	}
	
	public WebElement getLN() {
		return LN;
	}
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getdropdown() {
		return dropdown;
	}
	public WebElement getcitydropdown() {
		return citydropdown;
	}
	public WebElement getaddress() {
		return address;
	}
	public WebElement getzipcode() {
		return zipcode;
	}
	public WebElement getPN() {
		return PN;
	}
	
	public WebElement getbutton() {
		return button;
	}
	
	
	

}
