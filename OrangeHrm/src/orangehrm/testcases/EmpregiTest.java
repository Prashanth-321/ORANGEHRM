package orangehrm.testcases;

import Utils.BaseUtils;
import orangehrm.library.Employee;
import orangehrm.library.LoginPage;

public class EmpregiTest {

	public static void main(String[] args) {
		
		BaseUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		boolean res = emp.additionofemployee("kajal", "Demo");
		if (res) {
		
			System.out.println("new employee registered successfully");
		}else {
			System.out.println("new emp reg failed");
		}
		
		lp.logout();
		BaseUtils.closeapp();
	}

}
