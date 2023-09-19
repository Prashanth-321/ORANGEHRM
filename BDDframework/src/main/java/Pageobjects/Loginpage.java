package Pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import StepDefinations.LoginSteps;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginpage extends GenericMethods{

public static WebDriver driver ;
		
		public By title = By.xpath("//title[text()='Flight Reservation | Dashboard']");

		public By username = By.xpath("//input[@type='email']");
		public By password = By.xpath("//input[@type='password']");
		public By loginbutton = By.xpath("//button[@type='submit']");
		
		public By clikonset = By.xpath("//i[@class='fa fa-gear']");
		public By logoutbutton = By.xpath("//a[text()=' Logout']");
		
		
		
		public By register = By.xpath("//a[text() ='Register ']");
		public By usernamereg = By.xpath("//input[@id ='name']");
		public By contactnum = By.xpath("//input[@id ='contact']");
		public By emailid = By.xpath("//input[@id ='email']");
		public By passwordreg = By.xpath("//input[@id ='address']");
		public By gender = By.xpath("//select[@name ='gender']");
		public By DOB = By.xpath("//input[@name ='dob']");
		public By Checkbox = By.xpath("//input[@type ='checkbox']");
		public By Registerconfirm = By.xpath("//input[@type ='submit']");
		
		public Loginpage(WebDriver rdriver) 
		
		{
			driver = rdriver;
			PageFactory.initElements(new AjaxElementLocatorFactory(driver,4),this);
		}
		
		public void openurl(String url) 
		{
			
			WebDriverManager.edgedriver();
			driver=new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		public void setusernamepassword(String tunam, String tpass) 
		{
			sendkeys(driver, username, tunam);
			sendkeys(driver, password, tpass);
			
		}
		public void clicklogin() 
		
		{
			click(driver, loginbutton);
			
		}
		public void homepage() 
		{
		
			
			gettitle(driver, title);
			
			String actual = driver.getTitle();
			String excep = "Flight Reservation | Dashboard";
			
			Assert.assertTrue(actual.contains(excep));
			
		//	Assert.assertEquals(excep, actual);
		
			
			
		}
		
    public void clicklogout() 
		
		{
			click(driver, logoutbutton);
			
		}

}


		
		

