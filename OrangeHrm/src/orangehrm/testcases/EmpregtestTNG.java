package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminModuleUtils;
import orangehrm.library.Employee;

public class EmpregtestTNG extends AdminModuleUtils

{
	@Parameters({"fname","lname"})
	@Test
	public void checkEmpreg(String fname, String lname) 
	{
		Employee emp = new Employee();
		boolean res = emp.additionofemployee(fname, lname);
		Assert.assertTrue(res);
		
		
	}
	

}
