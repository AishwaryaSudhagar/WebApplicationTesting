package com.TestNGAnnotations;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatingUrlFacebook

{
	
		FirefoxDriver driver;

		@BeforeTest
		public void setUp()
		{
			 driver = new FirefoxDriver();
			driver.get("http://facebook.com");
		}
		
		
		@Test
		public void getCurrentUrl()
		{
	
		String ExpectedURL="facebook.com";
		System.out.println(ExpectedURL);
			
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("URL Matched -- PASS");
		}
		else
		{
			System.out.println("Url not Matched -- FAIL");
		}
		
		System.out.println();
		
		String ExpectedTitle="Facebook";
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched - PASS");
			
		}
		else
		{
			System.out.println("Title Not Matched - FAIL");
		}
		}
		
		@AfterTest
		public void tearDown()
		{
			driver.close();
}
		}
		
