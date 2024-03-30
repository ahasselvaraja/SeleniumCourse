package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;

public class LogoutPage extends ProjectSpecificMethod{
	
	public LogoutPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LogoutPage clickLogout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		return this;
	}
	
	public LoginPage Login() {
		
//		LoginPage Login =new LoginPage();
//		Login.EnterUsername()
		driver.findElement(By.xpath("//td[@align='left']/input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//td[@align='left']/input[@name='PASSWORD']")).sendKeys("crmsfa");
		return new LoginPage(driver);
	}

}
