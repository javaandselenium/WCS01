package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Takethiscoursepage {
	
	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	@FindBy(xpath="//button[text()=' TAKE THIS COURSE ']")
	private WebElement takecourse;
	
	public Takethiscoursepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playbtn() {
		play.click();
	}
	
	public void pausebtn() {
		pause.click();
	}
	
	public void takethiscourse() {
		takecourse.click();
	}

}
