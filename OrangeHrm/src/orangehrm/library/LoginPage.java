package orangehrm.library;

import org.openqa.selenium.By;

import Utils.BaseUtils;

public class LoginPage extends BaseUtils  // multiple inheritance cant be supported by java for security

{
	public void login(String uid, String pwd ) 
	
	{
	
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
	public boolean isAdminmoduledisplay()
	{
		if (driver.findElement(By.linkText("Admin")).isDisplayed()) 
		
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void logout()
    {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		}
	public boolean invaliddisplayed() 
	{
	String errmsg;	
		errmsg = driver.findElement(By.id("spanMessage")).getText().toLowerCase();
		
		if (errmsg.contains("invalid")) {
			
			return true;
			
		}else {
			
			return false;
		}
	}
	
	public boolean isempmoduledisplayed()
	{
		boolean res;
		try {
			
			driver.findElement(By.linkText("Admin"));
			res = false;
			
		} catch (Exception e) {

			res = true;
		}
		return res;
	}
	
}























 	