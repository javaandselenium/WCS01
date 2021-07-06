package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.FacebookPage;
import pomPages.SkillraryDemologinPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class FacebookLike extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasbutton();
		s.skillrarydemoapplication();
		
		utilies.switchingTabs(driver);
		
		SkillraryDemologinPage d=new SkillraryDemologinPage(driver);
		utilies.dropDown(d.getCoursedd(),p.getData("coursename"));
		
		TestingPage t=new TestingPage(driver);
		utilies.dragandDrop(driver,t.getSeleniumcourse(),t.getCart());
		t.facebookbtn();
		
		FacebookPage f=new FacebookPage(driver);
		f.likebtn();
		
		
	}

}
