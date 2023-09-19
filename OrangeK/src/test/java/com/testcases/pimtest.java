package com.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.empregistration;

import Baseutils.Baseclass;

@Listeners((Baseutils.listeners.class))
public class pimtest extends Baseclass{
			
			
			@Test
			public void empregtest() 
			
			{
				empregistration emp = new empregistration(driver);
				emp.pimdetails();
				
			}
	
}
