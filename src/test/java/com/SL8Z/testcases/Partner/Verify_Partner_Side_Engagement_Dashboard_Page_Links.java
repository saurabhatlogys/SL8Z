package com.SL8Z.testcases.Partner;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.SL8Z.utility.TestUtil;

public class Verify_Partner_Side_Engagement_Dashboard_Page_Links {
	
	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_VerifyPartnerSideEngagementDashboardPageLinks"))
		throw new SkipException("Runmode set to No");
	}
	@Test
	public void VerifyPartnerSideEngagementDashboardPageLinks()
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login_Partner();  
		
		//Verifying Engagement Dashboard Page Links
		TestUtil.VerifyPartnerSideEngagementPageLinks();
		
		
	}
}

