package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;

public class AdminlogintestwithvalidinputsTNG extends BaseUtils {
	
	@Parameters({"adminuid", "adminpwd"})
	@Test
	public void checkadminloginTng(String uid, String pwd) 
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean rs = lp.isAdminmoduledisplay();
		Assert.assertTrue(rs);
		lp.logout();
	
		
	}

}
