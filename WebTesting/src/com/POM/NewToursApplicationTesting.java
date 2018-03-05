package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursApplicationTesting
{

	@Test
	public void HomePageTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.Register();
		driver.navigate().back();
		
		WMT.Support();
		driver.navigate().back();
		
		WMT.Contact();
		driver.navigate().back();
		
		WMT.LogInTest("tutorial","tutorial");
		System.out.println(driver.getTitle());
		
		WMT.Home();
		driver.navigate().back();
		
		WMT.Flights();
		driver.navigate().back();
		
		WMT.Hotels();
		driver.navigate().back();
		
		WMT.CarRentals();
		driver.navigate().back();
		
		WMT.Cruises();
		driver.navigate().back();
		
		WMT.Vacations();
		driver.navigate().back();
		
		WMT.Destinations();
		driver.navigate().back();
		
		{
			driver.close();
		}
	}
}
