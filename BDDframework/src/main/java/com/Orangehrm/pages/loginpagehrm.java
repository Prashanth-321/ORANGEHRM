package com.Orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Nopcommerce.Baseclass;

public class loginpagehrm extends Baseclass{
			
				@FindBy(xpath = "//input[@name='username']")
				WebElement uname;
				
				@FindBy(xpath = "//input[@name='password']")
				WebElement pword;
				
				@FindBy(xpath = "//button[normalize-space('Login')]")
				WebElement loginbutton;
				
				
				
				
	

}
