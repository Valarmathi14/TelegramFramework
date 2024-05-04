package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(id="Email")
	private static WebElement Email;
	
	@FindBy(id="Password")
	private static WebElement Password;
	
	@FindBy(className="button-1")
	private WebElement LoginButton;
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public  WebElement getLoginButton() {
		return LoginButton;
		
	
	}

	
	

}
