package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursHomePageLinksTesting {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://newtours.demoaut.com");
		
		driver.navigate().to("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		{
		System.out.println(a+" "+links.get(a).getText());
		
		links.get(a).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
		
		}
		driver.close();
		

	}

}
