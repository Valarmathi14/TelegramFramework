package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JewelryPage {
	
	public JewelryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText ="Jewelry")
	private static WebElement jewelrylink;
	
	public WebElement getjewelry() {
		return jewelrylink;
	}

}
