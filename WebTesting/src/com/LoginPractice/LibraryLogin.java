package com.LoginPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LibraryLogin {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://arena.yourlondonlibrary.net/web/lewisham/user-pages");
	
	
	driver.findElement(By.name("openTextUsernameContainer:openTextUsername")).sendKeys("1500066568");
	driver.findElement(By.name("textPassword")).sendKeys("2012");
	driver.findElement(By.className("arena-input-submit")).click();
		
		driver.close();
	

	}

}