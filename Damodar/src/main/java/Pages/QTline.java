package Pages;

import org.openqa.selenium.By;

import CommonFunctions.GenericMethods;

public class QTline extends GenericMethods{
	
	public By username = By.xpath("//input[@type ='email']");
	public By password = By.xpath("//input[@type ='text']");
	public By Adminsign = By.xpath("//input[@type ='submit']"); 
	
	

}
