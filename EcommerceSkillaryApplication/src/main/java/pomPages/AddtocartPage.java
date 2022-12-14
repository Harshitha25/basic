package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {
	@FindBy(id="add")
	public WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	public WebElement addtocartbtn;
	
	public AddtocartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getAddbtn() {
		return addbtn;
	}


	public void addtocartbutton() {
		addtocartbtn.click();
	}
}
