package orangehrm.library;

import java.util.Arrays;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utils.BaseUtils;

public class AdminModuleUtils extends BaseUtils {
	
	String adminuid = "Admin";
	String adminpwd = "Qedge123!@#";
	
	LoginPage lp;

	@BeforeTest	
   public void adminLogin() 

		{
			lp = new LoginPage();
			lp.login(adminuid, adminpwd);
			
			
	    }	
	@AfterTest
	public void adminlogout() {
		
		lp.logout();
	}

}
