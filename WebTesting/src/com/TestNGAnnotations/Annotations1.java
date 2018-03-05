package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This is used to Launch Browser");
	}
	
	@Test(priority=2)
	public void LogIn()
	{
		System.out.println("This is used to test LogIn FUnctionality");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("This is used to tset InBox Functionality");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("This is used to test ComposeMail Functionality");
	}
}