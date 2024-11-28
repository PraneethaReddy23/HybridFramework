package genericutil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void minimizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void waitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void handleDD(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
		}
	public void handleDD(String value, WebElement ele ) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	public void handleDD(WebElement ele, String visibletext) {
		Select s = new Select(ele);
		s.deselectByVisibleText(visibletext);
	}
	public void mouseOverToElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void rightClickPage(WebDriver driver) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	public void rightClickElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void doubleclickAction(WebDriver driver) {
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}
	public void doubleclickElement(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
		public void dragAndDropM(WebDriver driver,WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
	    a.dragAndDrop(src, dest);
	}
	/**
	 * @author neetha
	 * It is used to handle frame
	 * @param driver 
	 * 	
	 */
    public void switchtoParentFrame(WebDriver driver) {
    	driver.switchTo().parentFrame();
    }
    public void switchtoDefaultFrame(WebDriver driver) {
    	driver.switchTo().defaultContent();
    }
    //using Id or name
    public void switchtoFrameusingIdorName(WebDriver driver, String Id) {
    	driver.switchTo().frame(Id);
    }
    /** 
     * @author neetha
     * It is used to handle the popup to click on ok button
     * 
     */
    public void acceptAlert(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
    	 /** 
         * @author neetha
         * It is used to handle the popup to click on cancel button
         * 
         */
    	
    public void  dismissAlert(WebDriver driver) {
    	driver.switchTo().alert().dismiss();
     }
    /** 
     * @author neetha
     * It is used to handle the popup to get Text on Alert popu
     * 
     */
    
    public void getTextOnAlert(WebDriver driver) {
    	driver.switchTo().alert().getText();
    }
    /** 
     * @author neetha
     * It is used to handle the scroll mechanism
     * 
     */
    
    public void handleScroll(WebDriver driver) {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,2000)");
    	
    }
    /** 
     * @author neetha
     * It is used to take screenshot
     * @throws Throwable 
     * 
     */
    public String takescreenshot(WebDriver driver, String SCNAME) throws Throwable {
    	TakesScreenshot ts = (TakesScreenshot)driver;
    File src = ts.getScreenshotAs(OutputType.FILE);
    File dest = new File("./"+SCNAME+".png");
    Files.copy(src, dest);
    return dest.getAbsolutePath();
    }
    /** 
     * @author neetha
     * It is used to get title of web page
     * 
     */
    public String getTitleofwebpage(WebDriver driver) {
    	return driver.getTitle();
    }
    	
    
     
}
