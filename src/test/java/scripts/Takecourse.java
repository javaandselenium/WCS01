package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;
import pomPages.Takethiscoursepage;

public class Takecourse extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
		
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.serachtextbox(p.getData("name"));
	s.serachbutton();
	
	SeleniumPage sp=new SeleniumPage(driver);
	sp.corejavaselenium();
	
	Takethiscoursepage t=new Takethiscoursepage(driver);
	utilies.frameSwitching(driver);
	t.playbtn();
	Thread.sleep(25000);
	t.pausebtn();
	utilies.frameSwitchback(driver);

	//t.takethiscourse();
		
	Assert.assertEquals(driver.getCurrentUrl(),p.getData("skillrarylogin"));
	
		
	}

}
