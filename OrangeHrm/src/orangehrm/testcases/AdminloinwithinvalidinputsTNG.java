package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;

public class AdminloinwithinvalidinputsTNG extends BaseUtils{
	
	@Parameters({"uid", "pwd"})
	@Test
	public void checkAdminlogin(String uid, String pwd) 
	
	{
		
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		
		boolean res = lp.invaliddisplayed();
		Assert.assertTrue(res);
	
		
	}

}
