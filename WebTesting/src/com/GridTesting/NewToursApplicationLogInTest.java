package com.GridTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.bouncycastle.operator.DefaultSignatureAlgorithmIdentifierFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursApplicationLogInTest
{

	@Parameters("Browser")
	
	@Test
	public void LogInTest(String b) throws MalformedURLException
	{
		
		DesiredCapabilities cap=null;
		
		System.out.println(b);
		
		if(b.equals("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		//														HUB                             ,Node
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.66:4444/wd/hub"),cap);
		
		driver.get("http://newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElementByName("login").click();
		
		String ExpectedTitle="Find a Flight: Mercury Tours:";
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched -- FAIL");
		}
		
		
		
	}
}
