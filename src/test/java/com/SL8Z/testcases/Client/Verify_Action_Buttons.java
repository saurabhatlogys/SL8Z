package com.SL8Z.testcases.Client;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SL8Z.utility.TestUtil;

public class Verify_Action_Buttons {
	
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyActionButtons"))
		throw new SkipException("Runmode set to No");
	}
	@Test(dataProvider ="getData")
	public void VerifyActionButtons(String PositionTitle)
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	  
		
		//Verifying Action Buttons
		TestUtil.VerifyActionButtons(PositionTitle);
		
		//Logout from the application
		 TestUtil.logout();
		
	}

	@DataProvider
	public Object[][] getData() {
		
		return TestUtil.getData("Job Position");
	}
}
