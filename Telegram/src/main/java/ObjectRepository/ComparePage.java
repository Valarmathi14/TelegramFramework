package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComparePage {
	
	public ComparePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Jewelry")
	private static WebElement jewelry;
	
	@FindBy(linkText = "Black & White Diamond Heart")
	private static WebElement product;
	
	@FindBy(className = "button-2")
	private static WebElement button;
	
	public WebElement getjewelry() {
		return jewelry;
	}
	
	public WebElement getproduct() {
		return product;
	}
	
	public WebElement getbutton() {
		return button;
	}

}
