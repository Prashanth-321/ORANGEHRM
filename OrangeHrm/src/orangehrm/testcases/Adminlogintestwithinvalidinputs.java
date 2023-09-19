package orangehrm.testcases;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;

public class Adminlogintestwithinvalidinputs {
	
	public static void main(String[] args) {
		
		BaseUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("aaa", "lll");
		boolean result = lp.invaliddisplayed();
		
		if (result) {
			
			System.out.println("login failed for invalid data");
		}else
			
		{
			System.out.println("test fail");
		}
		
	  BaseUtils.closeapp();
		
	}

}
