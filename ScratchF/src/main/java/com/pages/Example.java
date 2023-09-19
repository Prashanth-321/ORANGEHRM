package com.pages;

import java.time.Duration;

import javax.swing.text.Document;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Example {
	
	

	WebDriver driver;
@BeforeClass
public void browser() 

{
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://admin-demo.nopcommerce.com/");
	
}

@Test (priority =1)
public void loginpage1() 

{	
	driver.findElement(By.id("Email")).clear();
	driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	driver.findElement(By.id("Password")).clear();
	
	driver.findElement(By.id("Password")).sendKeys("admin");
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
	
}

	
	@Test (dependsOnMethods  = {"loginpage1"})
	public void registration() throws Exception 
	
	{
		driver.findElement(By.xpath("//i[@class='nav-icon far fa-user']//following-sibling::p")).click();
		driver.findElement(By.xpath("//p[text()=' Customers']")).click();
		driver.findElement(By.xpath("//i[@class=\"fas fa-plus-square\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("prashan_23@yopmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Hello@123");
		driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Prashanth");
		driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("ghule");
		driver.findElement(By.xpath("//input[@id=\"Gender_Male\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"DateOfBirth\"]")).sendKeys("3/23/1995");
		driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Quality thought");
		driver.findElement(By.xpath("//input[@id=\"IsTaxExempt\"]")).click();
		
		
		driver.findElement(By.xpath("//ul[@id='SelectedNewsletterSubscriptionStoreIds_taglist']/..")).click();
		driver.findElement(By.xpath("//li[text()='Your store name']")).click();
		
		
		
		driver.findElement(By.xpath("//option[text()='Administrators']/../..")).click();
		driver.findElement(By.xpath("//li[text()='Administrators']")).click();
		
		
		/*
		 * new WebDriverWait(driver,Duration.ofSeconds(80)).until(ExpectedConditions.
		 * elementToBeClickable(driver.findElement(By.
		 * xpath("//select[@class='form-control valid']"))));
		 * driver.findElement(By.xpath("//span[@data-valmsg-for='VendorId']")).click();
		 * driver.findElement(By.xpath("//option[text()='Vendor 1']")).click();
		 */
		
		
		
		 Select mv = new Select(driver.findElement(By.xpath("//select[@class='form-control valid']")));
		 mv.selectByVisibleText("Vendor 1");
		 

		
		driver.findElement(By.xpath("//textarea[@id=\"AdminComment\"]")).sendKeys("Hello world");
		
		driver.findElement(By.xpath("(//button[ @type=\"submit\"])[2]")).click();
		
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(null)));
		
		}
	@AfterClass
	public void closebrowser() 
	
	{
		
		driver.quit();
	}
	
}



