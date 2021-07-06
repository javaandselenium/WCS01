package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage {
	
	@FindBy(xpath="//button[contains(@class,'likeButton')]")
    private WebElement like;
	
	public FacebookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void likebtn() {
		like.click();
	}
}
