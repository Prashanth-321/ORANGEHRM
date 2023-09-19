package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseUtils.Browser;
import Pages.Flightlogin;

public class flightloginexecution extends Browser {
	
	Flightlogin flogin = new Flightlogin();
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() throws Exception 
	
	{
		driver = launchapp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
	}
	
	@Test(priority = 2)
	public void frlogin() throws InterruptedException 
	
	{
		flogin.login(driver);
		SoftAssert S = new SoftAssert();
		S.assertEquals(flogin.gettext(driver, flogin.exptitle), "Flight Reservation");
		S.assertAll();
	}
	
	@Test(priority=1)
	public void registrationexe() throws InterruptedException 
	
	{
		flogin.registration(driver);
		
		
	}

}
