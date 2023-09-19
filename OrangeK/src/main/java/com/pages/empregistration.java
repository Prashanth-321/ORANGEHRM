package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseutils.Baseclass;

public class empregistration extends Baseclass{
	
			@FindBy(xpath = "//span[text()='PIM']")
			WebElement PIM;
			
			@FindBy(xpath = "//div[@class='orangehrm-header-container']")
			WebElement addbutton;
			
			@FindBy(xpath = "//input[@name='firstName']")
			WebElement firstname;
			
			@FindBy(xpath = "//input[@name='lastName']")
			WebElement lastname;
			
			@FindBy(xpath = "(//input[@class=\"oxd-input oxd-input--active\"])[2]")
			WebElement empid;
			
			@FindBy(xpath = "//label[text()='License Expiry Date']//following::input[@placeholder='yyyy-mm-dd'][1]")
			WebElement licencydate;
			
			@FindBy(xpath = "//span[text()='Afghan']")
			WebElement qualifications;
			
			@FindBy(xpath = "//label[text()='License Expiry Date']//following::input[@placeholder='yyyy-mm-dd'][2]")
			WebElement dob;
			
			@FindBy(xpath = "//*[text()='Male']")
			WebElement gender;
			
			@FindBy(xpath = "//span[text()='Single']")
			WebElement maritalstatus;
			
			@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-form-hint']//following-sibling::button")
			WebElement savebutton;
			
			
			
			public empregistration(WebDriver driver)
			{
				
				super.driver=driver;
				PageFactory.initElements(driver, this); 
			}
			
			public void pimdetails() 
			{
				PIM.click();
				addbutton.click();
				firstname.sendKeys("hello");
				lastname.sendKeys("dam");
				empid.clear();
				empid.sendKeys("54321");
				licencydate.sendKeys("2024-10-19");
				qualifications.click();
				dob.sendKeys("1995-12-23");
				maritalstatus.click();
				savebutton.click();
				
				
			}
			
			
}