package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verify_login() {

		logger.info("**** Starting TC_002_LoginTest ****");

		try {
			// Home Page
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on My Account");

			hp.clickLogin();
			logger.info("Clicked on Login");

			// Login Page
			LoginPage lp = new LoginPage(driver);
			logger.info("Entering login credentials");

			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();

			// My Account Page
			MyAccountPage macc = new MyAccountPage(driver);
			boolean status = macc.isMyAccountPageExists();

			Assert.assertEquals(status, true, "Login failed");

		} catch (Exception e) {
			Assert.fail("Test failed due to exception: " + e.getMessage());
		}

		logger.info("**** Finished TC_002_LoginTest ****");
	}
}
