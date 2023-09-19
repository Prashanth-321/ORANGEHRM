package com.testcases;


import org.testng.annotations.Test;

import com.pages.Loginpage;

import Baseutils.Baseclass;

public class logintest extends Baseclass{
	
	@Test(priority = 1)
	public void testlogin() 
	{
		Loginpage lp = new Loginpage(driver);
		lp.login();
		
	}
}
