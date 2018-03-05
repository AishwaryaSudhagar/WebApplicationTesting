package com.POM;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{
		
	//WebElement register=driver.findElement(By.linkText("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void Contact()
	{
		contact.click();
		
	}
	
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void LogInTest(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		SignIn.click();
	}
	
	@FindBy(linkText="Home")
	WebElement home;
	
	 public void Home()
	 {
	home.click();
	}

	 
	 @FindBy(linkText="Flights")
		WebElement flights;
		
		public void Flights()
		{
			flights.click();
		}
	 @FindBy(linkText="Hotels")
		WebElement hotels;
		
		public void Hotels()
		{
			hotels.click();
		}
	
		@FindBy(linkText="Car Rentals")
		WebElement carrentals;
		
		public void CarRentals()
		{
			carrentals.click();
		}

		@FindBy(linkText="Cruises")
		WebElement cruises;
		
		public void Cruises()
		{
			cruises.click();
		}
		
		@FindBy(linkText="Destinations")
		WebElement destinations;
		
		public void Destinations()
		{
			destinations.click();
		}
		@FindBy(linkText="Vacations")
		WebElement vacations;
		
		public void Vacations()
		{
			vacations.click();
		}
}