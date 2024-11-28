package ObjectRepos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
 @FindBy(xpath="//input[@name='user_name']")private WebElement untxt;	
 @FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
 @FindBy(xpath="//input[@id='submitButton']")private WebElement loginbtn;
 //Initialization
 public LoginPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 //Utilization
public WebElement getUntxt() {
	return untxt;
}
public WebElement getPwdtxt() {
	return pwdtxt;
}
public WebElement getLoginbtn() {
	return loginbtn;
}
//Business Library(Action methods)
public void loginToApp(String un, String pwd) {
	untxt.sendKeys(un);
	pwdtxt.sendKeys(pwd);
	loginbtn.click();
}

}
