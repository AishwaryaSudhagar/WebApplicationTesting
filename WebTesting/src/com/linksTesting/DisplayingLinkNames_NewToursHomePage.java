package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayingLinkNames_NewToursHomePage {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		List<WebElement>Ash=driver.findElements(By.tagName("a"));
		
		System.out.println(Ash.size());
		
		for(int a=0;a<Ash.size();a++)
		{
			String TextName=Ash.get(a).getText();
			System.out.println(a+" "+TextName);
		}
		driver.close();

	}

}
