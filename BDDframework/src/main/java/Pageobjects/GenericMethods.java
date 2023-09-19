package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods {
	
//public static WebDriver driver ;
	
	/** method used to click the webelement in webpage*/
	
	public boolean click(WebDriver driver, By elementlocator) {
		
	WebElement element =	driver.findElement(elementlocator);
		
		if (element.isDisplayed() & element.isEnabled()) {
			try {
				element.click();
				return true;
				
			} catch (Exception e) 
			{
				return false;
			}
			
		} else 
		{
			return false;
		}
		
		}
	
public boolean sendkeys(WebDriver driver, By Elementlocator, String text) 

{
	WebElement element = driver.findElement(Elementlocator);
	
	if (element.isDisplayed() & element.isEnabled()) 
	{
		try {
			
			element.sendKeys(text);
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}else 
	{
		return false;
	}
	
	
	}

public boolean movetoelement(WebDriver driver, By elementlocator) 

{
 WebElement Element = driver.findElement(elementlocator);
 
 if (Element.isDisplayed() & Element.isEnabled()) 
 
 {
	try {
		Actions action = new Actions(driver);
		action.moveToElement(Element);
		return true;
		
		
	} catch (Exception e) 
	{
		return false;

	}
 }
 else {
	 return false;
	 }
	
}

public boolean selectclass(WebDriver driver, By Dropdown, String visible) 

{
	WebElement Element =  driver.findElement(Dropdown);
	
	Select sel = new Select(Element);
	
	sel.selectByVisibleText(visible);
//	sel.selectByValue(visible);
	

		
		return true;
		
	}



public String gettext(WebDriver driver, By Elementlocator) 

{
	WebElement Element = driver.findElement(Elementlocator);
	
	String value = "";
	
	try {
		
		value = Element.getText();
		
	} catch (Exception e) {
		return null;
	}
	
	
	
	return value;
	
}
public String gettitle(WebDriver driver, By Elementlocator) 
{
	WebElement Element = driver.findElement(Elementlocator);
	
	return driver.getTitle();
}	

}


