package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import webPages.LoginPage;

public class TC_CreateAccount_001 extends ProjectSpecificMethod {

	@Test(priority=2)
	public void createAccount() {
		new LoginPage(driver)
		.EnterUsername()
		.EnterPassword()
		.ClickLoginBtn()
		.ClickCrmsfa()
		.clickCreateAccount()
		.AccountCreate()
		.clickSubmit();
		
}
}