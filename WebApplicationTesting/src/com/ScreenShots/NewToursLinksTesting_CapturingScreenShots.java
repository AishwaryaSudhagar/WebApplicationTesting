package com.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursLinksTesting_CapturingScreenShots {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("http://newtours.demoaut.com");
		
		driver.navigate().to("http://newtours.demoaut.com");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int a=0;a<links.size();a++)
		{
		System.out.println(a+" "+links.get(a).getText());
		
		String linkName=links.get(a).getText();
		
		links.get(a).click();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\aishsub\\Desktop\\AishwaryaSelenium\\WebApplicationTesting\\ScreenShots\\"+linkName+".png"));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
		
		}
			driver.close();
	}

}
