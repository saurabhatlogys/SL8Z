package com.SL8Z.testcases.Client;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.base.TestBase;
import com.SL8Z.utility.TestUtil;

public class Verify_Server_Side_Validation extends TestBase{
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyServerSideValidation"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyServerSideValidation()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	 
		
		//Verifying Server Side Validation
		 TestUtil.Verify_Server_Side_Validation();
		 
		//Logout from the application
		 TestUtil.logout();
	}
}
