package seleniumstart;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class Browsertest {

	public static void main(String[] args) throws Exception
	
	{
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 14 pro max" ,Keys.ENTER);
	driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
	driver.getWindowHandle();
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@aria-labelledby=\"attach-sidesheet-checkout-button-announce\"]")).click();
	
	
	
	
	
	}
	
}








