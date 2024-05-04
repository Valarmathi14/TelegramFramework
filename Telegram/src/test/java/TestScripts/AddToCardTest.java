package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.AddToCardPage;
import ObjectRepository.LoginPage;
import ObjectRepository.WelcomePage;

public class AddToCardTest {
	
	@Test(groups="smoke")
	public void AddToCard() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		AddToCardPage addtocard = new AddToCardPage(driver);
		
		addtocard.getjewelry().click();
		addtocard.getproduct().click();
		addtocard.getAddToCardButton().click();
		System.out.println("smoke");
		driver.quit();
		
		
	}
	

}
