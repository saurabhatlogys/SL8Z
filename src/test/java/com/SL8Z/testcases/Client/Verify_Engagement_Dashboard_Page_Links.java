package com.SL8Z.testcases.Client;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.utility.TestUtil;

public class Verify_Engagement_Dashboard_Page_Links {
	
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyEngagementDashboardPageLinks"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyEngagementDashboardPageLinks()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	  
		
		//Verifying Engagement Dashboard Page Links
		TestUtil.VerifyEngagementDashboardPageLinks();
		
		
	}
}



