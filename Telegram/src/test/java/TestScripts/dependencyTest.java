package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependencyTest {
	
	@Test (invocationCount = 0,threadPoolSize =1,enabled=true)//(priority = 0)
	
	public void register() {
		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
		driver.quit();
	}
	
	@Test (dependsOnMethods = "register")//(priority = 1)
	public void login() {
		WebDriver driver = new ChromeDriver();
		System.out.println("login");
		driver.quit();
		
	}
	
	@Test (dependsOnMethods = "login")//(priority = 2)
	
	public void AddToCard() {
		WebDriver driver = new ChromeDriver();
		System.out.println("AddToCard");
		driver.quit();
	}
	
	public void Payment() {
		WebDriver driver = new ChromeDriver();
		System.out.println("payment");
		driver.quit();
		
	}
	
	public void wishlist() {
		WebDriver driver = new ChromeDriver();
		System.out.println("wishlist");
		driver.quit();
		
		
	}
	
	public void confirmorder() {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("confirmorder");
		driver.quit();
		
	}
	

}
