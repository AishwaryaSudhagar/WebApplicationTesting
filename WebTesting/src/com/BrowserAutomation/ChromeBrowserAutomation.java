package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowserAutomation {

	public static void main(String[] args)
	{
	//	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	//	ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver","c:\\MicrosoftWebDriver.exe");
		//EdgeDriver driver = new EdgeDriver();
		
		//System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");

	}

}
