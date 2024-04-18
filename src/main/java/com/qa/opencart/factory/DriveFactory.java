package com.qa.opencart.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.opencart.Exceptions.BrowserException;

public class DriveFactory {
	
	
	
	
	WebDriver driver;
	public WebDriver initDriver(String browserName)
	{
			System.out.println("broswe name is" + browserName);
			switch (browserName.toLowerCase().trim()) {
			case "chrome":
				driver =new ChromeDriver();
				
				break;

			case "firefox":
				driver =new FirefoxDriver();
				
				break;
				
			case "edge":
				driver =new EdgeDriver();
				
				break;
			default:
				
				System.out.println("Browser is not define plesse pass right browsername");
				throw  new BrowserException("No browser foundd");
			}
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			return driver;
	}
	

	
	
}
