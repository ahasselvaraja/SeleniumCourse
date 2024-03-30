package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;

public class CreateAccount extends ProjectSpecificMethod {

	public CreateAccount(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccount AccountCreate() {

		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Ahas");
		return this;

	}

	public ViewAccount clickSubmit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		return new ViewAccount(driver);
	}
}
