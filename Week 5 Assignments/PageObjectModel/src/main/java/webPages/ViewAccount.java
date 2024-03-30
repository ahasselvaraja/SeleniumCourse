package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;

public class ViewAccount extends ProjectSpecificMethod {
	
	public ViewAccount(ChromeDriver driver) {
		this.driver= driver;
	}

	public EditAccount clickEdit() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		return new EditAccount();
	}
	
	public LogoutPage Logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		return new LogoutPage(driver);
	}

}
