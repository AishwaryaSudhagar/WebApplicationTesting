package newToursApplicationLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTesting 
{
	FirefoxDriver driver;

	@Given("^Open FireFox Browser and Navigate to NewTours Application$")
	public void Open_FireFox_Browser_and_Navigate_to_NewTours_Application() throws Throwable
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^User enters valid UserName and Password and Click on SignIn button$")
	public void User_enters_valid_UserName_and_Password_and_Click_on_SignIn_button() throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElementByName("login").click();
		
		
		
	}

	@Then("^User Should be able to LogIn Successfully and Close the Application$")
	public void User_Should_be_able_to_LogIn_Successfully_and_Close_the_Application() throws Throwable
	{
		
		String ExpectedTitle="Find a Flight: Mercury Tours:";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched -- FAIL");
		}
		
		driver.close();
	}
	



}
