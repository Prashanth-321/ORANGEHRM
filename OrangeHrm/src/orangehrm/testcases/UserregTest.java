package orangehrm.testcases;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;
import orangehrm.library.User;

public class UserregTest {

	public static void main(String[] args) throws InterruptedException {
		
		BaseUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		User us = new User();
		
		boolean res = us.adduser("Admin", "kajal Demo", "kajal432", "Laddu@321");
		if (res) {
			
			System.out.println("new registration test pass");
			
		}else {
			
			System.out.println("test fail");
		}
		
		lp.logout();
		BaseUtils.closeapp();

	}

}
