package stepDefinition.W3schools;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class W3SchoolProjectSpecificMethod extends AbstractTestNGCucumberTests{

public static ChromeDriver driver;
	
	@BeforeMethod
	
	public void preCondition() {
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
//	@AfterMethod
//	public void postCondition() {
//		driver.close();
//	}
	
}


