package com.applicationpages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.applicationor.JobSeekerOR;
import com.commonutils.CommonUtlities;

public class JobSeeker_StepDefinitions extends CommonUtlities {

	public static JobSeekerOR jobseekeror = PageFactory.initElements(driver,
			JobSeekerOR.class);

	public static void verify_fields() {
		IsElementDisplayed("Current Industry",
				"JobSeeker Personal Information", jobseekeror.edi_FirstName);

	}

	public void fillForm_PersonalInformation() {
String firstname= getName();
		sendDataByClearing("First Name", "Job Seeker_Personal Information",
				jobseekeror.edi_FirstName, firstname);
		
		String LastName=getName();
	
		sendDataByClearing("Last Name", "Job Seeker_Personal Information",
				jobseekeror.edi_LastName, LastName );
		
		String Email=getEmail();

		sendDataByClearing("Email", "Job Seeker_Personal Information",
				jobseekeror.edi_Email, Email);
		
		String ContactNumber=getPhNo();
		sendDataByClearing("Contact Number", "Job Seeker_Personal Information",
				jobseekeror.edi_ContactNumber, ContactNumber);
		
		String LandLineNumber=getPhNo();

		sendDataByClearing("Landline Number",
				"Job Seeker_Personal Information",
				jobseekeror.edi_LandLineNumber, LandLineNumber);
		
		String Password=getData("TestData", "Password");

		sendDataByClearing("Password", "Job Seeker_Personal Information",
				jobseekeror.edi_password, Password);
		

		String ConfirmPassword=getData("TestData", "ConfirmPassword");

		sendDataByClearing("Confirm Password",
				"Job Seeker_Personal Information",
				jobseekeror.edi_confirmpassword, ConfirmPassword);
		
		String DOB=getData("TestData", "DOB");

		//sendDataByClearing("Date Of Birth", "Job Seeker_Personal Information",
				//jobseekeror.edi_dob, DOB);
		
		hoverAndClick("Gender", "Job Seeker_Personal Information",
				jobseekeror.rdo_GenderMale);
		
		
		hoverAndClick("Are You in Notice", "Job Seeker_Personal Information",
				jobseekeror.rdo_No);
		
		String LanguagesKnown=getData("TestData", "LanguagesKnown");

		sendDataByClearing("Languages Known",
				"Job Seeker_Personal Information",
				jobseekeror.edi_LanguagesKnown, LanguagesKnown);
		
		hoverAndClick("Continue Button", "Job Seeker_Personal Information", jobseekeror.btn_ContinueStep1);

	}
	
	//Professional Details Step
	
	public void fillForm_ProfessionalDetails() {

		// Select Current Industry
		
		String CurrentIndustry=getData("TestData", "CurrentIndustry");

		selectDropdownByVisibleText("Current Industry",
				"Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, CurrentIndustry);

		// Select Role
		String Role=getData("TestData", "Role");

		selectDropdownByVisibleText("Role", "Job Seeker_Professional Details",
				jobseekeror.drp_Role, Role);
		
		//Select JobType
		String JobType=getData("TestData", "JobType");
		selectDropdownByVisibleText("Job Type",
				"Job Seeker_Professional Details", jobseekeror.drp_JobType,
				JobType);

		// Enter Current Designation
		String CurrentDesignation=getData("TestData", "CurrentDesignation");

		sendData("Current Designation",
				"Job Seeker_Professional Details",
				jobseekeror.edi_CurrentDesignation, CurrentDesignation);


		// Select Total Experience in Years
		String ExpYears=getData("TestData", "ExpYears");

		selectDropdownByVisibleText("Total Experience in Years",
				"Job Seeker_Professional Details",
				jobseekeror.drp_TotalExperience_Years, ExpYears);

		// Select Total Experience in Months
		String ExpMonths=getData("TestData", "ExpMonths");

		selectDropdownByVisibleText("Total Experience in Months",
				"Job Seeker_Professional Details",
				jobseekeror.drp_TotalExperience_Months, ExpMonths);

		// Enter Resume Headline
		/*
		 * String ResumeHeadline=getData("TestData", "ResumeHeadline");
		 * 
		 * sendDataByClearing("Resume Headline", "Job Seeker_Professional Details",
		 * jobseekeror.txt_ResumeHeadline, ResumeHeadline);
		 */

		// Enter Current Company
		String CurrentCompany=getData("TestData", "CurrentCompany");
		sendData("Current Company",
				"Job Seeker_Professional Details",
				jobseekeror.txt, CurrentCompany);
		//Key Skills
		String keySkills=getData("TestData", "keySkills");
		sendDataByClearing("Current Company",
				"Job Seeker_Professional Details",
				jobseekeror.txt_Keyskills, keySkills);

		// Select Current Location
		String CurrentLocation=getData("TestData", "CurrentLocation");
		selectDropdownByVisibleText("Current Location",
				"Job Seeker_Professional Details",
				jobseekeror.drp_CurrentLocation, CurrentLocation);

		// Select Preferred Location
		String PreferredLocation=getData("TestData", "PreferredLocation");
		selectDropdownByVisibleText("Preferred Location",
				"Job Seeker_Professional Details",
				jobseekeror.drp_PreferredLocation, PreferredLocation);
		
		hoverAndClick("Continue Button", "Job Seeker_Personal Information", jobseekeror.btn_ContinueStep2);

	}

	public void fillForm_EducationalDetails() {
		selectDropdownByVisibleText("Education",
				"Job Seeker_Education Details", jobseekeror.drp_Education,
				"Accounting/Finance");
		selectDropdownByVisibleText("Current Industry",
				"Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, "Accounting/Finance");
		selectDropdownByVisibleText("Current Industry",
				"Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, "Accounting/Finance");

	}
//validating all the mandatory fields for Personal Information Page
	public void validate_AllMandatoryFields(String PageName) {
		switch(PageName.toLowerCase()){
		case "personal information":
		
try{
           validate_MandatoryField(PageName,"First Name ",
				jobseekeror.lbl_FirstName, errorMessages()
						.get("firstnameerror").toString(),
				jobseekeror.txt_FirstNameMandatorytext);
		validate_MandatoryField(PageName,"Last Name",
				jobseekeror.lbl_LastName, errorMessages().get("lastnameerror")
						.toString(), jobseekeror.txt_LastNameMandatorytext);
		validate_MandatoryField(PageName,"EmailId",
				jobseekeror.lbl_Email, errorMessages().get("emailiderror")
						.toString(), jobseekeror.txt_EmailMandatorytext);
		validate_MandatoryField(PageName,"Contact Number",
				jobseekeror.lbl_ContactNumber,
				errorMessages().get("contactnumbererror").toString(),
				jobseekeror.txt_ContactMandatorytext);
		validate_MandatoryField(PageName,"Password",
				jobseekeror.lbl_Password, errorMessages().get("passworderror")
						.toString(), jobseekeror.txt_PasswordMandatorytext);
		validate_MandatoryField(PageName,"ConfirmPassword",
				jobseekeror.lbl_ConfirmPassword,
				errorMessages().get("confirmpassworderror").toString(),
				jobseekeror.txt_ConfirmPasswordMandatorytext);
		validate_MandatoryField(PageName,"Gender",
				jobseekeror.lbl_Gender, errorMessages().get("gendererror")
						.toString(), jobseekeror.txt_GenderMandatorytext);
		LogStatus("pass","Successfully validated all the mandatory fields of Personal Information");
	

		
	

} catch (Exception e1) {
	// TODO Auto-generated catch block
	LogStatus("fail","error in validate_AllMandatoryFields_PersonalInformation"
					+ e1.getMessage());
}

		case "professsional details":
			try{
				
		   validate_MandatoryField(PageName, "Current Industry", jobseekeror.lbl_CurrentIndustry, errorMessages().get("currentindustry"), jobseekeror.txt_MandatoryCurrentIndustry);
		   validate_MandatoryField(PageName, "Role", jobseekeror.lbl_Role, errorMessages().get("keyskills"), jobseekeror.txt_MandatoryRole);
           validate_MandatoryField(PageName, "Job Type", jobseekeror.lbl_JobType, errorMessages().get("jobtype"), jobseekeror.txt_MandatoryRole);
           validate_MandatoryField(PageName, "Key Skills",jobseekeror.lbl_Keyskills, errorMessages().get("keyskills"),jobseekeror.txt_MandatoryKeySkills);
           validate_MandatoryField(PageName, "Current Location", jobseekeror.lbl_CurrentLocation, errorMessages().get("currentlocation"), jobseekeror.txt_MandatoryCurrentLocation);
					}
			catch(Exception e2){
			
			LogStatus("fail","error in validate _AllMandatoryFields_Professional Details"+e2.getMessage());
			}
		case "educational details":
			try{
			//validate_MandatoryField(PageName, "", jobseekeror.lbl, object, mandatorytxtelement);
		}
			catch(Exception e){
			}
			}
			

	}

	public static Map errorMessages() {
		HashMap<String, String> map = new HashMap<String, String>();
		//error messages for personal information
		map.put("firstnameerror", "* Please specify firstname.");
		map.put("lastnameerror", "* Please specify lastname.");
		map.put("emailiderror", "* Please specify email id.");
		map.put("contactnumbererror", "* Please specify contact number.");
		map.put("passworderror", "* Please specify password.");
		map.put("confirmpassworderror", "* Please specify confirm password.");
		map.put("gendererror", "* Please specify gender.");
		
		//error messages for educational details
		map.put("currentindustry", "* Please specify industry.");
		map.put("role", "Please specify role");
		map.put("jobtype", "* Please select job type.");
		map.put("keyskills", "* Please specify key skills.");
		map.put("resumeheadline","* Please specify resume headline.");
		map.put("currentlocation", "* Please specify location.");
		
		
		
		return map;
	}
//method to validate the mandatory field
	public void validate_MandatoryField(String PageName,
			String elementname, WebElement element, Object object,
			WebElement mandatorytxtelement) {
switch(PageName.toLowerCase()){

case "personal information":
		// Checking for the null value in  Field
		try {
			if (!(element == null)) {
				jobseekeror.btn_ContinueStep1.click();
				
			LogStatus("pass",elementname+"is not null");
			} else

				throw new Exception(elementname + " is null");
			LogStatus("fail",elementname+" is Element Name is null");
		} catch (Exception e1) {
			LogStatus("fail",elementname+"is null"
							+ e1.getMessage());
		}
break;

case "professional details":
	try {
		if (!(element == null)) {
			jobseekeror.btn_ContinueStep2.click();
			
		LogStatus("pass",elementname+"is not null");
		} else

			throw new Exception(elementname + " is null");
		LogStatus("fail",elementname+" is Element Name is null");
	} catch (Exception e1) {
		LogStatus("fail",elementname+"is null"
						+ e1.getMessage());
	}
break;

case "educational details":
	try {
		if (!(element == null)) {
			jobseekeror.btn_Submit.click();
			
		LogStatus("pass",elementname+"is not null");
		} else

			throw new Exception(elementname + " is null");
		LogStatus("fail",elementname+" is Element Name is null");
	} catch (Exception e1) {
		LogStatus("fail",elementname+"is null"
						+ e1.getMessage());
	}
break;
 default:
	 System.out.println("Enter the valid page name" );
	
	 
}

		// Validation of mandatory text for webelement
		String msg = getTextForWebElement(elementname,
				PageName, mandatorytxtelement);
		try {
			if (msg.equals(object)) {
				System.out.println("Correct validations of" + object);

				if (isElementColorRed(mandatorytxtelement))

					{System.out.println("The colour is matched ");
				LogStatus("pass","Colour is successfully validated");
					}
				else

					throw new Exception(" Colour Mismatch");
				LogStatus("fail","Colour Mismatch of WebElement"+elementname);
			} else
				throw new Exception("Validation text is not displayed");
                    LogStatus("fail","Validation text is not displayed");
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LogStatus("fail","error in validate_MandatoryFields"
							+ e.getMessage());
		}

	
	}
}
