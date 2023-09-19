package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable extends  Registration {
	
//	public static WebDriver driver;
	
	
	@Test
	public static void testing() {
		
	
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://web2.0calc.com/register/");
		driver.manage().window().maximize();
		
		Registration reg = new Registration();
		reg.userregistration("122", "hw", "pouts@123");
		reg.verifyInputErrors();
		
			
		
	}

}
