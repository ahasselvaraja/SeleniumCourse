package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;


	public class WelcomePage extends ProjectSpecificMethod {

		public WelcomePage(ChromeDriver driver) {
			this.driver=driver;
		}

		public WelcomePage ClickCrmsfa() {
			driver.findElement(By.linkText("CRM/SFA")).click();
			return  new WelcomePage(driver);
		}

		public LoginPage clickLogin() {
			driver.findElement(By.className("decorativesubmit")).click();
			return new LoginPage(driver);
		}
		
		public CreateAccount clickCreateAccount() {
			driver.findElement(By.xpath("//a[text()='Create Account']")).click();
			return new CreateAccount(driver);
		}

		public LogoutPage clickLogoutWelcome() {
			driver.findElement(By.xpath("//input[@value='Logout']")).click();
			return new LogoutPage(driver);
		}
	
}
