package stepDefinition.RedHatProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RedHatRegister extends RedHatProjectSpecificMethod {

	@Given ("Launch the browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("Load the url")
	public void loadUrl() {
		driver.get("https://www.redhat.com/en?intcmp=701f20000012k69AAA");
	}

	@When("Click on Login button")
	public void Login() {
		driver.findElement(By.id("pfe-navigation__secondary-link--Log-in")).click();
	}

	@Given("Click on Register now link")
	public void Register() {
		driver.findElement(By.xpath("//a[text()='Register now']")).click();
	}

	@Given("Click on the Account type as Personal")
	public void AccountType() {
		driver.findElement(By.xpath("//input[@id='userTypePERSONAL']")).click();
	}

	@Given("Enter the RedHat Login data (.*)$")
	public void LoginID(String RedHatLogin) {
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys(RedHatLogin);
	}

	@Given("Enter the Email Address (.*)$")
	public void Email(String Email) {
		driver.findElement(By.xpath("//input[@id='primaryEmail']")).sendKeys(Email);
	}

	@Given("Enter the Password (.*)$")
	public void Password(String Password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	}

	@Given("Confirm the Password (.*)$")
	public void ConfirmPassword(String Password) {
		driver.findElement(By.xpath("//input[@id='passwordConfirmation']")).sendKeys(Password);
	}

//	@Given("Enter the Company Name (.*)$")
//	public void CompanyName(String Cname) {
//		driver.findElement(By.xpath("//input[@id='companyNameInput']")).sendKeys(Cname);
//	}

	@Given("Enter the Title (.*)$")
	public void Title(String Title) {
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys(Title);
	}

	@Given("Enter the First Name (.*)$")
	public void FirstName(String FirstName) {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(FirstName);
	}

	@Given("Enter the Last Name (.*)$")
	public void LastName(String LastName) {
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(LastName);
	}

	@Given("Select the country as (.*)$")
	public void Country(String Country) {
		driver.findElement(By.xpath("//select[@id='defaultPhysicalAddress.countryCode']")).click();
		driver.findElement(By.xpath("//option[text()='" + Country + "']")).click();
	}

	@Given("Enter the Address (.*)$")
	public void Address(String Address) {
		driver.findElement(By.xpath("//input[@id='defaultPhysicalAddress.address1']")).sendKeys(Address);
	}

	@Given("Enter the PostalCode (.*)$")
	public void PostelCode(String Pcode) {
		driver.findElement(By.xpath("//input[@id='defaultPhysicalAddress.postalCode']")).sendKeys(Pcode);
	}

	@Given("Enter the City (.*)$")
	public void City(String City) {
		driver.findElement(By.xpath("//input[@id='defaultPhysicalAddress.city']")).sendKeys(City);
	}

	@Given("Enter the State (.*)$")
	public void State(String State) {
		driver.findElement(By.xpath("//select[@id='defaultPhysicalAddress.state']")).click();
		driver.findElement(By.xpath("//option[text()='"+State+"']")).click();
	}

	@Given("Enter the Phone Number (.*)$")
	public void PhoneNumber(String Phone) {
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys(Phone);
	}

}
