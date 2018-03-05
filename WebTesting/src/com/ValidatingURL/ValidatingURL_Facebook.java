package com.ValidatingURL;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingURL_Facebook {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		String ExpectedURL="facebook.com";
		System.out.println(ExpectedURL);
		
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if(ActualURL.contains(ExpectedURL))
		{
			System.out.println("URL Matched -- PASS");
		}
		else
		{
			System.out.println("Url not Matched -- FAIL");
		}
		
		System.out.println();
		
		String ExpectedTitle="Facebook";
		System.out.println(ExpectedTitle);
		
		String ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched - PASS");
			
		}
		else
		{
			System.out.println("Title Not Matched - FAIL");
		}
		

		driver.close();
	}

}
