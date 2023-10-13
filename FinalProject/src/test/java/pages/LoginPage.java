package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
public class LoginPage extends WebTestBase{

	@FindBy(xpath="/html/body/div[1]/div[1]/div/nav/div/div/div[3]/button")
	WebElement icon;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"login-container\"]/div/form/div[2]/button[1]/div/div[1]")
	WebElement loginemail;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[text()='My account']")
	WebElement title;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	public void LoginClick() {
		/*login.click();*/
		icon.click();
		login.click();
		loginemail.click();
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
	}
	public String gettextofsearch() {
		return title.getText();
	}
}
