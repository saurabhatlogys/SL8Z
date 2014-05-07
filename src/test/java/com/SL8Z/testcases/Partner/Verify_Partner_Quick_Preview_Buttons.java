package com.SL8Z.testcases.Partner;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.base.TestBase;
import com.SL8Z.utility.TestUtil;

public class Verify_Partner_Quick_Preview_Buttons extends TestBase {
	
        
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyPartnerQuickPreviewButtons"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyPartnerQuickPreviewButtons()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login_Partner();	  
		
		//Verifying Quick Preview Buttons
		TestUtil.VerifyPartnerQuickPreviewButtons();
		
		//Logout from the application
		 TestUtil.logout();
	}
}
