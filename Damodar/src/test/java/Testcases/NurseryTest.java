package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseUtils.Browser;
import Pages.Nurserylive;

public class NurseryTest extends Nurserylive{
	
	
	
	@BeforeTest
	public void launchbrowser() throws Exception 
	
	{
		 launchapp();
		
		
		
	}
	
	@Test
	public void GardenTest()
	
	{
		
		Garden();
	}

}
