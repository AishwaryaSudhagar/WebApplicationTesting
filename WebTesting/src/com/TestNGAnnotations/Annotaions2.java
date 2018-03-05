package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaions2
{

	@BeforeTest
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
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Application Close");
	}
	
}
