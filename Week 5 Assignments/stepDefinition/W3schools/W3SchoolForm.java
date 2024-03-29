package stepDefinition.W3schools;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class W3SchoolForm extends W3SchoolProjectSpecificMethod {

	@Given("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("Load the url")
	public void loadUrl() {
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
	}

	@When("Switch to frame to enter details")
	public void Iframe() {
		WebElement element = driver.findElement(By.xpath("//div/iframe[@id='iframeResult']"));
		driver.switchTo().frame(element);
	}

	@Given("Enter the Name on card (.*)$")
	public void NameOnCard(String Name) {
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(Name);
	}

	@Given("Enter the Credit card number {string}")
	public void Credit(String CreditCard) {
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(CreditCard);
	}

	@Given("Enter the expiry month {string}")
	public void ExpMonth(String ExpMonth) {
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(ExpMonth);
	}

	@Given("Enter the Cvv {string}")
	public void Cvv(String Cvv) {
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(Cvv);
	}

	@Given("Enter the the expiry year {string}")
	public void ExpYear(String ExpYear) {
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(ExpYear);
	}

	@Given("Enter the Full Name (.*)$")
	public void FullName(String FullName) {
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(FullName);
	}

	@Given("Enter the email (.*)$")
	public void Email(String Email) {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
	}

	@Given("Enter the Address (.*)$")
	public void Address(String Address) {
		driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(Address);
	}

	@Given("Enter the City (.*)$")
	public void City(String City) {
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys(City);
	}

	@Given("Enter the zip code {string}")
	public void Zip(String Zip) {
		driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(Zip);
	}

	@Given("Enter the State (.*)$")
	public void State(String State) {
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys(State);
	}

}
