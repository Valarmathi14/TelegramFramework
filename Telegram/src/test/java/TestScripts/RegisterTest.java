package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;


public class RegisterTest {
	
	@Test
	public  void register() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		RegisterPage register = new RegisterPage(driver);
		
		welcome.getRegisterLink().click();
		register.getGender().click();
		register.getFN().sendKeys("sakthy");
		register.getLN().sendKeys("mathi");
		register.getEmail().sendKeys("sakthy13@gmail.com");
		register.getPassword().sendKeys("kutty#01");
		register.getCP().sendKeys("kutty#01");
		register.getButton().click();
		register.getlogout().click();
		
		}

	
	

}
