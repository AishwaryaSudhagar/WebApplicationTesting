package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text=alt.getText();
		System.out.println(text);
		
		Thread.sleep(5000);
		
		alt.accept();
		
		//alt.dismiss();
		
		//alt.sendKeys("Ash");
		
		driver.close();
		

	}

}
