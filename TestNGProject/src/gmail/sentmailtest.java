package gmail;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import testcases.Opengmail;

public class sentmailtest extends Opengmail

{
	
	@Parameters({"mailid" , "subject"})
	@Test
	public void gmailsent(String tomail, String subject) 
	
	{
		
		System.out.println("sent gmail test :" +tomail+  " with subject :" +subject);
	}

}
