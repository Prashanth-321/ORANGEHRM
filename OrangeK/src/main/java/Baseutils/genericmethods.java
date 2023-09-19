package Baseutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class genericmethods extends Baseclass{
	
	public void spanselect(WebElement locator) 
	
	{
		WebElement element = driver.findElement((By) locator);
		if(element.isDisplayed()&&element.isEnabled()) 
		{
			element.click();
			
		}
		
		
	}

}
