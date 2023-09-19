package Nopcommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
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
				
				@FindBy(xpath="//button[@class=\"button-1 register-button\"]")
				WebElement Registerbutton;
				
				@FindBy(xpath="//input[@id=\"gender-male\"]")
				WebElement maleradio;
				
				@FindBy(xpath="//input[@data-val-required=\"First name is required.\"]")
				WebElement firstname;
				
				@FindBy(xpath="//input[@data-val-required=\"Last name is required.\"]")
				WebElement lastname;
				
				@FindBy(xpath="//select[@name=\"DateOfBirthDay\"]")
				WebElement dated;
				
				@FindBy(xpath="//select[@name=\"DateOfBirthMonth\"]")
				WebElement dateM;
				
				@FindBy(xpath="//select[@name=\"DateOfBirthYear\"]")
				WebElement dateY;
				
				
				@FindBy(xpath="//input[@data-val-required=\"Email is required.\"]")
				WebElement emaildata;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
				
				
				
}
