package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutils.Baseclass;

public class Loginpage extends Baseclass{
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement uname;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement pword;
	
	@FindBy(xpath = "//button[normalize-space('Login')]")
	WebElement loginbutton;
	
	
	public Loginpage(WebDriver driver)
	{
		
		super.driver=driver;
		PageFactory.initElements(driver, this); 
	}
	
	public void login() 
	{
		uname.sendKeys("Admin");
		pword.sendKeys("admin123");
		loginbutton.click();
		
	}
	
			

}
