package com.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_NewUserRegistration
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test(priority=1)
	public void Register()
	{
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority=2)
	public void UserRegistration()
	{
		driver.findElement(By.name("firstName")).sendKeys("Aish");
		driver.findElement(By.name("lastName")).sendKeys("Hello");
		driver.findElement(By.name("phone")).sendKeys("85854");
		driver.findElement(By.name("userName")).sendKeys("Aishsu@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("1Hello");
		driver.findElement(By.name("address2")).sendKeys("bonclse");
		driver.findElement(By.name("city")).sendKeys("cbe");
		driver.findElement(By.name("state")).sendKeys("tn");
		driver.findElement(By.name("postalCode")).sendKeys("357745");
		driver.findElement(By.name("country")).sendKeys("INDIA");
		
		driver.findElement(By.id("email")).sendKeys("Aishhhhh");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("confirmPassword")).sendKeys("abc123");
		
		driver.findElement(By.name("register")).click();
		
		String ExpectedUserName="Aishhhhh";
		
		String ActualUserText=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
		
		if(ActualUserText.contains(ExpectedUserName))
		{
			System.out.println("User Registered Successfully -- PASS");
		}   
		else
		{
			System.out.println("User registration Failed -- FAIL");
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
