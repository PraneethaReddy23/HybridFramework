package ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orglookupImg;
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

  //getters
	public WebElement getOrglookupImg() {
		return orglookupImg;
	}
	//Business Library
	public void clickonOrglookupImg() {
		orglookupImg.click();
	}
	
}