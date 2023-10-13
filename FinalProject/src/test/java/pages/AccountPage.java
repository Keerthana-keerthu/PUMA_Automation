package pages;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.Utility;
import testBase.WebTestBase;
public class AccountPage extends WebTestBase{
	@FindBy(xpath="//a/span[text()='Men']")
	WebElement men;
	
	@FindBy(xpath="//button[text()='Category']")
	WebElement filterbtn;
	
	@FindBy(id="Accessories")
	WebElement filter_select;
	
	@FindBy(xpath="//div[text()='Search']")
	WebElement searchbtn;
	
	@FindBy(id="react-aria-8")
	WebElement searchtext;
	
	@FindBy(id="react-aria-8")
	WebElement searchenter;
	
	@FindBy(id="account-button")
	WebElement locationbtn;
	
	@FindBy(xpath="//a[text()='Store Finder']")
	WebElement storefn;
	
	@FindBy(id="OutletSearch")
	WebElement searchloc;
	
	@FindBy(className="btn")
	WebElement btn;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div/div[1]/a/div[1]")
	WebElement fav;
	
	public AccountPage(){
        PageFactory.initElements(driver, this);
    }
	
	public void verifyButton() throws InterruptedException {
		men.click();
		filterbtn.click();
		Thread.sleep(1000);
		filter_select.click();
	}
	public void verifySearch(){
		searchbtn.click();
		searchtext.sendKeys("Women Accessories");
		searchenter.sendKeys(Keys.ENTER);
	}	
	
	public void getCookiesHandle(){
        Utility.getCookies();
    }
	
	public void Location() throws InterruptedException, AWTException, IOException {
		locationbtn.click();
		Thread.sleep(2000);
		storefn.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		searchloc.sendKeys("chennai");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		btn.click();
		Utility.screenshotAction(driver);
	}
	public void fav_btn(){
		fav.click();
	}

}
