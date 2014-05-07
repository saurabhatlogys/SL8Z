package com.SL8Z.testcases.Client;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.base.TestBase;
import com.SL8Z.utility.TestUtil;

public class Verify_Quick_Preview_Buttons extends TestBase {
	
        
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyQuickPreviewButtons"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyQuickPreviewButtons()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	  
		
		//Verifying Quick Preview Buttons
		TestUtil.VerifyQuickPreviewButtons();
		
		//Logout from the application
		 TestUtil.logout();
	}
}
