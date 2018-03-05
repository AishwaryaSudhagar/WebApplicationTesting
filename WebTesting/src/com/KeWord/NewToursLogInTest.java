package com.KeWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest
{

	ChromeDriver driver;
	//FirefoxDriver driver ;
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		//Sleeper.sleepTightInSeconds(10);
	}
	
	@Test
	public void LogIn() throws IOException
	{
		FileInputStream file = new FileInputStream("c:\\Users\\aishsub\\Desktop\\AishwaryaSelenium\\WebTesting\\newTours.properties");
		
		Properties pr = new Properties();
		pr.load(file);
		
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys("tutorial");
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.xpath(pr.getProperty("SignIN"))).click();
		
		String ExpectedTitle="Find";
		
		String ActualTitle=driver.getTitle();
		
		System.out.println(ExpectedTitle);
		System.out.println(ActualTitle);
		
		if(ActualTitle.contains(ExpectedTitle))
		{
			System.out.println("LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
