package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {
	@FindBy(id="Cucumber")
	public WebElement cucumber;
	
	@FindBy(id="cartArea")
	public WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]")
	public WebElement linkedin;
	
	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	

	public WebElement getCucumber() {
		return cucumber;
	}



	public WebElement getCartarea() {
		return cartarea;
	}

	public WebElement getLinkedinn() {
		return linkedin;
	}
	
	public void linkedinicon() {
		linkedin.click();
	}
	
	

}
