package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Loginpage  extends TestBase{


	public Loginpage(WebDriver driver) 

	{
		super.driver = driver;
		PageFactory.initElements( driver, this);
	}


	@FindBy(xpath="//a[text()='Log in']")
	WebElement Login;

	@FindBy(id="Email")
	WebElement emailid;

	@FindBy(id="Password")
	WebElement password;

	@FindBy(id="RememberMe")   
	WebElement RememberMe;

	@FindBy(xpath="//button[text()=\"Log in\"]")
	WebElement loginbutton;




	public void login()  
	{
		emailid.clear();
		emailid.sendKeys("admin@yourstore.com");
		password.clear();
		password.sendKeys("admin");
		RememberMe.click();
		loginbutton.click();

	}	
}
