package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IndentifyingLinksCount_NewTours {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>Ash=driver.findElements(By.tagName("a"));
		
		System.out.println(Ash.size());
		
		driver.close();
		
		
		

	}

}
