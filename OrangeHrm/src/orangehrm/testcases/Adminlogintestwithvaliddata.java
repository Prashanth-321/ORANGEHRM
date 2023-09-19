package orangehrm.testcases;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;

public class Adminlogintestwithvaliddata {
	
	
	public static void main(String[] args) {
		
		
		BaseUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		boolean result = lp.isAdminmoduledisplay();
		if (result) {
			
			System.out.println("admin login test pass with valid inputs");
			
		}else
			
		{
			System.out.println("test fail");
		}
		
		lp.logout();
		BaseUtils.closeapp();
		
	}
	

}