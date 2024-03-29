package week5.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class W3SchoolsPortalWithExcel extends BaseClassW3Schools {
	
	
	@Test(dataProvider = "sendData")
	public  void W3schools(String NameOnCard, String Credit, String ExpMonth, String Cvv, String ExpYear, String FullName, String Email, String Address, String City, String Zip, String State) {
		
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(NameOnCard);
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(Credit);
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(ExpMonth);
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(Cvv);
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(ExpYear);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(FullName);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City);
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(Zip);
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(State);
	}

	
	@DataProvider(name = "sendData", indices = { 0 })
	public String[][] fetchData() throws IOException {
		
		return W3SchoolsExceldata.excel("W3schoolsData");
	}
}
