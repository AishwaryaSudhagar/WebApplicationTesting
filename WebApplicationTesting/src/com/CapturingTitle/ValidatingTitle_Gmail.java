package com.CapturingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidatingTitle_Gmail {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String ExpectedTitle="Gmail"; // Client Req
		System.out.println(ExpectedTitle+" "+"Client Requirement");
		
		String ActualTitle=driver.getTitle(); // Developer Developed Title
		System.out.println(ActualTitle+"  "+"Developer Developed Title");
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Title Matched -- PASS");
		}
		else
		{
			System.out.println("Title Not Matched -- FAIL");
		}
		
		driver.close();

	}

}
