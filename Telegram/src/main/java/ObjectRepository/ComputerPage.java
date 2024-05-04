package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	public ComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Computers")
	private static WebElement computerslink;
	
	@FindBy(linkText  = "Notebooks")
	private static WebElement notebookslink;
	
	public WebElement getcomputerslink() {
		return computerslink;
	}
	
	public WebElement getnotebookslink() {
		return notebookslink;
	}
	
	
	

}
