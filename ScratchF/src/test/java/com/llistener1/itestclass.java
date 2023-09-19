package com.llistener1;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.llistener.itest;

@Listeners({itest.class}) // we can use comma separator and we can mention more class names
public class itestclass {
  
	@Test
  public void test1() {
		System.out.println("test1");
	  
  }
	@Test
	  public void test2() {
		System.out.println("test2");
		Assert.assertTrue(false);
		  
	 }
	@Test(timeOut = 1000)
	  public void test3() throws Exception {
		
		Thread.sleep(2000);
		System.out.println("test3");
		  
	  }
	
	@Test(dependsOnMethods = "test3" )
	  public void test4() {
		System.out.println("test4");
		  
	  }
	
}
