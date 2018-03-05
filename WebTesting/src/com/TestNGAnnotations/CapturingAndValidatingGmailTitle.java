package com.TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CapturingAndValidatingGmailTitle 

{
	
FirefoxDriver driver;

@BeforeTest
public void setUp()
{
	 driver = new FirefoxDriver();
	driver.get("http:gmail.com");
}

@Test
public void getTitle()
{
String ExpectedTitle="Gmail";
System.out.println(ExpectedTitle+" "+"Client Requirement");

String ActualTitle=driver.getTitle(); 
System.out.println(ActualTitle+"  "+"Developer Developed Title");

if(ActualTitle.equals(ExpectedTitle))
{
	System.out.println("Title Matched -- PASS");
}
else
{
	System.out.println("Title Not Matched -- FAIL");
}
}

@AfterTest
public void tearDown()
{
	driver.close();
}
	
}	
	
	
