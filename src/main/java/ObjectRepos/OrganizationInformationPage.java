package ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	@FindBy(xpath="//span[@class='dvHeaderText']")private WebElement orgHeadtxt;
	//Initialization
	public OrganizationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters
	public WebElement getOrgHeadtxt() {
		return orgHeadtxt;
	}
	
	//Business Library
	public String getTextofOrg() {
		return orgHeadtxt.getText();
	}

	
}
