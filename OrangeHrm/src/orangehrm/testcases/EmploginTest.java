package orangehrm.testcases;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;

public class EmploginTest {

	
	public static void main(String[] args) 
	
	{
		
	BaseUtils.launchApp("http://orangehrm.qedgetech.com");	
	
	LoginPage lp = new LoginPage();
	lp.login("kajal432", "Laddu@321");
	boolean res =  lp.isempmoduledisplayed();
	
	if (res) 
	{
		System.out.println("testpass");
		lp.logout();
		
	}else {
		
		System.out.println("test fail");
	}

	}

}
