package TestScripts;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepository.AddToCardPage;
import ObjectRepository.ApparelPage;
import ObjectRepository.BooksPage;
import ObjectRepository.ComparePage;
import ObjectRepository.ComputerPage;
import ObjectRepository.DigidownPage;
import ObjectRepository.GiftCardPage;
import ObjectRepository.JewelryPage;
import ObjectRepository.LoginPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.RemoveAddtocardPage;
import ObjectRepository.ShippingaddressPage;
import ObjectRepository.ShoppingCardPage;
import ObjectRepository.WelcomePage;
import ObjectRepository.WishlistPage;





public class LoginTest {
	
	@Test
	public void register() {
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
	
	@Test 
	public void login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		welcome.getLoginLink().click();
		login.getEmail().sendKeys("sakthy13@gmail.com");
		login.getPassword().sendKeys("kutty#01");
		login.getLoginButton().click();
		driver.switchTo().alert().accept();
		driver.quit();	
		}
	@Test
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
		driver.quit();
		
		}
	@Test
	
	public void Wishlist() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		WishlistPage wishlist = new WishlistPage(driver);
		
		wishlist.getjewelry().click();
		wishlist.getproduct().click();
		wishlist.getwishlist().click();
		driver.quit();
		
	}
	@Test
	public void compare() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		ComparePage compare = new ComparePage(driver);
		
		compare.getjewelry().click();
		compare.getproduct().click();
		compare.getbutton().click();
		driver.quit();
		
	}
	
	@Test
	public void Raddtocard() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		RemoveAddtocardPage remove = new RemoveAddtocardPage(driver);
		
		remove.getshoppingCard().click();
		remove.getcheckbox().click();
		remove.getremovefromCard().click();
		driver.quit();
		
		
	}
	
	@Test
	public void BooksLink() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		BooksPage books = new BooksPage(driver);
		
		books.getHeading().click();
		
		if(books.getHeading().getText().equals("books")) {
			System.out.println("Book Page is Displayed");
		}
		else
			System.out.println("Book Page is Not Displayed");
		
		driver.quit();
		
	}
	
	@Test
	public void computerlink() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ComputerPage computer = new ComputerPage(driver);
		
		computer.getcomputerslink().click();
		computer.getnotebookslink().click();
		driver.quit();
		
		}
	@Test
	public void Apparellink() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ApparelPage apps = new ApparelPage(driver);
		apps.getapparel().click();
		if(apps.getapparel().getText().equals("Apparel & Shoes")) {
			System.out.println("Apparel & Shoes Page is Displayed");
		}
		else
			System.out.println("Apparel & Shoes Page is Not Displayed");
		
		driver.quit();
		
		}
	
	@Test
	public void Appareldropdown() {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ApparelPage apps = new ApparelPage(driver);
		apps.getapparel().click();
		
		Select select = new Select(apps.getdropdown());
		select.selectByIndex(3);
		
		Select selects = new Select(apps.getdrop());
		selects.selectByVisibleText("8");
		
		Select sel = new Select(apps.getdrops());
		sel.selectByIndex(1);
		
		driver.quit();
		
	}
	
	@Test
	public void DigiDown() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		DigidownPage digidown = new DigidownPage(driver);
		digidown.getdigidownlink().click();
		
		driver.quit();
		
		
	}
	
	@Test
	public void DigiDownTitle() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		DigidownPage digidown = new DigidownPage(driver);
		digidown.getdigidownlink().click();
		
		if(digidown.getdigidownlink().getText().equals("Digital downloads")) {
			System.out.println(" Digital downloads title is Displayed");
		}
		else
			System.out.println("Digital downloads title is Not Displayed");
		
		driver.quit();
		
		
	}
	
	@Test
	public void Jewelry() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		JewelryPage jewelry = new JewelryPage(driver);
		
		jewelry.getjewelry().click();
		
		if(jewelry.getjewelry().getText().equals("Jewelry")) {
			System.out.println(" Jewelry page is Displayed");
		}
		else
			System.out.println("Jewelry page is Not Displayed");
		
		driver.quit();
		
		}
	@Test
	public void GiftCard() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		GiftCardPage giftcard = new GiftCardPage(driver);
		
		giftcard.getgiftcardlink().click();
		if(giftcard.getgiftcardlink().getText().equals("Gift Cards")) {
			System.out.println(" Gift Cards page is Displayed");
		}
		else
			System.out.println("Gift Cards page is Not Displayed");
		
		driver.quit();
		
	}
	@Test
	public void shoppingCard() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ShoppingCardPage shoppingcard = new ShoppingCardPage(driver);
		
		shoppingcard.getshoppingcardlink().click();
		if(shoppingcard.getshoppingcardlink().getText().equals("Shopping cart")) {
			System.out.println(" shoppingcardlink is clickable");
		}
		else
			System.out.println(" shoppingcardlink is Not clickable");
		
		driver.quit();
		
		
	}
	
	@Test
	public void checkout() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ShoppingCardPage shoppingcard = new ShoppingCardPage(driver);
		
		shoppingcard.getshoppingcardlink().click();
		shoppingcard.getcheckbox().click();
		shoppingcard.getcheckoutbutton().click();
		driver.quit();
		
		}
	@Test
	public void checkoutguest() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ShoppingCardPage shoppingcard = new ShoppingCardPage(driver);
        AddToCardPage addtocard = new AddToCardPage(driver);
        LoginPage login = new LoginPage(driver);
		
		
		addtocard.getjewelry().click();
		addtocard.getproduct().click();
		addtocard.getAddToCardButton().click();
		shoppingcard.getshoppingcardlink().click();
		shoppingcard.getcheckbox().click();
		shoppingcard.getcheckoutbutton().click();
		login.getEmail().sendKeys("sakthy13@gmail.com");
		login.getPassword().sendKeys("kutty#01");
		login.getLoginButton().click();
		driver.switchTo().alert().accept();
		shoppingcard.getFN().sendKeys("sakthy");
		shoppingcard.getLN().sendKeys("mathi");
		shoppingcard.getEmail().sendKeys("sakthy111@gmail.com");
		Select select = new Select(shoppingcard.getdropdown());
		select.selectByVisibleText("India");
		shoppingcard.getcitydropdown().sendKeys("Tirunelveli");
		shoppingcard.getaddress().sendKeys("chennai");
		shoppingcard.getzipcode().sendKeys("627425");
		shoppingcard.getPN().sendKeys("9876543210");
		shoppingcard.getbutton().click();
		
		driver.quit();
		
		}
	@Test
	public void shippingaddress() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		ShoppingCardPage shoppingcard = new ShoppingCardPage(driver);
		ShippingaddressPage sp = new ShippingaddressPage(driver);
		shoppingcard.getshoppingcardlink().click();
		shoppingcard.getcheckbox().click();
		shoppingcard.getcheckoutbutton().click();
		sp.getshippingadd().click();
		sp.getchecking().click();
		sp.getcontinuebutton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void paymentmethod() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WelcomePage welcome = new WelcomePage(driver);
		RegisterPage register = new RegisterPage(driver);
		AddToCardPage addtocard = new AddToCardPage(driver);
		ShoppingCardPage shoppingcard = new ShoppingCardPage(driver);
		
		
		welcome.getRegisterLink().click();
		register.getGender().click();
		register.getFN().sendKeys("sakthy");
		register.getLN().sendKeys("mathi");
		register.getEmail().sendKeys("sakthy1111@gmail.com");
		register.getPassword().sendKeys("kutty#01");
		register.getCP().sendKeys("kutty#01");
		register.getButton().click();

		addtocard.getjewelry().click();
		addtocard.getproduct().click();
		addtocard.getAddToCardButton().click();
		shoppingcard.getshoppingcardlink().click();
		shoppingcard.getcheckbox().click();
		shoppingcard.getcheckoutbutton().click();
		shoppingcard.getFN().sendKeys("sakthy");
		shoppingcard.getLN().sendKeys("mathi");
		Select select = new Select(shoppingcard.getdropdown());
		select.selectByVisibleText("India");
		shoppingcard.getcitydropdown().sendKeys("Tirunelveli");
		shoppingcard.getaddress().sendKeys("chennai");
		shoppingcard.getzipcode().sendKeys("627425");
		shoppingcard.getPN().sendKeys("9876543210");
		shoppingcard.getbutton().click();
		
	}
	
	
	

}


