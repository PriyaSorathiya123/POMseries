package com.qa.opencart.allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login  {
	
	
	//page library
	//1 private by locators
	private WebDriver driver;
	private By email_id =By.id("input-email");
	private By pass= By.id("input-password");
	private By login_btn= By.xpath("//input[@value='Login']");
	private By forgotten_pass = By.linkText("Forgotten Password");
	
	//2 public page class
	
	public Login(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	//3 public methods
	
	
	public String getLoginPageTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title" + title);
		return title;
	}
	

	public String getLoginPageURL()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL IS" + url);
		return url;
	}
	
	public boolean isForgotpasslinkExist() {
		 return driver.findElement(forgotten_pass).isDisplayed();
		
	}
	
	
	public void doLogin(String username, String password) {
		System.out.println("User credentials"+ username + " : " + password);
		
		driver.findElement(email_id).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(login_btn).click();
	}

}
