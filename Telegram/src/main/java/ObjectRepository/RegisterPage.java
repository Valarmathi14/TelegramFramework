package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "gender-female")
	private static WebElement Gender;
	
	@FindBy(id = "FirstName")
	private static WebElement FN;
	
	@FindBy(id = "LastName")
	private static WebElement LN;
	
	@FindBy(id = "Email")
	private static WebElement Email;
	
	@FindBy(id = "Password")
	private static WebElement Password;
	
	@FindBy(id = "ConfirmPassword")
	private static WebElement CP;
	
	@FindBy(id = "register-button")
	private static WebElement Button;
	
	@FindBy(className  = "button-1")
	private static WebElement button1;
	
	@FindBy(linkText = "Log out")
	private static WebElement logout;
	
	public WebElement getGender() {
		return Gender;
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
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getCP() {
		return CP;
	}
	public WebElement getButton() {
		return Button;
	}
	public WebElement getbutton1() {
		return button1;
	}
	public WebElement getlogout() {
		return logout;
	}
	
	

}
