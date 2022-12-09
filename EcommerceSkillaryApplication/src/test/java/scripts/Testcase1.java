package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillaryDemoLogin;
import pomPages.SkillaryLoginPages;

public class Testcase1 extends BaseClass {
	@Test
	public void tc1() {
		SkillaryLoginPages s =new SkillaryLoginPages(driver);
		s.gearsButton();
		s.skillaryDemoapp();
		
		SkillaryDemoLogin sd=new SkillaryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursetab());
		sd.selenium();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilities.doubleClick(driver,ad.getAddbtn());
		ad.addtocartbutton();
		driverutilities.alertpopup(driver);
	}

}
