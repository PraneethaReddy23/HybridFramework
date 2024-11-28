package genericutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ObjectRepos.HomePage;
import ObjectRepos.LoginPage;

public class Base {
	
//globally access all utilities by creating object
	public PropertyFileUtil pu = new PropertyFileUtil();
	public ExcelFileUtil eu = new ExcelFileUtil();
	public WebDriverUtility wu = new WebDriverUtility();
	public JavaUtility ju = new JavaUtility();
	public WebDriver driver = null;
	
	@BeforeSuite
	public void bsconfig() { //DB Connection
		System.out.println("===DB CONNECTION===");
	}
	
	@BeforeClass
	public void bcconfig() throws Throwable {  //Launch browser and app
		String BROWSER = pu.readDataFromPf("browser");
		String URL = pu.readDataFromPf("Url");
		System.out.println("Browser name is  " + BROWSER);
		System.out.println("Url is " +" " +URL);
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println(BROWSER +" " + "is Launching");
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			System.out.println(BROWSER +" "+ "IS Launching");
		}
		else {
			System.out.println("Browser is invalid");
		}
		driver.get(URL);
		System.out.println("Browser, app is Launched");
		
	}
	@BeforeMethod
	public void bmconfig() throws Throwable { //Login To App
		String uname = pu.readDataFromPf("UN");
		String passwd = pu.readDataFromPf("PWD");
		//Login Page object
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(uname, passwd);
		System.out.println("Login is done successfully");
	}
	
	@AfterMethod
	public void amconfig() {
		//HomePage Object
		HomePage hp = new HomePage(driver);
		hp.logoutApp(driver);
		System.out.println("Logout is done successfully");
	}
	@AfterClass
	public void acconfig() {
		driver.quit();
		System.out.println("Browser is Closed");
	}
	@AfterSuite
	public void asconfig() {
		System.out.println("===DB DISCONNECTION===");
	}
}
