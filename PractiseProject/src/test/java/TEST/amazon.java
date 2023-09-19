package TEST;


import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class amazon {
	
	public static void main(String[] args) throws Exception {
		
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone 14 pro max" ,Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
		
		String parentw =driver.getWindowHandle();
		
		
		Set<String>	wh = driver.getWindowHandles();
		List<String> wh1 = new ArrayList(wh);
		String newtab = wh1.get(1);
		
		driver.switchTo().window(newtab);
		
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		
		driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]")).click();
	
		Thread.sleep(3000);
		
//		TakesScreenshot ts = (TakesScreenshot)driver;  //interface
//		File file = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("C:\\selenium\\PractiseProject\\Screenshots\\test.png"));
		driver.switchTo().window(parentw);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		Actions actions = new Actions(driver);

        // Simulate a Ctrl+Click (or Command+Click on Mac) to open the link in a new tab
        actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
        Thread.sleep(5000);
        driver.switchTo().window(newtab);
		
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.pollingEvery(Duration.ofSeconds(5));
        
        Actions ac = new Actions(driver);
        
        ac.contextClick().build().perform();
        
        
        driver.findElement(By.xpath("//a[text()='Amazon miniTV']")).sendKeys(Keys.ENTER);
        
       
        
        
       }
	
}
