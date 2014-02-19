package com.SL8Z.testcases;


import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SL8Z.base.TestBase;
import com.SL8Z.utility.TestUtil;


public class Create_New_Search extends TestBase {
	

	@BeforeTest
	public void isSkipped(){
		
		if(TestUtil.isSkip("Test_CreateNewSearch"))
		throw new SkipException("Runmode set to No");
		
	}
	
	@Test (dataProvider ="getData")
	public void CreateNewSearch(String PositionTitle)
	{
		//Navigate to Home Page
		TestUtil.SL8Z_Homepage();
		
		//Log into the application
		TestUtil.Login();	
		
	 //Create New Search
	 TestUtil.Create_New_Search(PositionTitle);
	 
	//Logout from the application
	 TestUtil.logout();
	}
	
	@DataProvider
	public Object[][] getData() {
		
		return TestUtil.getData("Job Position");
	}

	
}
