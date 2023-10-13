package testCase;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.*;

import org.testng.asserts.SoftAssert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.WebTestBase;
public class TC01 extends WebTestBase{
	HomePage homepage;
	LoginPage loginpage;
	AccountPage Myaccountpage;
	public TC01() {
		super();
	}
	@BeforeMethod
	public void BeforeMethod() {
		loadUrl();
		homepage=new HomePage();
		loginpage=new LoginPage();
		Myaccountpage=new AccountPage();
	}
	@Test(priority=0)
	public void verifyHome() {
		SoftAssert softassert=new SoftAssert();
		homepage.user_click();
		softassert.assertAll();
	}
	@Test(priority=1)
	public void verifyLogin() {
		SoftAssert softassert=new SoftAssert();
		loginpage.LoginClick();
		softassert.assertEquals(loginpage.gettextofsearch(),"My account","My");
		softassert.assertAll();
	}
	@Test(priority=2)
	public void verifyButton() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		Myaccountpage.verifyButton();
		softassert.assertAll();
	}
	@Test(priority=3)
	public void verifySearch() throws InterruptedException
	{
		SoftAssert softassert=new SoftAssert();
		Myaccountpage.verifySearch();
		softassert.assertAll();
	}
	@Test(priority=4)
	public void scrollDownMethod(){
		SoftAssert softassert=new SoftAssert();
		homepage.scrollDownMethod();
		softassert.assertAll();
	}
	@Test(priority=5)
	 public void verifyCookiesHandle(){
	     SoftAssert softAssert = new SoftAssert();
	     Myaccountpage.getCookiesHandle();
	     softAssert.assertAll();
	 }
	@Test(priority=6)
	public void Location() throws InterruptedException, AWTException, IOException {
		SoftAssert softAssert = new SoftAssert();
	    Myaccountpage.Location();
	    softAssert.assertAll();
	}
	@Test(priority=7)
	public void fav_btn() throws InterruptedException {
		SoftAssert softassert=new SoftAssert();
		loginpage.LoginClick();
		Thread.sleep(2000);
		Myaccountpage.fav_btn();
		softassert.assertAll();
	}
}
