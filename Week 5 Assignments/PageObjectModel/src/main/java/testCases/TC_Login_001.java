package testCases;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificMethod;
import webPages.LoginPage;

public class TC_Login_001 extends ProjectSpecificMethod {
	
	@Test(priority=0)
	public void login() {
		new LoginPage(driver)
		.EnterUsername().EnterPassword().ClickLoginBtn();

}
}