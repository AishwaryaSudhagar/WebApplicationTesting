package com.MouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Kids_Toys {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://myntra.com");
		
		WebElement Kids=driver.findElement(By.linkText("Kids"));
		
		Actions act = new Actions(driver);;
		act.moveToElement(Kids).perform();
		
		WebElement Toys=driver.findElement(By.linkText("Toys"));
		Toys.click();
		

	}

}
