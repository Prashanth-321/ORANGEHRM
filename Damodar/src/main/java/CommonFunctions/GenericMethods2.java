package CommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericMethods2 {
	
	public static WebDriver driver ;
	/** method used to click the webelement in webpage*/
	public boolean click(WebDriver driver, WebElement elementlocator) {
		
		WebElement element = driver.findElement((By) elementlocator);
		
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
	
	public boolean sendkeys(WebDriver driver, WebElement elementlocator, String text) 

	{
		WebElement element = driver.findElement((By) elementlocator);
		
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
	
	public boolean selectclass(WebDriver driver, WebElement ELementlocator, String visible) 

	{
		WebElement Element =  driver.findElement((By)ELementlocator);
		
		Select sel = new Select(Element);
		
		sel.selectByVisibleText(visible);
//		sel.selectByValue(visible);
		

			
			return true;
			
		}
	public boolean movetoelement(WebDriver driver, WebElement elementlocator) 

	{
	 WebElement Element = driver.findElement((By)elementlocator);
	 
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
	
	

}
