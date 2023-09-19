package BaseUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
public static WebDriver driver;
	
	public WebDriver launchapp() throws Exception 
	
	{
		Properties obj = new Properties(); //to adjust the browser setup from configuration file 
		FileInputStream file = new FileInputStream("C:\\selenium\\Damodar\\src\\main\\resources\\config.properties");
		obj.load(file);
		
		String URL = obj.getProperty("URL");
		String Browser = obj.getProperty("Browser");
		
		if (Browser.equalsIgnoreCase("Chrome")) 
		
		{
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		
		} else if(Browser.equalsIgnoreCase("Firefox"))
		
		{
			WebDriverManager.firefoxdriver();
			driver =  new FirefoxDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
		
	}
	
	

}
