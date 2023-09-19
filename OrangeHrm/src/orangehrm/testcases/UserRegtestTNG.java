package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminModuleUtils;
import orangehrm.library.User;

public class UserRegtestTNG extends AdminModuleUtils

{
	
	@Parameters({"role","empname","uname","pword"})
	@Test
	public void checkUserreg(String role, String empname, String uname, String pword) throws InterruptedException 
	{
		User use = new User();
		boolean res = use.adduser(role, empname, uname, pword);
		Assert.assertTrue(res);
		
	}
	
}
