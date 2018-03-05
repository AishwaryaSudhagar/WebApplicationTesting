package com.TestNGAnnotations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursHomePageLinksTesting
{
	FirefoxDriver driver;

	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com");
	}
	
	@Test
	public void linkTest()
	{
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		{
		System.out.println(a+" "+links.get(a).getText());
		
		links.get(a).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
		}
	}
		
		@AfterTest
		public void tearDown()
		{
			driver.close();
		}
}
