package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.pages.Loginpage;
import com.pages.TestBase;

public class logintest extends TestBase{

	
	@BeforeMethod
	public void browser() 
	{
			launchapp();
	} 
	
	@Test
	
	public void testlogin()
	
	{
		Loginpage lp = new Loginpage(driver);
		lp.login();
	}
	
	
	

}
