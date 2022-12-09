package scripts;


import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillaryDemoLogin;
import pomPages.SkillaryLoginPages;

public class Testcase2 extends BaseClass{
@Test

public void tc2() throws IOException {
	SkillaryLoginPages s=new SkillaryLoginPages(driver);
	s.gearsButton();
	s.skillaryDemoapp();
	
	SkillaryDemoLogin sd= new SkillaryDemoLogin(driver);
	driverutilities.switchTabs(driver);
	driverutilities.dropDown(sd.getSelectdd(),pdata.getData("coursedd"));
			
	CoursePage cp=new CoursePage(driver);
	driverutilities.dragandrop(driver,cp.getCucumber(),cp.getCartarea());
	WebElement loc=cp.getLinkedinn();
	Point l=loc.getLocation();
	int x=l.getX();
	int y=l.getY();
	
	driverutilities.scrollBar(driver,x,y);
	cp.linkedinicon();
}
}
