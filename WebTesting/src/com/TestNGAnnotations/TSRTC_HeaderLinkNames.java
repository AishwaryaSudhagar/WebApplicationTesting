package com.TestNGAnnotations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTC_HeaderLinkNames
{
	FirefoxDriver driver;
	

	@BeforeTest
	public void setUp()
	
	{
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://www.tsrtconline.in/oprs-web/");
	}
	
	
	@Test
	public void HeaderBlockLinks()
	{
	
	WebElement HeaderBlock=driver.findElement(By.className("menu-wrap"));
	List<WebElement>HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
	
	System.out.println(HeaderBlockLinks.size());
	
	for(int a=0;a<HeaderBlockLinks.size();a++)
	{
	String HeaderLinkName=HeaderBlockLinks.get(a).getText();
	System.out.println(a+"  "+HeaderLinkName);
	
	
	HeaderBlock=driver.findElement(By.className("menu-wrap"));
	HeaderBlockLinks=HeaderBlock.findElements(By.tagName("a"));
	}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}