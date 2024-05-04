package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelPage {
	
	public ApparelPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText ="Apparel & Shoes")
	private static WebElement apparel;
	
	@FindBy(id="products-orderby")
	private static WebElement dropdown;
	
	@FindBy(id="products-pagesize")
	private static WebElement drop;
	
	@FindBy(id="products-viewmode")
	private static WebElement  drops;
	
	public WebElement getapparel() {
		return apparel;
	}
	
	public WebElement getdropdown() {
		return dropdown;
	}
	
	public WebElement getdrop() {
		return drop;
	}
	
	public WebElement getdrops() {
		return drops;
	}

}
