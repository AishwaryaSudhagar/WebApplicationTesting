package com.TestNGAnnotations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebTable 

{
	FirefoxDriver driver;

	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		 driver.get("https://www.timeanddate.com/worldclock/");
	}
	
	@Test
	public void linkTest()
	{
	WebElement table=driver.findElement(By.xpath("html/body/div[1]/div[8]/section[2]/div[1]/table"));
	
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	
	for(int a=0;a<rows.size();a++)
	{
		List<WebElement>cols=rows.get(a).findElements(By.tagName("td"));
		for(int b=0;b<cols.size();b++)
		{
			String data=cols.get(b).getText();
			System.out.print(data+"  ");
		}
		System.out.println();
		
	}
	
	
	}
	
	@AfterTest
	
	public void tearDown()
	{
	driver.close();
	}

}
