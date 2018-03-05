package com.FacebookLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogIn {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("sdam17");
		driver.findElementById("pass").sendKeys("Hello");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();
		

	}

}
