package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.ProjectSpecificMethod;

public class ParentAccount extends ProjectSpecificMethod{
	
	public ParentAccount(ChromeDriver driver) {
		this.driver=driver;
	}

	public ParentAccount selectAccount() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}

}
