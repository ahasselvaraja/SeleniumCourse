package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LeadsTests extends ProjectSpecificMethod{
	

//	@Given ("Enter the username as (.*)$")
//	public void enterUserName(String uname) {
//		driver.findElement(By.id("username")).sendKeys(uname);
//	}
//	
//	@Given("Enter the password as (.*)$")
//	public void enterPassword(String pwd) {
//		driver.findElement(By.id("password")).sendKeys(pwd);
//		
//	}
	@When("Click on CRMSFA link")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	
	@When("Click on Leads link")
	
	public void clickleads() {
		driver.findElement(By.linkText("Leads")).click();


	}
	@When("Click on Create Lead link from side menu")
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}
	
	@Given("Enter the Company name as (.*)$")
	public void enterCname(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	@Given("Enter thr Firstname as (.*)$")
	public void enterFname(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter the Last name as (.*)$")
	public void enterLname(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@Given("Enter the Phone number (.*)$")
	public void enterPhno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}
	@When("Click on Submit button")
	public void clickSubmitBtn() {
		driver.findElement(By.name("submitButton")).click();
	}

	


}
