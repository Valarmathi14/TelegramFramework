package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingaddressPage {
	
	public ShippingaddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="PickUpInStore")
	private static WebElement checking;
	
	@FindBy(className = "button-1")
	private static WebElement continuebutton;
	
	@FindBy(xpath = "//h2[.='Shipping address']")
	private static WebElement shippingadd;
	
	
	public WebElement getchecking() {
		return checking;
	}
	
	public WebElement getcontinuebutton() {
		return continuebutton;
	}
	
	public WebElement getshippingadd() {
		return shippingadd;
	}

	

	

	

}
