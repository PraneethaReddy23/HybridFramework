package ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericutil.WebDriverUtility;

public class HomePage  extends WebDriverUtility{
	@FindBy(xpath="//a[text()='Organizations']")private WebElement orglnk;
	@FindBy(xpath="//a[text()='Opportunities']")private WebElement oppolnk;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")private WebElement admImg;
	@FindBy(xpath="//a[text()='Sign Out']")private WebElement signoutlnk;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters
	public WebElement getOrglnk() {
		return orglnk;
	}
	public WebElement getOppolnk() {
		return oppolnk;
	}
	public WebElement getAdmImg() {
		return admImg;
	}
	public WebElement getSignoutlnk() {
		return signoutlnk;
	}
	//Business Library
	public void clickOnOrgLnk() {
		orglnk.click();
	}
	public void clickOnOpporLnk() {
		oppolnk.click();
	}
	public void logoutApp(WebDriver driver) {
		mouseOverToElement(driver, admImg);
		signoutlnk.click();
	}

}
