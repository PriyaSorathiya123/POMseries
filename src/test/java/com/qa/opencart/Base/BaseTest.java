package com.qa.opencart.Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.allpages.Login;
import com.qa.opencart.factory.DriveFactory;

public class BaseTest {

	
	DriveFactory df;
	WebDriver driver;
	protected Login loginpage;
	
	@BeforeTest
	
	public void setup()
	{
		df=new DriveFactory();
		driver=df.initDriver("chrome");
		loginpage=new Login(driver);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
