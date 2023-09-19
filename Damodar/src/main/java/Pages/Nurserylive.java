package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonFunctions.GenericMethods;

public class Nurserylive extends GenericMethods {
	
 
	
	public By Gardening = By.xpath("(//summary[@aria-haspopup='true'])[1]");
	
	public void Garden() 
	
	{
		
		click(driver, Gardening);
	}
	
	

}
