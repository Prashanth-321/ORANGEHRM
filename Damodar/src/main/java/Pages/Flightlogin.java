package Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonFunctions.GenericMethods;

public class Flightlogin extends GenericMethods{
	
	public By exptitle = By.xpath("(//a[@href='http://flights.qedgetech.com/user/patel.html'])[2]");
	
	

	public By username = By.xpath("//input[@type='email']");
	public By password = By.xpath("//input[@type='password']");
	public By loginbutton = By.xpath("//button[@type='submit']");
	
	
	public By register = By.xpath("//a[text() ='Register ']");
	public By usernamereg = By.xpath("//input[@id ='name']");
	public By contactnum = By.xpath("//input[@id ='contact']");
	public By emailid = By.xpath("//input[@id ='email']");
	public By passwordreg = By.xpath("//input[@id ='address']");
	public By gender = By.xpath("//select[@name ='gender']");
	public By DOB = By.xpath("//input[@name ='dob']");
	public By Checkbox = By.xpath("//input[@type ='checkbox']");
	public By Registerconfirm = By.xpath("//input[@type ='submit']");
	
	
	
	public void login(WebDriver driver) throws InterruptedException 
	
	{ 
		Thread.sleep(5000); 
		sendkeys(driver, username, "ramesh1232@gmail.com");
		sendkeys(driver, password, "demo123");
		click(driver, loginbutton);
		//System.out.println(gettext(driver, exptitle));
		
	
	}
	
	public void registration(WebDriver driver) throws InterruptedException 
	
	{
		click(driver, register);
		sendkeys(driver, usernamereg, "patel");
		sendkeys(driver, contactnum, "98766345674");
		sendkeys(driver, emailid, "ramesh1232@gmail.com");
		sendkeys(driver, passwordreg, "demo123");
		selectclass(driver, gender, "Male");
		sendkeys(driver, DOB,"03-08-1999");
		click(driver, Checkbox);
		click(driver, Registerconfirm);
			
		
		
	}
	

}


