package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;


public class LoginPage extends ProjectSpecificMethod{
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage EnterUsername() {

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;

	}

	public LoginPage EnterPassword() {

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;

	}

	public WelcomePage ClickLoginBtn() {

		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);

	}

	

	
	}


