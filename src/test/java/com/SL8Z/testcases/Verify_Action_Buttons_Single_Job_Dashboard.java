package com.SL8Z.testcases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.utility.TestUtil;

public class Verify_Action_Buttons_Single_Job_Dashboard {

	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyActionButtonsSingleJobDashboard"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyActionButtonsSingleJobDashboard()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	  
		
		//Verifying Action Buttons
		TestUtil.VerifyActionButtonsSingleJobDashboard();
		
		//Logout from the application
		 TestUtil.logout();
		
	}
}
