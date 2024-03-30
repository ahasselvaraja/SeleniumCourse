package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import webPages.LoginPage;


public class TC_Logout_001 extends ProjectSpecificMethod {

	@Test(priority=1)
	public void logout() {
		new LoginPage(driver)
		.EnterUsername()
		.EnterPassword()
		.ClickLoginBtn()
		.clickLogoutWelcome();

	}
}