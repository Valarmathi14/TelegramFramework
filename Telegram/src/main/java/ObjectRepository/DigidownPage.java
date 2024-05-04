package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigidownPage {

	public DigidownPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText ="Digital downloads")
	private static WebElement digidownlink;
	
	public WebElement getdigidownlink() {
		return digidownlink;
		
	}
	
	
}
