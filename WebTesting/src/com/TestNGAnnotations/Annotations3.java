package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3
{

	@BeforeMethod
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("Browser Launch and LogIN");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is used to test ComposeMail Functionality");
	}
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("This is used to tset InBox Functionality");
	}
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Application Close");
	}
	
}
