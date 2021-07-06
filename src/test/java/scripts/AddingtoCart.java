package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddTocartPage;
import pomPages.SkillraryDemologinPage;
import pomPages.SkillraryLoginPage;

public class AddingtoCart extends BaseClass{
	@Test
	public void tc1() throws FileNotFoundException, IOException {
	
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gerasbutton();
	s.skillrarydemoapplication();
	
	utilies.switchingTabs(driver);
	
	SkillraryDemologinPage d=new SkillraryDemologinPage(driver);
	utilies.mouseHover(driver,d.getCoursebtn());
	d.seleniumtatiningbtn();
	
	AddTocartPage a=new AddTocartPage(driver);
	utilies.doubleClick(driver,a.getAddbtn());
	a.adddingtocart();
	utilies.alertPopup(driver);
	
	Assert.assertEquals(driver.getTitle(),p.getData("srtitle"));
	
	
		
	}

}
