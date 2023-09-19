package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class Registration  {
	
//	private static final WebElement EmailError = null;

//	private static final WebElement UserNameError = null;

	public static WebDriver driver;
	
	@FindBy(id= "inputUsername")
	private WebElement username;
	
	@FindBy(id = "inputEmail")
	private WebElement emailid;
	
	@FindBy(id = "inputPassword1")
	private WebElement password;
	
	@FindBy(id ="inputPassword2")
	private WebElement passwordrenter;
	
	@FindBy(xpath = "//input[@name= 'tos']")
	private WebElement checkbox;
	
	@FindBy(id = "submitbtn")
	private WebElement checkbutton;
	
	@FindBy(xpath = "//span[starts-with(text(),'Username not starting with 3 letters')]")
	private WebElement wrongusername;
	 
	@FindBy(xpath = "//span[starts-with(text(),'Enter a valid email address')]")
	private WebElement wrongemail;
	
	@FindBy(xpath = "(//*[@id='inputPassword1']//following::span[@class='error'])[1]")
	private WebElement wrongpassword;
	
	@FindBy(xpath = "(//*[@id='inputPassword2']//following::span[@class='error'])[1]")
	private WebElement wrongrenterpassword;
	
	@FindBy(xpath = "//input[@name = 'tos']//following::span[@class = 'error']")
	private WebElement checkboxerror;
	
	@FindBy(id = "submitbtn")
	private WebElement createaccount;
	
	public Registration() 	
	{
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 4), this);
	}
	
	
	public void userregistration(String username1, String email, String password1)

	{
		try {
			username.sendKeys(username1);
			emailid.sendKeys(email);
			password.sendKeys(password1);
			passwordrenter.sendKeys(password1);
			checkbox.click();
			checkbutton.click();
			
			} catch (Exception e) 
		{
			System.out.println("Exception is: "+e);  //to understand the exception will ask to print "e"
		}
		
	
		
	}

	
	//Generic Method for display
	public boolean isElementDisplayed(WebElement element) {
		boolean flag=false;
		try {
			createaccount.isDisplayed();
			flag =true;
		}catch(Exception e) {
			flag =false;
		}
		return flag;		
	}
	
	
	public void verifyInputErrors() {
		
		if (isElementDisplayed(createaccount)) {
			
			System.out.println("form filled successfully");
			
		}else {
			
			System.out.println("enter valid details");
		}
		
		{ 
			if (wrongusername.getText().equals(""))   
		
		{
			System.out.println("enter correct user name");
		}else {
			System.out.println("username not valid and error displayed as "+wrongusername.getText());
		}
		
		
			if (wrongemail.getText().equals(""))
			
			{
				System.out.println("enter correct email id");
			}else 
			{
				System.out.println("Email not valid and error displayed as "+wrongemail.getText());
			}
			
			if (wrongpassword.getText().equals("")) {
				
				System.out.println("Entered valid Password");
				
			} else {
				System.out.println("password is not valid " +wrongpassword.getText());
			}
			
			if (wrongrenterpassword.getText().equals("")) {
				
				System.out.println("Entered valid Re-Enter Password");
				
			} else {
				
				System.out.println("re enter password is not valid " +wrongrenterpassword.getText());

			}
			
			if (checkboxerror.getText().equals("")) 
			{
				System.out.println("Checked terms & conditions checkBox");	
			} else {
				System.out.println("Unchecked terms & conditions checkBox and error displayed as " +checkboxerror.getText());
			}
		}
	}
	
}





