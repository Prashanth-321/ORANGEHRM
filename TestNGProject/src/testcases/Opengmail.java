package testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Opengmail {
	
	@BeforeTest
	public void gmaillogin() 
	
	{
		
		System.out.println("gmail login test");
	}
	
	@AfterTest
    public void gmaillogout() 
    
    {
    System.out.println("gmail logout test");	
    	
    }

	@BeforeSuite
	public void launchgmail() 
	{
		
		System.out.println("launch gmail app");
		
	}
	
	@AfterSuite
	public void closeapp() 
	
	{
		
		System.out.println("close app");
	}

}
