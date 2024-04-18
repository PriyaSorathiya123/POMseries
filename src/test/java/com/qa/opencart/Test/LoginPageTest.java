package com.qa.opencart.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.Base.BaseTest;

public class LoginPageTest extends BaseTest
{
   
	
	@Test
	 public void loginpageTitleTest()
	 {
		
		String act_title=loginpage.getLoginPageTitle();
		Assert.assertEquals(act_title, "Account Login");
		
		
			 
	}
	

}
