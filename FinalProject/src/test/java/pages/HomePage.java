package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;
import testBase.WebTestBase;
public class HomePage extends WebTestBase{
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div/div[3]/button")
	WebElement icon;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='SHOP NOW']")
	WebElement ScrollDown;

	public void user_click(){
		icon.click();
		login.click();
	}
	
	public void scrollDownMethod(){
        Utility.scrollDownByElement(driver, ScrollDown);
    }
	public HomePage(){
        PageFactory.initElements(driver, this);
    }
}
