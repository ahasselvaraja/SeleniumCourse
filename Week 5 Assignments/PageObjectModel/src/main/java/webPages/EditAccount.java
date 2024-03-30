package webPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import baseClass.ProjectSpecificMethod;

public class EditAccount extends ProjectSpecificMethod{
	
	public ParentAccount findParentAccount() {
		driver.findElement(By.xpath("//img[@alt='Lookup']/..")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> WindowHandle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(WindowHandle.get(1));
		return new ParentAccount(driver);
	}

}
