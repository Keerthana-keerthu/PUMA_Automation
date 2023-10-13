package Utils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.WebTestBase;

public class Utility extends WebTestBase{
	public static void scrollDownByElement(WebDriver driver, WebElement element){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
        /*javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);*/
    }
    
    public static void getCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies){
            System.out.println(c);
        }
        driver.manage().deleteAllCookies();
    }
    
    public static void screenshotAction(WebDriver driver) throws IOException {
		TakesScreenshot S=(TakesScreenshot)driver;
		File source=S.getScreenshotAs(OutputType.FILE);
		File destination=new File("D:/ScreenShot.png");
		FileUtils.copyFile(source, destination);
    }
   
}
