package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Corejava;
import pomPages.SkillaryLoginPages;
import pomPages.WishlistPage;

public class Testcase3 extends BaseClass {
	@Test
	
	public void tc3() throws IOException, InterruptedException {
		SkillaryLoginPages s=new SkillaryLoginPages(driver);
		s.selectCourse(pdata.getData("search"));
		s.submitbtn();
		
		Corejava cj=new Corejava(driver);
		cj.corejavacourse();
		
		WishlistPage w=new WishlistPage(driver);
		w.closebtn();
		driverutilities.switchFrame(driver);
		w.playbutton();
		Thread.sleep(5000);
		w.pausebutton();
		driverutilities.switchBack(driver);
		w.addtowishlistbtn();
	}
}
