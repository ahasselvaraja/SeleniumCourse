package week5.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassW3Schools {

	public RemoteWebDriver driver;
	@Parameters({"url" })
	
	@BeforeMethod
	public void preCondition(String url ) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		WebElement element = driver.findElement(By.xpath("//div/iframe[@id='iframeResult']"));
		driver.switchTo().frame(element);
		

		
	}
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}