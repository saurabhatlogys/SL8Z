package com.SL8Z.utility;



import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import com.SL8Z.base.TestBase;


public class TestUtil extends TestBase{
	

	
public static void sleep(int intSeconds){
		
		try{
			Thread.sleep(1000*intSeconds);
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	
	public static void SL8Z_Homepage(){
		
		try{
			 driver.navigate().to(config.getProperty("testSiteURL"));
			 Reporter.log("Navigated to QA Server");
				
		}catch(Exception e){
			
			e.printStackTrace();
			Assert.fail("This script is failing");
		}
	}
		
		public static void Login(){
			
			try{
				  //Click on Login Link
				  Assert.assertTrue(TestUtil.click("Lnk_Login"),"Login link is not working");
				  Reporter.log("Clicked on Login Link");
				  //Logged as Client
				  Assert.assertTrue(TestUtil.setText("Txt_Username", config.getProperty("Username")),"Username text box does not exist");
				  Assert.assertTrue(TestUtil.setText("Txt_Password", config.getProperty("Password")),"Password text box does not exist");
				  Assert.assertTrue(TestUtil.click("btn_Submit"),"Submit button does not working");
				  Reporter.log("Clicked on Login button");
					
			}catch(Exception e){
				
				e.printStackTrace();
				Assert.fail("This script is failing");
			}
	}
		public static void logout()
		{
			Assert.assertTrue(TestUtil.click("btn_logout"),"Logout button does not working");
			Reporter.log("Clicked on logout button");
			//TestUtil.click("btn_yes");
		}

		public static void Create_New_Search(String PositionTitle)
		{
			  //Click on Job Posting
			  TestUtil.click("btn_job_posting");
			  Reporter.log("Clicked on job posting button");
			  //Basic Information Tab
			  TestUtil.click("tab_basic_information");
			  Reporter.log("Clicked on Basic Information Tab");
			  // Position Title
			  TestUtil.setText("Txt_Position_Title",PositionTitle);
			  Reporter.log("Entered Postion Title");
			  // Position Metro Area
			  TestUtil.setText("Txt_Position_Metro_Area","Bangalore");
			  TestUtil.sleep(2);
			  driver.findElement(By.xpath("//input[@id='location_metro_area']")).sendKeys(Keys.DOWN);
			  // Reports to
			  TestUtil.setText("Txt_Reports_To", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ae");
			  Reporter.log("Entered Reports to");
			  // Internal ID
			  TestUtil.setText("Txt_Internal_Id", "098765432112");
			  Reporter.log("Entered Internal ID");
			  //New role
			  TestUtil.selectValueInDropDown("Select_New_Role", "Yes");
			  Reporter.log("Selected new role");
			  //Reason for the Position
			  TestUtil.setText("Txt_Reason_For_Position", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor");
			  Reporter.log("Entered Reason for the Position");
			  //Job Details Tab
			  TestUtil.click("tab_job_details");
			  Reporter.log("Clicked on Job Details Tab");
			  //Function category
			  TestUtil.selectValueInDropDown("Select_Function_Category", "Technology");
			  Reporter.log("Entered Function category");
			  //Position Summary
			  driver.switchTo().frame("position_summary_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Postion_Summary"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Position Summary");
			  //Duties and Responsibilities
			  driver.switchTo().frame("duties_responsibilities_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Position_Duties_Responsibilities"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Duties and Responsibilities");
			  //Position Requirements
			  driver.switchTo().frame("position_requirements_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Requirements"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Position Requirements"); 
			  //Candidate Calibration Tab
			  TestUtil.click("tab_Candidate_Calibration");
			  Reporter.log("Clicked on Candidate Calibration Tab");
			  //Ideal candidate profile
			  driver.switchTo().frame("ideal_candidate_profile_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Ideal_Candidate_profile"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Ideal candidate profile");
			  //Target Companies
			  TestUtil.setText("Txt_Target_Company", config.getProperty("Target_Company"));
			  Reporter.log("Entered Target Company");
			  TestUtil.click("btn_add_comapny");
			  TestUtil.setText("Txt_Target_Company_1", config.getProperty("Target_Company"));
			  Reporter.log("Entered Target Company 1");
			  TestUtil.click("btn_add_comapny");
			  TestUtil.setText("Txt_Target_Company_1", config.getProperty("Target_Company"));
			  Reporter.log("Entered Target Company 2");
			  //Do not Contact Companies
			  TestUtil.setText("Txt_Do_Not_Contact_Company",config.getProperty("Target_Company"));
			  Reporter.log("Entered Do not Contact Company");
			  TestUtil.click("btn_add_do_not_company");
			  TestUtil.setText("Txt_Do_Not_Contact_Company_1",config.getProperty("Target_Company"));
			  Reporter.log("Entered Do not Contact Company 1");
			  TestUtil.click("btn_add_do_not_company");
			  TestUtil.setText("Txt_Do_Not_Contact_Company_2",config.getProperty("Target_Company"));
			  Reporter.log("Entered Do not Contact Company 2");
			  //Corporate Culture Tab
			  TestUtil.click("tab_Corporate_Culture");
			  Reporter.log("Clicked on Corporate Culture Tab");
			  // Corporate Culture and Team Fit
			  TestUtil.selectValueInDropDown("Select_Corporate_Culture", "Dependable–focus on process, slow to change");
			  Reporter.log("Selected Corporate Culture and Team Fit");
			  //Detail culture description
			  driver.switchTo().frame("unique_corporation_aspects_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Corporate_Culture_Description"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Detail culture description"); 
			  //Hiring Manager information
			  driver.switchTo().frame("hiring_manager_info_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Hiring_Manager_information"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Hiring Manager information");
			  //Selling Points Tab
			  TestUtil.click("tab_Selling_Point");
			  Reporter.log("Clicked on Selling Points Tab");
			  // Selling Points
			  TestUtil.setText("Txt_Selling_Point", config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 1");
			  TestUtil.setText("Txt_Selling_Point_1", config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 2");
			  TestUtil.setText("Txt_Selling_Point_2", config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 3");
			  TestUtil.click("btn_add_selling_point");
			  TestUtil.setText("Txt_Selling_Point_3", config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 4");
			  TestUtil.click("btn_add_selling_point");
			  TestUtil.setText("Txt_Selling_Point_4", config.getProperty("Selling_Point"));
			  Reporter.log("Entered Selling Point 5");
			  //Comments
			  driver.switchTo().frame("comments_ifr");
			  driver.switchTo().activeElement().sendKeys(config.getProperty("Comments"));
			  driver.switchTo().defaultContent();
			  Reporter.log("Entered Comments/Other Information");
			  //Compensation Tab 
			  TestUtil.click("tab_compensation");
			  Reporter.log("Clicked on Compensation Tab"); 
			  //Min Base salary
			  TestUtil.setText("Txt_Min_Sal", config.getProperty("MinSal"));
			  Reporter.log("Entered Min Base salary");
		      //Max Base salary
			  TestUtil.setText("Txt_Max_Sal", config.getProperty("MaxSal"));
			  Reporter.log("Entered Max Base salary"); 
			  //Bonus %
			  TestUtil.setText("Txt_Bonus", config.getProperty("Bonus"));
			  Reporter.log("Entered Bonus %");
			  //Other compensation details
			  TestUtil.setText("Txt_other_comp_info", config.getProperty("Other_Comp_Info"));
			  Reporter.log("Entered Other compensation details");
			  //Health Insurace
			  TestUtil.setText("Txt_Health_Insurance", config.getProperty("Other_Comp_Info"));
			  Reporter.log("Entered Health Insurace Details");
			  //Other benefit details
			  TestUtil.setText("Txt_other_benfit_detail", config.getProperty("Other_Comp_Info"));
			  Reporter.log("Entered Other benefit details");
			  // Set Your Fee Tab
			  TestUtil.click("tab_set_your_placement_fee");
			  Reporter.log("Clicked on Set Your Fee Tab");
			  TestUtil.setText("Txt_Placement_Fee", config.getProperty("Placement_Fee"));
			  //Activate Search Tab
			  TestUtil.click("Txt_Activate_Search");
			  Reporter.log("Clicked on Activate Search Tab");
			  TestUtil.click("btn_activate_button");
			  Reporter.log("Clicked on Activate Search Button");
			  TestUtil.sleep(2);
			  TestUtil.click("btn_no");
			  TestUtil.sleep(4);
		}
	
		public static void Verify_Client_Side_Validation()
		{
			  
		 
			 // Set Pre-filled text into the variables
			 Assert.assertTrue(TestUtil.click("Lnk_Profile"),"Profile link is not working");
             
			 //Scrolling to the web element
			 WebElement element = TestUtil.getObject("Txt_Short_Description");
			 Coordinates coordinate = ((Locatable)element).getCoordinates(); 
			 coordinate.onPage(); 
			 coordinate.inViewPort();
			 TestUtil.sleep(8);
			 // Set short description
			 String shortdesc=TestUtil.getObject("Txt_Short_Description").getText();
			 
			 driver.switchTo().frame("ClientDetailedCompanyDescription_ifr");
			 // Set Detailed Information
			 String DetailedInfo= driver.switchTo().activeElement().getText();
			 driver.switchTo().defaultContent();
			 
       		 //Click on Job Posting
			  Assert.assertTrue(TestUtil.click("btn_new_posting"),"Job Posting button does not working");
			  Reporter.log("Clicked on job posting button");
			  
			  //Verify pre-filled text i.e, short description and detailed Information
			  Assert.assertTrue(TestUtil.getObject("Txt_Short_Description").getText().equals(shortdesc), "Verified short description field is not pre-filled");
			  Reporter.log("Verified short description field is pre-filled");
			  
			  driver.switchTo().frame("detailed_company_description_ifr");
			  Assert.assertTrue(driver.switchTo().activeElement().getText().equals(DetailedInfo),"Verified detailed description field is not pre-filled");	  
			  driver.switchTo().defaultContent();
			 
			  //Basic Information Tab
			  Assert.assertTrue(TestUtil.click("tab_basic_information"),"Basic Information tab is not working");
			  Reporter.log("Clicked on Basic Information Tab");
			  
			  // Position Title
			  Assert.assertTrue(TestUtil.setText("Txt_Position_Title","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ae"),"Position title text box does not exist");
			  Reporter.log("Entered Postion Title");
			  
			  //Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Position_Title").getText().equals("60/60"),"Client side validation failed for position title");
			  Reporter.log("Verified client side validation for position title is 60/60");
			  
			  // Reports To
			  Assert.assertTrue(TestUtil.setText("Txt_Reports_To", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Ae"),"Reports To text box does not exist");
			  Reporter.log("Entered Reports To");
			  
			  //Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Report_To").getText().equals("60/60"),"Client side validation failed for Reports To");
			  Reporter.log("Verified client side validation for Reports To is 60/60");
			
			  // Internal ID
			  Assert.assertTrue(TestUtil.setText("Txt_Internal_Id", "098765432112"),"Internal ID text box does not exist");
			  Reporter.log("Entered Internal ID");
			  
			  //Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Internal_Id").getText().equals("12/12"),"Client side validation failed for Internal Id");
			  Reporter.log("Verified client side validation for Internal Id is 12/12");
			
			  //Reason for the Position
			  Assert.assertTrue(TestUtil.setText("Txt_Reason_For_Position", "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor"),"Reason for the Position text box does not exist");
			  Reporter.log("Entered Reason for the Position");
			  
			  //Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Reason_Position").getText().equals("90/90"),"Client side validation failed for Reason for the Position");
			  Reporter.log("Verified client side validation for Reason for the Position is 90/90");
			
			  //Candidate Calibration Tab
			  Assert.assertTrue(TestUtil.click("tab_Candidate_Calibration"),"Candidate Calibration Tab is not working");
			  Reporter.log("Clicked on Candidate Calibration Tab");
			  
			  //Target Companies
			  Assert.assertTrue(TestUtil.setText("Txt_Target_Company", config.getProperty("Target_Company")),"Target Companies text box does not exist");
			  Reporter.log("Entered Target Company");
			  
			  //Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Target_Comapny").getText().equals("45/45"),"Client side validation failed for Target Company");
			  Reporter.log("Verified client side validation for Target Company is 45/45");
			  
			  //Do not Contact Companies
			  Assert.assertTrue(TestUtil.setText("Txt_Do_Not_Contact_Company",config.getProperty("Target_Company")),"Do not Contact Company text box does not exist");
			  Reporter.log("Entered Do not Contact Company");
			  
			  // Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Do_Not_Contact_Comapny").getText().equals("45/45"),"Client side validation failed for Do not Contact Company");
			  Reporter.log("Verified client side validation for Do not Contact Company is 45/45");
			  
			  //Selling Points Tab
			  Assert.assertTrue(TestUtil.click("tab_Selling_Point"),"Selling Point Tab is not working");
			  Reporter.log("Clicked on Selling Points Tab");
			  
			  // Selling Point
			  Assert.assertTrue(TestUtil.setText("Txt_Selling_Point", config.getProperty("Selling_Point")),"Selling Point text box does not exist");
			  Reporter.log("Entered Selling Point 1");
			  
			  // Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Selling_point").getText().equals("140/140"),"Client side validation failed for Selling Point Company");
			  Reporter.log("Verified client side validation for Selling Point is 140/140");
			 
			  //Compensation Tab 
			  Assert.assertTrue(TestUtil.click("tab_compensation"),"Compensation Tab is not working");
			  Reporter.log("Clicked on Compensation Tab"); 
			  
			  //Min Base salary
			  Assert.assertTrue(TestUtil.setText("Txt_Min_Sal", config.getProperty("MinSal")),"Minimum salary text box does not exist");
			  Reporter.log("Entered Min Base salary");
			  TestUtil.sleep(2);
			  
			  // Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Min_Base_Salary").getText().equals("11/12"),"Client side validation failed for Min Base salary");
			  Reporter.log("Verified client side validation for Min Base salary is 11/12");
			  
		      //Max Base salary
			  Assert.assertTrue(TestUtil.setText("Txt_Max_Sal", config.getProperty("MaxSal")),"Max Base salary does not exist");
			  Reporter.log("Entered Max Base salary"); 
			  TestUtil.sleep(2);
			  
			  // Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Max_Base_Salary").getText().equals("11/12"),"Client side validation failed for Max Base salary");
			  Reporter.log("Verified client side validation for Max Base salary is 11/12");
			  
			  //Bonus
			  Assert.assertTrue(TestUtil.setText("Txt_Bonus", config.getProperty("Bonus")),"Bonus text box does not exist");
			  Reporter.log("Entered Bonus");
			  TestUtil.sleep(2);
			  
			  // Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Bonus").getText().equals("3/3"),"Client side validation failed for Bonus");
			  Reporter.log("Verified client side validation for Bonus is 3/3");
			 
              TestUtil.sleep(2);
			  
              // Set Your Fee Tab
        	  Assert.assertTrue(TestUtil.click("tab_set_your_placement_fee"),"Set Your Fee Tab is not working");
			  Reporter.log("Clicked on Set Your Fee Tab");
			  
			  Assert.assertTrue(TestUtil.setText("Txt_Placement_Fee", "1234567890123"),"Placement Fee text box does not exist");
			  Reporter.log("Entered Placement Fee");
			  
			 // Verifying client side validation
			  Assert.assertTrue(TestUtil.getObject("Placement_Fee").getText().equals("13/13"),"Client side validation failed for Placement Fee");
			  Reporter.log("Verified client side validation for Placement Fee is 13/13");
			  
              TestUtil.sleep(2);
			  
		}
	
		public static void Verify_Server_Side_Validation()
		{
			 //Click on Job Posting
			  Assert.assertTrue(TestUtil.click("btn_job_posting"),"Job posting button does not working");
			  Reporter.log("Clicked on job posting button");
			  
			  //Clear short description and detailed description fields
			  TestUtil.getObject("Txt_Short_Description").clear();
			  driver.switchTo().frame("detailed_company_description_ifr");
			  driver.switchTo().activeElement().clear();
			  driver.switchTo().defaultContent();
			  
			 //Activate Search Tab
			  Assert.assertTrue(TestUtil.click("Txt_Activate_Search"),"Activate search button does not working");
			  Reporter.log("Clicked on Activate Search Tab");
			  
			  //Click on Activate Search Button
			  Assert.assertTrue(TestUtil.click("btn_activate_button"),"Active button does not working");
			  Reporter.log("Clicked on Activate Search Button");
			  
			  //Validation Error
			  Assert.assertTrue(TestUtil.click("btn_validation_error"),"Validation Error button does not working");  
			  Reporter.log("Clicked on Validation Error Button");
			  
			  TestUtil.sleep(2);
			  
			 //Verifying Server Error
			  Assert.assertTrue(TestUtil.getObject("er_short_description").getText().equals("This field cannot be empty."),"Server side validation failed for short description");
			  Reporter.log("Verified server side validation for short description is working");
			  
			//Verifying Server Error
			  Assert.assertTrue(TestUtil.getObject("er_detail_description").getText().equals("This field cannot be empty."),"Server side validation failed for Detailed Description");
			  Reporter.log("Verified server side validation for Detailed Description is working");
			  
			  //Basic Information Tab
			  Assert.assertTrue(TestUtil.click("tab_basic_information"),"Basic Information tab is not working");
			  Reporter.log("Clicked on Basic Information Tab");
			  
			  TestUtil.sleep(2);
			  
			 //Verifying Server Error
			  Assert.assertTrue(TestUtil.getObject("er_Position_Title").getText().equals("This field cannot be empty."),"Server side validation failed for Position title");
			  Reporter.log("Verified server side validation for Position title is working");
				
			 //Verifying Server Error
			  Assert.assertTrue(TestUtil.getObject("er_Position_Location").getText().equals("This field cannot be empty."),"Server side validation failed for Position Location");
			  Reporter.log("Verified server side validation for Position Location is working");
				
			 //Verifying Server Error
			  Assert.assertTrue(TestUtil.getObject("er_Reports_To").getText().equals("This field cannot be empty."),"Server side validation failed for Reports to");
			  Reporter.log("Verified server side validation for Reports to is working");
				
			  //Job Details Tab
			   Assert.assertTrue(TestUtil.click("tab_job_details"),"Job Details tab is not working");
			   Reporter.log("Clicked on Job Details Tab");
				  
				  TestUtil.sleep(2);
				  
			  //Verifying Server Error
				  Assert.assertTrue(TestUtil.getObject("er_Position_Summary").getText().equals("This field cannot be empty."),"Server side validation failed for Position summary");
				  Reporter.log("Verified server side validation for Position summary is working");
					
			  //Verifying Server Error
				  Assert.assertTrue(TestUtil.getObject("er_Position_Duties_Responsibility").getText().equals("This field cannot be empty."),"Server side validation failed for Position Duties & Responsibilities");
				  Reporter.log("Verified server side validation for Position Duties & Responsibilities is working");
					
			   //Verifying Server Error
				  Assert.assertTrue(TestUtil.getObject("er_Requirements").getText().equals("This field cannot be empty."),"Server side validation failed for Requirements");
				  Reporter.log("Verified server side validation for Requirements is working");
					
			   //Candidate Calibration Tab
				  Assert.assertTrue(TestUtil.click("tab_Candidate_Calibration"),"Candidate Calibration Tab is not working");
				  Reporter.log("Clicked on Candidate Calibration Tab");
					  
					  TestUtil.sleep(2);
					  
			   //Verifying Server Error
					  Assert.assertTrue(TestUtil.getObject("er_ideal_candidate_profile").getText().equals("This field cannot be empty."),"Server side validation failed for Ideal candidate profile");
					  Reporter.log("Verified server side validation for Ideal candidate profile is working");
					
			  //Selling Points Tab
					  Assert.assertTrue(TestUtil.click("tab_Selling_Point"),"Selling Point Tab is not working");
					  Reporter.log("Clicked on Selling Points Tab");
					  
					  TestUtil.sleep(2);
					  
			  //Verifying Server Error
					  Assert.assertTrue(TestUtil.getObject("er_selling_points").getText().equals("All three selling points are mandatory"),"Server side validation failed for Selling Point profile");
					  Reporter.log("Verified server side validation for Selling Point is working");
						
						 //Compensation Tab 
						  Assert.assertTrue(TestUtil.click("tab_compensation"),"Compensation Tab is not working");
						  Reporter.log("Clicked on Compensation Tab"); 
						  
						  TestUtil.sleep(2);
						  
			  //Verifying Server Error
						  Assert.assertTrue(TestUtil.getObject("er_Min_Sal").getText().equals("This field cannot be empty."),"Server side validation failed for Min Base salary");	  
						  Reporter.log("Verified server side validation for Min Base salary is working");
								
			 //Verifying Server Error
						  Assert.assertTrue(TestUtil.getObject("er_Max_Sal").getText().equals("This field cannot be empty."),"Server side validation failed for Max Base salary");
						  Reporter.log("Verified server side validation for Max Base salary is working");
							
			  //Verifying Server Error
						  Assert.assertTrue(TestUtil.getObject("er_Bonus").getText().equals("This field cannot be empty."),"Server side validation failed for Bonus ");
						  Reporter.log("Verified server side validation for Bonus is working");
							
			  // Set Your Fee Tab
					        	  Assert.assertTrue(TestUtil.click("tab_set_your_placement_fee"),"Set Your Fee Tab is not working");
								  Reporter.log("Clicked on Set Your Fee Tab");
								  
								  TestUtil.sleep(2);
								  
			 //Verifying Server Error
								  Assert.assertTrue(TestUtil.getObject("er_Placement_Fee").getText().equals("This field cannot be empty."),"Server side validation failed for Placement fee");			  
								  Reporter.log("Verified server side validation for Placement fee is working");
									
									 //Company Information Tab 
									  Assert.assertTrue(TestUtil.click("tab_company_information"),"Company Information Tab is not working");
									  Reporter.log("Clicked on Company Information Tab"); 
									  
									  //Enter detailed description
									  driver.switchTo().frame("detailed_company_description_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Detailed_Description"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered detailed description");
									  
									  //Job Details Tab
									  Assert.assertTrue(TestUtil.click("tab_job_details"),"Job Details tab is not working");
									  Reporter.log("Clicked on Job Details Tab");
									  
									 //Position Summary
									  driver.switchTo().frame("position_summary_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Position_Summary"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Position Summary");
									  
									  //Duties and Responsibilities
									  driver.switchTo().frame("duties_responsibilities_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Position_Duties_Responsibilities"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Duties and Responsibilities");
									  
									  //Position Requirements
									  driver.switchTo().frame("position_requirements_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Requirements"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Position Requirements"); 
									  
									 //Candidate Calibration Tab
									  Assert.assertTrue(TestUtil.click("tab_Candidate_Calibration"),"Candidate Calibration Tab is not working");
									  Reporter.log("Clicked on Candidate Calibration Tab");
									  
									  //Ideal candidate profile
									  driver.switchTo().frame("ideal_candidate_profile_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Ideal_Candidate_profile"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Ideal candidate profile");
									  
									 //Corporate Culture Tab
									  Assert.assertTrue(TestUtil.click("tab_Corporate_Culture"),"Corporate Culture Tab is not working");
									  Reporter.log("Clicked on Corporate Culture Tab");
									  
									  //Detail culture description
									  driver.switchTo().frame("unique_corporation_aspects_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Corporate_Culture_Description"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Detail culture description"); 
									  
									  //Hiring Manager information
									  driver.switchTo().frame("hiring_manager_info_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Hiring_Manager_information"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Hiring Manager information");
									  
									  //Selling Points Tab
									  Assert.assertTrue(TestUtil.click("tab_Selling_Point"),"Selling Point Tab is not working");
									  Reporter.log("Clicked on Selling Points Tab");
									  
									  //Comments
									  driver.switchTo().frame("comments_ifr");
									  driver.switchTo().activeElement().sendKeys(config.getProperty("Server_Comments"));
									  driver.switchTo().defaultContent();
									  Reporter.log("Entered Comments/Other Information");
									  
									//Activate Search Tab
									  Assert.assertTrue(TestUtil.click("Txt_Activate_Search"),"Activate search button does not working");
									  Reporter.log("Clicked on Activate Search Tab");
									  
									  //Click on Activate Search Button
									  Assert.assertTrue(TestUtil.click("btn_activate_button"),"Active button does not working");
									  Reporter.log("Clicked on Activate Search Button");
									  
									  //Validation Error
									  Assert.assertTrue(TestUtil.click("btn_validation_error"),"Validation Error button does not working");  
									  Reporter.log("Clicked on Validation Error Button");
									  
									  TestUtil.sleep(2);
									  
									 //Verifying Server Error
									  Assert.assertTrue(TestUtil.getObject("er_detail_description").getText().equals("This field cannot be more than 2000 characters long."),"Server side validation failed for Detailed Description");
									  Reporter.log("Verified server side validation for Detailed Description is working");
										 
									  //Job Details Tab
										  Assert.assertTrue(TestUtil.click("tab_job_details"),"Job Details tab is not working");
										  Reporter.log("Clicked on Job Details Tab");
										  
										  TestUtil.sleep(2);
										  
									  //Verifying Server Error
										  Assert.assertTrue(TestUtil.getObject("er_Position_Summary").getText().equals("This field cannot be more than 2000 characters long."),"Server side validation failed for Position summary");
										  Reporter.log("Verified server side validation for Position summary is working");
											
									 //Verifying Server Error
										  Assert.assertTrue(TestUtil.getObject("er_Position_Duties_Responsibility").getText().equals("This field cannot be more than 6000 characters long."),"Server side validation failed for Position Duties & Responsibilities");  
										  Reporter.log("Verified server side validation for Position Duties & Responsibilities is working");
											
									  //Verifying Server Error
										  Assert.assertTrue(TestUtil.getObject("er_Requirements").getText().equals("This field cannot be more than 5000 characters long."),"Server side validation failed for Requirements"); 
										  Reporter.log("Verified server side validation for Requirements is working");
											
									   //Candidate Calibration Tab
											  Assert.assertTrue(TestUtil.click("tab_Candidate_Calibration"),"Candidate Calibration Tab is not working");
											  Reporter.log("Clicked on Candidate Calibration Tab");
											  
											  TestUtil.sleep(2);
											  
									   //Verifying Server Error
											  Assert.assertTrue(TestUtil.getObject("er_ideal_candidate_profile").getText().equals("This field cannot be more than 2500 characters long."),"Server side validation failed for Ideal candidate profile");
											  Reporter.log("Verified server side validation for Ideal candidate profile is working");
												
												 //Corporate Culture Tab
												  Assert.assertTrue(TestUtil.click("tab_Corporate_Culture"),"Corporate Culture Tab is not working");
												  Reporter.log("Clicked on Corporate Culture Tab");  
												  
												//Verifying Server Error
												  Assert.assertTrue(TestUtil.getObject("er_Corporate_culture_description").getText().equals("This field cannot be more than 1500 characters long."),"Server side validation failed for Corporate culture description");
												  Reporter.log("Verified server side validation for Corporate culture description is working");
													
									  /*
													//Verifying Server Error
													 if(TestUtil.getObject("er_Hiring_Manager_information").getText().equals("This field cannot be more than 1500 characters long."))
													  {
														  Reporter.log("Verified server side validation for Hiring Manager information is working");
													  }
													  else
													  {
														  Reporter.log("Server side validation failed for Hiring Manager information");
													  } 
										*/
													 
													  //Selling Points Tab
													  Assert.assertTrue(TestUtil.click("tab_Selling_Point"),"Selling Point Tab is not working");
													  Reporter.log("Clicked on Selling Points Tab");
													  
													  TestUtil.sleep(2);
													  
													//Verifying Server Error
													  Assert.assertTrue(TestUtil.getObject("er_Comments").getText().equals("This field cannot be more than 750 characters long."),"Server side validation failed for Comments / Other information ");
													  Reporter.log("Verified server side validation for Comments / Other information is working");
														
		}
		
		public static void VerifyQuickPreviewButtons()
		{
			  String windowTitle= driver.getTitle();
			 //Click on Job Posting
			  Assert.assertTrue(TestUtil.click("btn_job_posting"),"Job posting button does not working");
			  Reporter.log("Clicked on job posting button");
			  
			//Basic Information Tab
			  Assert.assertTrue(TestUtil.click("tab_basic_information"),"Basic Information tab is not working");
			  Reporter.log("Clicked on Basic Information Tab");
			  
			 //Click on Quick Preview button
			  Assert.assertTrue(TestUtil.click("btn_quick_preview"),"Quick Preview button does not exist");
			  Reporter.log("Clicked on Quick Preview Button");
			  
			  TestUtil.sleep(5);
			  
			  //Switching to pop up window and verifying quick preview button
			  String currentWindow = driver.getWindowHandle();
			  Set<String> sHandlers= driver.getWindowHandles();
		        for(String sHandler:sHandlers)
		        {
		            if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
		            {
		                driver.switchTo().window(sHandler);
		                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
		                {
		                	 Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
		                    driver.close();
		                    Reporter.log("Verified quick preview button is working");
		                }
		              }
		        }
		        
		        driver.switchTo().window(currentWindow);
		        
		      //Job Details Tab
				  Assert.assertTrue(TestUtil.click("tab_job_details"),"Job Details tab is not working");
				  Reporter.log("Clicked on Job Details Tab");
				  
			  //Click on Quick Preview button
				  Assert.assertTrue(TestUtil.click("btn_quick_preview_job_detail"),"Quick Preview button does not exist");
				  Reporter.log("Clicked on Quick Preview Button");
				  
				  TestUtil.sleep(5);
				  
			 //Switching to pop up window and verifying quick preview button 
				  
				  sHandlers= driver.getWindowHandles();
				  for(String sHandler:sHandlers)
			        {
			            if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
			            {
			                driver.switchTo().window(sHandler);
			                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
			                {
			                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
			                    driver.close();
			                    Reporter.log("Verified quick preview button is working");
			                }
			}
			        }
				  
				  driver.switchTo().window(currentWindow);
				
				  //Candidate Calibration Tab
				  Assert.assertTrue(TestUtil.click("tab_Candidate_Calibration"),"Candidate Calibration Tab is not working");
				  Reporter.log("Clicked on Candidate Calibration Tab");
		        
				  //Click on Quick Preview button
				  Assert.assertTrue(TestUtil.click("btn_quick_preview_Candidate_Calibration"),"Quick Preview button does not exist");
				  Reporter.log("Clicked on Quick Preview Button");
				  
				  TestUtil.sleep(5);
				  
			      //Switching to pop up window and verifying quick preview button 
				  
				  sHandlers= driver.getWindowHandles();
				  for(String sHandler:sHandlers)
			        {
			            if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
			            {
			                driver.switchTo().window(sHandler);
			                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
			                {
			                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
			                    driver.close();
			                    Reporter.log("Verified quick preview button is working");
			                }
			}
			        }
				  driver.switchTo().window(currentWindow);
				  
				//Corporate Culture Tab
				  Assert.assertTrue(TestUtil.click("tab_Corporate_Culture"),"Corporate Culture Tab is not working");
				  Reporter.log("Clicked on Corporate Culture Tab");  
				  
				//Click on Quick Preview button
				  Assert.assertTrue(TestUtil.click("btn_quick_preview_Corporate_Culture"),"Quick Preview button does not exist");
				  Reporter.log("Clicked on Quick Preview Button");
				  
				  TestUtil.sleep(5);
				  
			      //Switching to pop up window and verifying quick preview button 
				  
				  sHandlers= driver.getWindowHandles();
				  for(String sHandler:sHandlers)
			        {
			            if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
			            {
			                driver.switchTo().window(sHandler);
			                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
			                {
			                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
			                    driver.close();
			                    Reporter.log("Verified quick preview button is working");
			                }
			}
			        }
				  
				  driver.switchTo().window(currentWindow);
				  
				  //Selling Points Tab
				  Assert.assertTrue(TestUtil.click("tab_Selling_Point"),"Selling Point Tab is not working");
				  Reporter.log("Clicked on Selling Points Tab");
				  
				  
					//Click on Quick Preview button
					  Assert.assertTrue(TestUtil.click("btn_quick_preview_Selling_Points"),"Quick Preview button does not exist");
					  Reporter.log("Clicked on Quick Preview Button");
					  
					  TestUtil.sleep(5);
					  
				      //Switching to pop up window and verifying quick preview button 
					  
					  sHandlers= driver.getWindowHandles();
					  for(String sHandler:sHandlers)
				        {
				            if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
				            {
				                driver.switchTo().window(sHandler);
				                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
				                {
				                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
				                    driver.close();
				                    Reporter.log("Verified quick preview button is working");
				                }
				}
				        }
					  
					  driver.switchTo().window(currentWindow);
					  
					//Compensation Tab 
					  Assert.assertTrue(TestUtil.click("tab_compensation"),"Compensation Tab is not working");
					  Reporter.log("Clicked on Compensation Tab"); 
					  
						//Click on Quick Preview button
					  Assert.assertTrue(TestUtil.click("btn_quick_preview_Compensation"),"Quick Preview button does not exist");
					  Reporter.log("Clicked on Quick Preview Button");
					  
					  TestUtil.sleep(5);
					  
				      //Switching to pop up window and verifying quick preview button 
					  
					  sHandlers= driver.getWindowHandles();
					  for(String sHandler:sHandlers)
				        {
						  if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
				            {
				                driver.switchTo().window(sHandler);
				                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
				                {
				                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
				                    driver.close();
				                    Reporter.log("Verified quick preview button is working");
				                }
				}
				        }
				        
					  
					  driver.switchTo().window(currentWindow);
					  
					// Set Your Fee Tab
		        	  Assert.assertTrue(TestUtil.click("tab_set_your_placement_fee"),"Set Your Fee Tab is not working");
					  Reporter.log("Clicked on Set Your Fee Tab");
					  
					//Click on Quick Preview button
					  Assert.assertTrue(TestUtil.click("btn_quick_preview_Set_Fee"),"Quick Preview button does not exist");
					  Reporter.log("Clicked on Quick Preview Button");
					  
					  TestUtil.sleep(8);
					  
				      //Switching to pop up window and verifying quick preview button 
					  
					  sHandlers= driver.getWindowHandles();
					  for(String sHandler:sHandlers)
				        {
						  if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
				            {
				                driver.switchTo().window(sHandler);
				                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
				                {
				                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Quick preview button does not working");
				                    driver.close();
				                    Reporter.log("Verified quick preview button is working");
				                }
				}
				        }
					  
					  driver.switchTo().window(currentWindow);
					  
					//Activate Search Tab
					  Assert.assertTrue(TestUtil.click("Txt_Activate_Search"),"Activate search button does not working");
					  Reporter.log("Clicked on Activate Search Tab");
					  
					//Click on Final Review button
					  Assert.assertTrue(TestUtil.click("btn_quick_preview_Activate"),"Quick Preview button does not exist");
					  Reporter.log("Clicked on Final Review Button");
					  
					  TestUtil.sleep(5);
					  
				      //Switching to pop up window and verifying quick preview button 
					  
					  sHandlers= driver.getWindowHandles();
					  for(String sHandler:sHandlers)
				        {
				            if(driver.switchTo().window(sHandler).getTitle().equals(windowTitle))
				            {
				                driver.switchTo().window(sHandler);
				                if(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"))
				                {
				                	Assert.assertTrue(TestUtil.getObject("Title").getText().equals("NEW POSTING PREVIEW"),"Final review button does not working");
				                    driver.close();
				                    Reporter.log("Verified Final review button is working");
				                }
				}
				            driver.switchTo().window(currentWindow);
				        }
		}
		public static void VerifyPlacementFee()
		{
			//Click on Job Posting
			  Assert.assertTrue(TestUtil.click("btn_job_posting"),"Job posting button does not working");
			  Reporter.log("Clicked on job posting button");
			  
			// Set Your Fee Tab
      	  Assert.assertTrue(TestUtil.click("tab_set_your_placement_fee"),"Set Your Fee Tab is not working");
			  Reporter.log("Clicked on Set Your Fee Tab");
			  
		  //Enter Placement Fee less than 20000
			  Assert.assertTrue(TestUtil.setText("Txt_Placement_Fee", "18000"),"Placement Fee text box does not exist");
			  Reporter.log("Entered Placement Fee");
			  
			  TestUtil.sleep(2);
			  
			//Activate Search Tab
			  Assert.assertTrue(TestUtil.click("Txt_Activate_Search"),"Activate search button does not working");
			  Reporter.log("Clicked on Activate Search Tab");
			  
			  //Click on Activate Search Button
			  Assert.assertTrue(TestUtil.click("btn_activate_button"),"Active button does not working");
			  Reporter.log("Clicked on Activate Search Button");
			  
			  
			  //Validation Error
			  Assert.assertTrue(TestUtil.click("btn_validation_error"),"Validation Error button does not working");  
			  Reporter.log("Clicked on Validation Error Button");
			  
			  TestUtil.sleep(3);
			  
			// Set Your Fee Tab
	      	  Assert.assertTrue(TestUtil.click("tab_set_your_placement_fee"),"Set Your Fee Tab is not working");
			  Reporter.log("Clicked on Set Your Fee Tab");
				
			  //Verify Placement Fee
			  Assert.assertTrue(TestUtil.getObject("er_Placement_Fee").getText().equals("Please include value greater than 20000."),"Server side validation failed for Placement fee");			  
			  Reporter.log("Verified server side validation for Placement fee is working");	  
			  
			//Enter Placement Fee 20000
			  Assert.assertTrue(TestUtil.setText("Txt_Placement_Fee", "20000"),"Placement Fee text box does not exist");
			  Reporter.log("Entered Placement Fee");
			  
			  TestUtil.sleep(2);
			  
			//Activate Search Tab
			  Assert.assertTrue(TestUtil.click("Txt_Activate_Search"),"Activate search button does not working");
			  Reporter.log("Clicked on Activate Search Tab");
			  
			  //Click on Activate Search Button
			  Assert.assertTrue(TestUtil.click("btn_activate_button"),"Active button does not working");
			  Reporter.log("Clicked on Activate Search Button");
			  
			  //Validation Error
			  Assert.assertTrue(TestUtil.click("btn_validation_error"),"Validation Error button does not working");  
			  Reporter.log("Clicked on Validation Error Button");
			  
			  TestUtil.sleep(3);
			  
			// Set Your Fee Tab
	      	  Assert.assertTrue(TestUtil.click("tab_set_your_placement_fee"),"Set Your Fee Tab is not working");
			  Reporter.log("Clicked on Set Your Fee Tab");
			  
			  TestUtil.sleep(2);
			  
		}
		
		public static void	VerifyEngagementDashboardPageLinks()
		{

			//Click on Profile Link
			Assert.assertTrue(TestUtil.click("Lnk_Profile"),"Profile link is not working");
			Reporter.log("Clicked on Profile Link");
			
			//Verifying Profile Link
			Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("Profile"),"Profile Link does not navigate to profile page");
			Reporter.log("Verified Profile link is navigated to profile page");
			
			//Click on Dashboard Link
			Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
			Reporter.log("Clicked on Dashboard Link");
			
			//Verifying Dashboard Link
			Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("Engagement Dashboard"),"Dashboard Link does not navigate to profile page");
			Reporter.log("Verified Dashboard link is navigated to Engagement Dashboard page");
	
			//Counting number of rows in Free Position Table
			WebElement element=driver.findElement(By.id("FreeTable"));
			List<WebElement> rowCollection=element.findElements(By.xpath("id('FreeTable')/tbody/tr"));
			
			if(rowCollection.size()>0)
			{
				for(int i=1;i<=rowCollection.size();i++)
				{
					
				driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+i+"]/td/span/a")).click();
	
				//Verifying Position Link
				Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("Single Job Dashboard"),"Position Link does not navigate to single job dashboard page");
				Reporter.log("Verified Free Position link is navigated to single job dashboard page");
				Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
				
				driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+i+"]/td[6]/a")).click();
				
				//Verifying Edit Link
				Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("New Job Posting"),"Edit Link does not navigate to new job posting page ");
				Reporter.log("Verified edit link is navigated to new job posting page");
				Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
				
				}
			}
			
			//Counting number of rows in engaged position table
			element=driver.findElement(By.id("EngagedTable"));
			rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			
			if(rowCollection.size()>0)
			{
				for(int i=1;i<=rowCollection.size();i++)
				{
					
				driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+i+"]/td/span/a")).click();
	
				//Verifying Position Link
				Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("Single Job Dashboard"),"Position Link does not navigate to single job dashboard page");
				Reporter.log("Verified Engaged Position link is navigated to single job dashboard page");
				Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
				
				driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+i+"]/td[6]/a")).click();
				
				//Verifying Edit Link
				Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("New Job Posting"),"Edit Link does not navigate to new job posting page ");
				Reporter.log("Verified edit link is navigated to new job posting page");
				Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
				
				}
			}
		
			 //Logout from the application
			 TestUtil.logout();
			 
			//Verifying Logout link
			 Assert.assertTrue(TestUtil.isObjPresent("btn_Submit",2));
			 Reporter.log("Verified Logout link is working");
		}
		
		public static void VerifyActionButtons()
		{
		     
			 WebElement element=driver.findElement(By.id("FreeTable"));
			 List<WebElement> rowCollection=element.findElements(By.xpath("id('FreeTable')/tbody/tr"));
			 int free_post=rowCollection.size();
			 List<WebElement> row_Engage;
			 List<WebElement> row_OnHold;
			 List<WebElement> row_Cancel;
			 List<WebElement> row_Complete;
			 List<WebElement> row_Engage_Cancel;
			 String post_title=null;
			 String cancel=null;
			 String Onhold=null;
			 String Position_Id=null;
			 String Complete=null;
			 
			
			//Counting number of rows in Free position table
		   
			
			while(free_post>0)
			{
				post_title=driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td/span/a")).getText();
				driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td/span/a")).click();
				Position_Id=TestUtil.getObject("Position_Id").getText();
				driver.navigate().back();
				
				if((free_post%2)!=0)
				{
					driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td[6]/button[2]")).click();
					Reporter.log("Clicked on "+post_title);
					
					//Verifying OnHold Position
					Assert.assertTrue(TestUtil.click("btn_Confirm_OnHold"),"Confirm button does not working");
					Reporter.log("Clicked on OnHold Button");
					
					Onhold=TestUtil.getObject("tab_OnHold").getText().replaceAll("\\d+\\s+", "");
				    Assert.assertTrue(Onhold.equalsIgnoreCase("on hold"),post_title+"does not on hold");	
				    
				    element=driver.findElement(By.id("EngagedTable"));
					row_OnHold=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
					
					driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_OnHold.size()+"]/td/span/a")).click();
					Assert.assertTrue(TestUtil.getObject("Position_Id").getText().equalsIgnoreCase(Position_Id));
					Reporter.log("Verified "+ post_title + " is On Hold");
					
					driver.navigate().back();
					
					Assert.assertTrue(TestUtil.click("btn_Resume"),"Resume button does not working");
					Reporter.log("Clicked on Resume Button");
				
				//Engage Position
					
				//Click on Engage Button
				driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td[6]/button")).click();
				Reporter.log("Clicked on Engage button");
				TestUtil.sleep(2);
				
				//Click on Next Button
				Assert.assertTrue(TestUtil.click("btn_Next"),"Next button does not working");
				Reporter.log("Clicked on Next Button");
				
				//Fill up Billing Information
				
				//Enter First Name
				Assert.assertTrue(TestUtil.setText("PP_Firstname", "Saurabh"));
				Reporter.log("Entered First Name");
				
				//Enter Last Name
				Assert.assertTrue(TestUtil.setText("PP_Lastname", "Gupta"));
				Reporter.log("Entered Last Name");
				
				//Enter Address 1
				Assert.assertTrue(TestUtil.setText("PP_StreetAddress", "ABC"));
				Reporter.log("Entered Address 1");
				
				//Enter Address 2
				Assert.assertTrue(TestUtil.setText("PP_StreetAddress1", "ABC"));
				Reporter.log("Entered Address 2");
				
				//Enter City
				Assert.assertTrue(TestUtil.setText("PP_City", "Delhi"));
				Reporter.log("Entered  City");
				
				//Enter State
				Assert.assertTrue(TestUtil.setText("PP_State", "Delhi"));
				Reporter.log("Entered  State");
				
				//Enter Country
				Assert.assertTrue(TestUtil.setText("PP_Country", "India"));
				Reporter.log("Entered  Country");
				
				//Enter Zip Code
				Assert.assertTrue(TestUtil.setText("PP_ZipCode", "110026"));
				Reporter.log("Entered  Zip Code");
				
				//Enter Card Number
				Assert.assertTrue(TestUtil.setText("PP_CardNumber", config.getProperty("Card_Number")));
				Reporter.log("Entered  Card Number");
				
				//Select Month
				Assert.assertTrue(TestUtil.selectValueInDropDown("Select_Month", config.getProperty("Month")));
				Reporter.log("Selected Month");
				
				//Select Year
				Assert.assertTrue(TestUtil.selectValueInDropDown("Select_Year", config.getProperty("Year")));
				Reporter.log("Selected Year");
				
				//Enter Security Code
				Assert.assertTrue(TestUtil.setText("PP_Security_Code", config.getProperty("Security_Code")));
				Reporter.log("Entered Security Code");
				
				//Click on Next Button
				Assert.assertTrue(TestUtil.click("btn_PP_Next"),"Next button does not working");
				Reporter.log("Clicked on Next Button");
				
				//Click on Place order Button
				Assert.assertTrue(TestUtil.click("btn_Place_Order"),"Place Order Button does not working");
				Reporter.log("Clicked on Place Order Button");
				
				//Verify Engage Position
				Assert.assertTrue(TestUtil.getObject("Secure_Checkout").getText().equalsIgnoreCase("secure checkout"));
				
				//Click on Dashboard Link
				Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
				Reporter.log("Clicked on Dashboard Link");
				
				//Counting number of rows in engaged position table
				element=driver.findElement(By.id("EngagedTable"));
				row_Engage=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
				
                driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Engage.size()+"]/td/span/a")).click();
		        Assert.assertTrue(TestUtil.getObject("Position_Id").getText().equalsIgnoreCase(Position_Id));
		        Reporter.log("Verified "+post_title+" is Engaged");
		        
		        driver.navigate().back();
		        free_post=free_post-1;
		        }
				else
				{
					driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td[6]/button[3]")).click();
					
					//Verify Cancel Position
					Assert.assertTrue(TestUtil.click("btn_Confirm_Cancel"),"Confirm button does not working");
					Reporter.log("Clicked on Cancel button");
					
					cancel=TestUtil.getObject("tab_Cancelled").getText().replaceAll("\\d+\\s+", "");
				    Assert.assertTrue(cancel.equalsIgnoreCase("Cancelled"),post_title+" does not Cancelled");	
				    
				    element=driver.findElement(By.id("EngagedTable"));
					row_Cancel=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
					 
					Assert.assertTrue(driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Cancel.size()+"]/td/span")).getText().equalsIgnoreCase(post_title));
					Reporter.log("Verified "+ post_title + " is Cancelled");
					free_post=free_post-1;
				   
					Assert.assertTrue(TestUtil.click("tab_Active"),"Active tab does not working");
					
				}
							
			}
			
			element=driver.findElement(By.id("EngagedTable"));
			rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			int engage_post =rowCollection.size();
			
			//Counting number of rows in engaged position table
			

			while(engage_post>0)
			{
				if((engage_post%2)==0)
				{
				post_title=driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td/span/a")).getText();
				driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td[6]/button")).click();
			    Reporter.log("Clicked on "+post_title);
				//Verifying Freeze Action 
				Assert.assertTrue(TestUtil.click("btn_Confirm_Freeze"),"Confirm button does not exist");
				Reporter.log("Clicked on Freeze Button");

				Assert.assertTrue(driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td[6]/button")).getText().equalsIgnoreCase("Unfreeze"),"Freeze button does not working");
			    Reporter.log("Verified Freeze button is working");
			    
			    driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td[6]/button[2]")).click();
			    
			    //Verifying Cancel Action
			  Assert.assertTrue(TestUtil.click("btn_Cancel"),"Cancel button does not working");
			  
			  cancel=TestUtil.getObject("tab_Cancelled").getText().replaceAll("\\d+\\s+", "");
			  Assert.assertTrue(cancel.equalsIgnoreCase("cancelled"),post_title+" does not cancelled");
			
			  element=driver.findElement(By.id("EngagedTable"));
			   row_Engage_Cancel=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			  driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Engage_Cancel.size()+"]/td/span")).getText().equalsIgnoreCase(post_title);
			  Reporter.log("Verified "+ post_title +"  is cancelled");
			  
			  //Click on Active Tab
			  Assert.assertTrue(TestUtil.click("tab_Active"),"Active tab does not working");
			  Reporter.log("Clicked on Active tab");
			  engage_post=engage_post-1;
			  
				}
				
				else
				{
			  
			 driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td[6]/button[3]")).click();
			 
			//Verify Complete Position
			Assert.assertTrue(TestUtil.click("btn_Confirm_Complete"),"Confirm button does not working");
			Reporter.log("Clicked on Complete button");
			
			Complete=TestUtil.getObject("tab_complete").getText().replaceAll("\\d+\\s+", "");
		    Assert.assertTrue(Complete.equalsIgnoreCase("Completed"),post_title+" does not Completed");	
		    
		    element=driver.findElement(By.id("EngagedTable"));
			row_Complete=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			Assert.assertTrue(driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Complete.size()+"]/td/span/a")).getText().equalsIgnoreCase(post_title));
			Reporter.log("Verified "+ post_title + " is Completed");
			engage_post=engage_post-1;
			Assert.assertTrue(TestUtil.click("tab_Active"),"Active tab does not working");
				}	
			}
			}
		
		public static void VerifyCorrespondingNumbers()
		{
			WebElement element=driver.findElement(By.id("FreeTable"));
			 List<WebElement> rowCollection=element.findElements(By.xpath("id('FreeTable')/tbody/tr"));
			 int no_of_free_positions=rowCollection.size();
			 element=driver.findElement(By.id("EngagedTable"));
			 rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			 int no_of_engage_positions=rowCollection.size();
			String total_positions=Integer.toString(no_of_engage_positions+no_of_free_positions);
			String Active_Job=TestUtil.getObject("tab_Active").getText().replaceAll("\\s+\\w+","");
			 
			//Verify Corresponding Number to  Active tab
		    Assert.assertTrue(Active_Job.equals(total_positions),"Corresponding number to active tab does not match with the number of positions");
		    Reporter.log("Verified Corresponding number to Active tab is equal to the number of positions");
		    
		    //Click on OnHold Tab
		    Assert.assertTrue(TestUtil.click("tab_OnHold"),"OnHold tab does not working");
		    Reporter.log("Clicked on OnHold Tab");
		    
		    //Verify Corresponding Number to  OnHold tab
		    element=driver.findElement(By.id("EngagedTable"));
			rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			String no_of_onhold_post=Integer.toString(rowCollection.size());
			String Onhold_Job=TestUtil.getObject("tab_OnHold").getText().replaceAll("\\s+\\w+","");
			Assert.assertTrue(Onhold_Job.equals(no_of_onhold_post),"Corresponding number to Onhold tab does not match with the number of positions");
		    Reporter.log("Verified Corresponding number to Onhold tab is equal to the number of positions");
		    
		    //Click on Suspended Tab
		    Assert.assertTrue(TestUtil.click("tab_suspend"),"Suspended tab does not working");
		    Reporter.log("Clicked on Suspended Tab");
		    
		    //Verify Corresponding Number to  Suspended tab
		    element=driver.findElement(By.id("EngagedTable"));
			rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			String no_of_suspend_post=Integer.toString(rowCollection.size());
			String Suspend_Job=TestUtil.getObject("tab_suspend").getText().replaceAll("\\s+\\w+","");
			Assert.assertTrue(no_of_suspend_post.equals(Suspend_Job),"Corresponding number to Suspended tab does not match with the number of positions");
		    Reporter.log("Verified Corresponding number to Suspended tab is equal to the number of positions");
		    
		  //Click on Cancelled Tab
		    Assert.assertTrue(TestUtil.click("tab_Cancel"),"Cancelled tab does not working");
		    Reporter.log("Clicked on Cancelled Tab");
		    
		    //Verify Corresponding Number to  Cancelled tab
		    element=driver.findElement(By.id("EngagedTable"));
			rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			String no_of_cancel_post=Integer.toString(rowCollection.size());
			String Cancel_Job=TestUtil.getObject("tab_Cancel").getText().replaceAll("\\s+\\w+","");
			Assert.assertTrue(no_of_cancel_post.equals(Cancel_Job),"Corresponding number to Cancelled tab does not match with the number of positions");
		    Reporter.log("Verified Corresponding number to Cancelled tab is equal to the number of positions");
		    
		    //Click on Completed Tab
		    Assert.assertTrue(TestUtil.click("tab_complete"),"Completed tab does not working");
		    Reporter.log("Clicked on Completed Tab");
		    
		    //Verify Corresponding Number to  Completed tab
		    element=driver.findElement(By.id("EngagedTable"));
			rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
			String no_of_complete_post=Integer.toString(rowCollection.size());
			String Complete_Job=TestUtil.getObject("tab_complete").getText().replaceAll("\\s+\\w+","");
			Assert.assertTrue(no_of_complete_post.equals(Complete_Job),"Corresponding number to Completed tab does not match with the number of positions");
		    Reporter.log("Verified Corresponding number to Completed tab is equal to the number of positions");
		    
		}
		
		public static void VerifyCorrespondingNumberSingleJobDashboard()
		{
			
			 WebElement element=driver.findElement(By.id("FreeTable"));
			 List<WebElement> rowCollection=element.findElements(By.xpath("id('FreeTable')/tbody/tr"));
			 int free_post=rowCollection.size();
			 
			 if(free_post>0)
			 {
				 driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td/span/a")).click();
				 
				 //Verify Corresponding Number to New tab
				 List<WebElement> candidate=driver.findElements(By.xpath("//div[@id='newPattern-bg']/div[2]/div/div[2]/div[3]/div"));
				 String no_of_candidate= Integer.toString(candidate.size());
				 System.out.println(candidate.size());
				 String New_Candidate=TestUtil.getObject("tab_New").getText().replaceAll("\\s+\\w+","");
				 System.out.println(New_Candidate);
				 Assert.assertTrue(no_of_candidate.equals(New_Candidate),"Corresponding number to New tab does not match with the number of candidates");
				 Reporter.log("Verified Corresponding number to New tab is equal to the number of candidates");
				 
				 //Click on In Play Tab
				 Assert.assertTrue(TestUtil.click("tab_InPlay"),"In Play tab does not working");
				 Reporter.log("Clicked on In Play tab");
				
				 //Verify Corresponding Number to In Play tab
				 candidate=driver.findElements(By.xpath("//body/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[3]/div"));
				 no_of_candidate= Integer.toString(candidate.size());
				 String InPlay_Candidate=TestUtil.getObject("tab_InPlay").getText().replaceAll("\\s+\\w+","");
				 Assert.assertTrue(no_of_candidate.equals(InPlay_Candidate),"Corresponding number to In Play tab does not match with the number of candidates");
				 Reporter.log("Verified Corresponding number to In Play tab is equal to the number of candidates");
				 
		}
		}
		public static void VerifyActionButtonsSingleJobDashboard()
		{
			WebElement element=driver.findElement(By.id("FreeTable"));
			 List<WebElement> rowCollection=element.findElements(By.xpath("id('FreeTable')/tbody/tr"));
			 List<WebElement> row_Engage;
			 String Position_Id=null;
			 int free_post=rowCollection.size();
			 while(free_post>0)
			 {
				 String post_title=driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td/span/a")).getText();
				 driver.findElement(By.xpath("//table[@id='FreeTable']/tbody/tr["+free_post+"]/td/span/a")).click();
				 Position_Id=TestUtil.getObject("Position_Id").getText();
				 Reporter.log("clicked on "+post_title);
				 
				 //Click on edit button
				 Assert.assertTrue(TestUtil.click("btn_edit"),"Edit button does not working");
				 Reporter.log("Clicked on edit button");
				 TestUtil.sleep(10);
				 
				  //Switching to new window tab and verifying edit button
				   Set<String> handles = driver.getWindowHandles();
				   String current = driver.getWindowHandle();
				   handles.remove(current);
				   String newTab = handles.iterator().next();
				   driver.switchTo().window(newTab);
				   
				   //Verify Edit button
				   TestUtil.isObjPresent("Title", 10);
	                Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("New Job Posting"),"Edit button does not navigate to new job posting page ");
					Reporter.log("Verified edit button  navigates to new job posting page");
				    driver.close(); 
				    driver.switchTo().window(current);
				    
				  //Click on View button
					 Assert.assertTrue(TestUtil.click("btn_View"),"View button does not working");
					 Reporter.log("Clicked on edit button");
					 
				 //Switching to new window tab and verifying view button
					 handles = driver.getWindowHandles();
					 current = driver.getWindowHandle();
					 handles.remove(current);
					 newTab = handles.iterator().next();
					 driver.switchTo().window(newTab);
					   
				 //Verify view button
					 TestUtil.isObjPresent("Title", 10);
		             Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("View Position"),"View button does not navigate to View Position page ");
				     Reporter.log("Verified view button  navigates to View Position page");
					 driver.close(); 
					 driver.switchTo().window(current);
					 if((free_post%2)!=0)
					 {
				 //Click on Engage button
					Assert.assertTrue(TestUtil.click("btn_engage"),"Engage button does not working");
					Reporter.log("Clicked on Engage button");
				    
					//Click on Next Button
					Assert.assertTrue(TestUtil.click("btn_Next"),"Next button does not working");
					Reporter.log("Clicked on Next Button");
					
					//Fill up Billing Information
					
					//Enter First Name
					Assert.assertTrue(TestUtil.setText("PP_Firstname", "Saurabh"));
					Reporter.log("Entered First Name");
					
					//Enter Last Name
					Assert.assertTrue(TestUtil.setText("PP_Lastname", "Gupta"));
					Reporter.log("Entered Last Name");
					
					//Enter Address 1
					Assert.assertTrue(TestUtil.setText("PP_StreetAddress", "ABC"));
					Reporter.log("Entered Address 1");
					
					//Enter Address 2
					Assert.assertTrue(TestUtil.setText("PP_StreetAddress1", "ABC"));
					Reporter.log("Entered Address 2");
					
					//Enter City
					Assert.assertTrue(TestUtil.setText("PP_City", "Delhi"));
					Reporter.log("Entered  City");
					
					//Enter State
					Assert.assertTrue(TestUtil.setText("PP_State", "Delhi"));
					Reporter.log("Entered  State");
					
					//Enter Country
					Assert.assertTrue(TestUtil.setText("PP_Country", "India"));
					Reporter.log("Entered  Country");
					
					//Enter Zip Code
					Assert.assertTrue(TestUtil.setText("PP_ZipCode", "110026"));
					Reporter.log("Entered  Zip Code");
					
					//Enter Card Number
					Assert.assertTrue(TestUtil.setText("PP_CardNumber", config.getProperty("Card_Number")));
					Reporter.log("Entered  Card Number");
					
					//Select Month
					Assert.assertTrue(TestUtil.selectValueInDropDown("Select_Month", config.getProperty("Month")));
					Reporter.log("Selected Month");
					
					//Select Year
					Assert.assertTrue(TestUtil.selectValueInDropDown("Select_Year", config.getProperty("Year")));
					Reporter.log("Selected Year");
					
					//Enter Security Code
					Assert.assertTrue(TestUtil.setText("PP_Security_Code", config.getProperty("Security_Code")));
					Reporter.log("Entered Security Code");
					
					//Click on Next Button
					Assert.assertTrue(TestUtil.click("btn_PP_Next"),"Next button does not working");
					Reporter.log("Clicked on Next Button");
					
					//Click on Place order Button
					Assert.assertTrue(TestUtil.click("btn_Place_Order"),"Place Order Button does not working");
					Reporter.log("Clicked on Place Order Button");
					
					//Verify Engage Position
					Assert.assertTrue(TestUtil.getObject("Secure_Checkout").getText().equalsIgnoreCase("secure checkout"));
					
					//Click on Dashboard Link
					Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
					Reporter.log("Clicked on Dashboard Link");
					
					//Counting number of rows in engaged position table
					element=driver.findElement(By.id("EngagedTable"));
					row_Engage=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
					
	                driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Engage.size()+"]/td/span/a")).click();
			        Assert.assertTrue(TestUtil.getObject("Position_Id").getText().equalsIgnoreCase(Position_Id));
			        Reporter.log("Verified "+post_title+" is Engaged");
			        
			        driver.navigate().back();
			       free_post=free_post-1; 
				  }
				 else
				 {
				//Click on OnHold button
					Assert.assertTrue(TestUtil.click("btn_onhold"),"On Hold button does not working");
					Reporter.log("Clicked on OnHold button");
					
				//Verify OnHold Button
					Assert.assertTrue(TestUtil.getObject("btn_onhold").getText().equalsIgnoreCase("Resume"),"Position does not OnHold");
					Reporter.log("Verified Position is OnHold");
					
			    //Click on Resume button
					Assert.assertTrue(TestUtil.click("btn_onhold"),"Resume button does not working");
					Reporter.log("Clicked on Resume button");	
					
				//Click on Cancel Button
					Assert.assertTrue(TestUtil.click("btn_cancel"),"Cancel button does not working");
					Reporter.log("Clicked on cancel button");
					
					//Verify Cancel Position
					Assert.assertTrue(TestUtil.click("btn_Submit"),"Confirm button does not working");
					Reporter.log("Clicked on Confirm Cancel button");
					
					 
					 List<WebElement> row_Cancel;
					 String cancel=TestUtil.getObject("tab_Cancelled").getText().replaceAll("\\d+\\s+", "");
				    Assert.assertTrue(cancel.equalsIgnoreCase("Cancelled"),post_title+" does not Cancelled");	
				    
				    element=driver.findElement(By.id("EngagedTable"));
					row_Cancel=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
					 
					Assert.assertTrue(driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Cancel.size()+"]/td/span")).getText().equalsIgnoreCase(post_title));
					Reporter.log("Verified "+ post_title + " is Cancelled");
					
					//Click on Active Tab
					 Assert.assertTrue(TestUtil.click("tab_Active"),"Active tab does not working");
					 Reporter.log("Clicked on Active tab");
		             free_post=free_post-1;
			              }
			 }
			 
			    element=driver.findElement(By.id("EngagedTable"));
				rowCollection=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
				int engage_post =rowCollection.size();
				String post_title=null;
				String Complete=null;
				List<WebElement> row_Complete;
				
				//Counting number of rows in engaged position table
				

				while(engage_post>0)
				{
					post_title=driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td/span/a")).getText();
					driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+engage_post+"]/td/span/a")).click();
				    Reporter.log("Clicked on "+post_title);
				    
					 //Click on edit button
					 Assert.assertTrue(TestUtil.click("btn_edit"),"Edit button does not working");
					 Reporter.log("Clicked on edit button");
					 TestUtil.sleep(10);
					 
					  //Switching to new window tab and verifying edit button
					   Set<String> handles = driver.getWindowHandles();
					   String current = driver.getWindowHandle();
					   handles.remove(current);
					   String newTab = handles.iterator().next();
					   driver.switchTo().window(newTab);
					   
					   //Verify Edit button
					   TestUtil.isObjPresent("Title", 10);
		                Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("New Job Posting"),"Edit button does not navigate to new job posting page ");
						Reporter.log("Verified edit button  navigates to new job posting page");
					    driver.close(); 
					    driver.switchTo().window(current);
					    
					  //Click on View button
						 Assert.assertTrue(TestUtil.click("btn_View"),"View button does not working");
						 Reporter.log("Clicked on edit button");
						 
					 //Switching to new window tab and verifying view button
						 handles = driver.getWindowHandles();
						 current = driver.getWindowHandle();
						 handles.remove(current);
						 newTab = handles.iterator().next();
						 driver.switchTo().window(newTab);
						   
					 //Verify view button
						 TestUtil.isObjPresent("Title", 10);
			             Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase("View Position"),"View button does not navigate to View Position page ");
					     Reporter.log("Verified view button  navigates to View Position page");
						 driver.close(); 
						 driver.switchTo().window(current);
						 
						//Click on Freeze button
						 
							Assert.assertTrue(TestUtil.click("btn_freeze"),"Freeze button does not working");
							Reporter.log("Clicked on Freeze button");
						
						//Verify Freeze Button
							TestUtil.sleep(4);
							Assert.assertTrue(TestUtil.getObject("btn_freeze").getText().equalsIgnoreCase("unfreeze"),"Position does not freeze");
							Reporter.log("Verified Position is freeze");
							
					    //Click on Unfreeze button
							Assert.assertTrue(TestUtil.click("btn_freeze"),"Unfreeze button does not working");
							Reporter.log("Clicked on unfreeze button");	
						    
						 
					if((engage_post%2)!=0)
					{
				 
					//Click on Cancel Button
					Assert.assertTrue(TestUtil.click("btn_cancel"),"Cancel button does not working");
					Reporter.log("Clicked on cancel button");
					
					//Verify Cancel Position
					Assert.assertTrue(TestUtil.click("btn_cancel_continue"),"Confirm button does not working");
					Reporter.log("Clicked on Confirm Cancel button");
							 
					 List<WebElement> row_Cancel;
					 String cancel=TestUtil.getObject("tab_Cancelled").getText().replaceAll("\\d+\\s+", "");
				    Assert.assertTrue(cancel.equalsIgnoreCase("Cancelled"),post_title+" does not Cancelled");	
				    
				    element=driver.findElement(By.id("EngagedTable"));
					row_Cancel=element.findElements(By.xpath("id('EngagedTable')/tbody/tr"));
					 
					Assert.assertTrue(driver.findElement(By.xpath("//table[@id='EngagedTable']/tbody/tr["+row_Cancel.size()+"]/td/span")).getText().equalsIgnoreCase(post_title));
					Reporter.log("Verified "+ post_title + " is Cancelled");
					
			       }
					else
					{
						//Click on Complete button
						Assert.assertTrue(TestUtil.click("btn_complete"),"Complete button does not working");
						Reporter.log("Clicked on complete button");
						
						//Verify Complete Position
						Assert.assertTrue(TestUtil.click("btn_confirm_continue"),"Confirm button does not working");
						
						Complete=TestUtil.getObject("completed_position").getText();
					    Assert.assertTrue(Complete.equalsIgnoreCase("Completed position"),post_title+" does not Completed");	
					    Assert.assertTrue(TestUtil.getObject("Title").getText().equalsIgnoreCase(post_title));
				
						Reporter.log("Verified "+ post_title + " is Completed");
						
						//Click on Dashboard Link
						Assert.assertTrue(TestUtil.click("Lnk_Dashboard"),"Dashboard link is not working");
						Reporter.log("Clicked on Dashboard Link");
						
					}
					
					//Click on Active Tab
					 Assert.assertTrue(TestUtil.click("tab_Active"),"Active tab does not working");
					 Reporter.log("Clicked on Active tab");
					 
					 engage_post=engage_post-1;
				}
		}
		
	public static boolean isSkip(String testCase){
		
		for(int i=2; i<=datatable.getRowCount("Test Cases"); i++){
			
			if(datatable.getCellData("Test Cases", "Test Cases", i).equalsIgnoreCase(testCase)){
				
				if(datatable.getCellData("Test Cases", "Runmode", i).equalsIgnoreCase("Y")){
					
					return false;
					
				}else{
					
					return true;
				}
				
			}else{
				
				continue;
			}
		}
		
		return true;
	}
	
	
	
	
	public static boolean isElementPresent(String xpathKey){
		
		try{
			WebElement webElement = getObject(xpathKey);
			if(!(webElement == null)){
				
				return true;
				
			}else{
				
				return false;
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
	
public static boolean isObjPresent(String xpathKey, int intSeconds){
		
		boolean flag = false;
		for(int iCount=0; iCount<=intSeconds; iCount++){
			
			try{
				Thread.sleep(1000);
				if(isElementPresent(xpathKey)){
					
					flag = true;
					break;
					
				}else{
					
					flag = false;
				}
				
			}catch(Exception e){
				
				e.printStackTrace();
			}
		}
		
		return flag;
	}

	
	
	
	public static boolean click(String xpathKey){
		
		try{
			boolean blnElementPresent;
			
			// Check the element currently present or not 
			blnElementPresent = isElementPresent(xpathKey);
			
			if((blnElementPresent==true)){
				
				getObject(xpathKey).click();
				return true;
				
			}else{
				
				return false;
			}
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
		
		
	
	public static boolean setText(String xpathKey, String value){
		
		try{
			boolean blnElementPresent;
            blnElementPresent = isElementPresent(xpathKey);
            if(blnElementPresent==true){
            	
            	//If this element is a text entry element, this will clear the value
                getObject(xpathKey).clear();
                //Typing into an element, which may set its value
                getObject(xpathKey).sendKeys(value);                          
                return true;
                
            }else{
            	
            	return false;
            }
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	
	
	public static boolean isTextPresent(String value){
		
		sleep(1);
	    return driver.getPageSource().contains(value);
	}
	
	
public static boolean selectValueInDropDown(String xpathKey, String value){
		
		try{
			Select element = new Select(getObject(xpathKey));
			element.selectByVisibleText(value);
			return true;
			
		}catch(Exception e){
			
			e.printStackTrace();
			return false;
		}
	}
	
public static Object[][] getData(String sheetName){
	
	// return and read test data from excel
	int rows = datatable.getRowCount(sheetName)-1;
	if(rows <=0){
		
		Object[][] testData = new Object[1][0];
		return testData;
	}
	
	rows = datatable.getRowCount(sheetName);
	int cols = datatable.getColumnCount(sheetName);
	
	Object data[][] = new Object[rows-1][cols];
	
	for(int rowNum=2; rowNum<=rows; rowNum++){
		
		for(int colNum=0; colNum<cols; colNum++){
			
			data[rowNum-2][colNum] = datatable.getCellData(sheetName, colNum, rowNum);
		}
	}
	
	return data;
}
	
}

