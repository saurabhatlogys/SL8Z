package com.SL8Z.testcases;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.utility.TestUtil;

public class Verify_Corresponding_Numbers {
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyCorresponding Numbers"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyCorrespondingNumbers()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	  
		
		//Verifying Action Buttons
		TestUtil.VerifyCorrespondingNumbers();
		
		//Logout from the application
		 TestUtil.logout();
		
	}
}
