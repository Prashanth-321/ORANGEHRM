package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.BaseUtils;
import orangehrm.library.LoginPage;

public class EmplogintestTNG extends BaseUtils

{
	
	@Parameters({"empuid","emppwd"})
	@Test
	public void checkemplogin(String uid, String pwd) 
	
	{
		LoginPage lp = new LoginPage();
		lp.login(uid, pwd);
		boolean res = lp.isempmoduledisplayed();
		Assert.assertTrue(res);
		lp.logout();
	}
	
}
