package com.SL8Z.testcases.Partner;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.base.TestBase;
import com.SL8Z.utility.TestUtil;

public class Verify_Partner_Client_Side_Validation extends TestBase {

	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyPartnerClientSideValidation"))
		throw new SkipException("Runmode set to No");
	
	}
	@Test
	public void VerifyPartnerClientSideValidation()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login_Partner();;	
		
		// Verifying client side validation
		 TestUtil.Verify_Partner_Client_Side_Validation();
		 
		 //Logout from the application
		 TestUtil.logout();
	}
}
