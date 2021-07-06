package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	@FindBy(xpath = "(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumcourse;

	@FindBy(id = "cartArea")
	private WebElement cart;

	@FindBy(xpath = "//i[@class='fa fa-facebook']")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getSeleniumcourse() {
		return seleniumcourse;
	}

	public WebElement getCart() {
		return cart;
	}
	
	public void facebookbtn() {
		facebook.click();
	}

}
