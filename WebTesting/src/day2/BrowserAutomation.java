package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		FirefoxDriver Aishwarya = new FirefoxDriver();
		Aishwarya.get("http://www.google.com");
		Aishwarya.navigate().to("http://bbc.co.uk");
		
		Aishwarya.close();

	}

}