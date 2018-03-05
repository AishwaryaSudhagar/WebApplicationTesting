package com.ScreenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();;
		driver.get("http://bing.com");
		
		Sleeper.sleepTightInSeconds(10);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\aishsub\\Desktop\\AishwaryaSelenium\\WebApplicationTesting\\ScreenShots\\bing.png"));
		
		driver.close();
		

	}

}
