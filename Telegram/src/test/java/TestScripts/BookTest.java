package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;

public class BookTest {
	@Test(groups="smoke")
	public void book_001() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		BooksPage books = new BooksPage(driver);
		
		welcome.getBooksLink().click();
		
		//verify books page is displayed
		if(books.getHeading().getText().equals("books")) {
			System.out.println("Test Case Pass");
		}
		else
			System.out.println("Test case Fail");
		
		driver.quit();
		
		
		
		
		
	}
}