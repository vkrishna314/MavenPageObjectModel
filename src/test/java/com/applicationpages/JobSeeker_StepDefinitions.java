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

	public void fillForm_PersononalInformation() {

		sendDataByClearing("First Name", "Job Seeker_Personal Information",
				jobseekeror.edi_FirstName, "Vamshi");
		sendDataByClearing("Last Name", "Job Seeker_Personal Information",
				jobseekeror.edi_LastName, "Krishna");
		sendDataByClearing("Email", "Job Seeker_Personal Information",
				jobseekeror.edi_Email, "vamshi.thodeti@gmai.com");
		sendDataByClearing("Contact Number", "Job Seeker_Personal Information",
				jobseekeror.edi_ContactNumber, "7799327686");
		sendDataByClearing("Landline Number",
				"Job Seeker_Personal Information",
				jobseekeror.edi_LandLineNumber, "11111");
		sendDataByClearing("Password", "Job Seeker_Personal Information",
				jobseekeror.edi_password, "xxx");
		sendDataByClearing("Confirm Password",
				"Job Seeker_Personal Information",
				jobseekeror.edi_confirmpassword, "xxx");
		sendDataByClearing("Date Of Birth", "Job Seeker_Personal Information",
				jobseekeror.edi_dob, "23-09-2000");
		hoverAndClick("Gender", "Job Seeker_Personal Information",
				jobseekeror.rdo_GenderMale);
		hoverAndClick("Are You in Notice", "Job Seeker_Personal Information",
				jobseekeror.rdo_No);
		sendDataByClearing("Languages Known",
				"Job Seeker_Personal Information",
				jobseekeror.edi_LanguagesKnown, "Telugu, Hindi, English");

	}

	// //Validation of mandatory text for First Name
	public void ValidateMandatoryField_PersonalInformation() {

	}

	public void fillForm_ProfessionalDetails() {

		// Select Current Industry
		selectDropdownByVisibleText("Current Industry",
				"Job Seeker_Professional Details",
				jobseekeror.drp_CurrentIndustry, "Accounting/Finance");

		// Select Role
		selectDropdownByVisibleText("Role", "Job Seeker_Professional Details",
				jobseekeror.drp_Role, "Account Manager");

		selectDropdownByVisibleText("Job Type",
				"Job Seeker_Professional Details", jobseekeror.drp_JobType,
				"Account Manager");

		// Enter Current Designation
		sendDataByClearing("Current Designation",
				"Job Seeker_Professional Details",
				jobseekeror.edi_CurrentDesignation, "Senior Manager");

		// Select Job Type
		selectDropdownByVisibleText("Job Type",
				"Job Seeker_Professional Details", jobseekeror.drp_JobType,
				"Account Manager");

		// Select Total Experience in Years
		selectDropdownByVisibleText("Total Experience in Years",
				"Job Seeker_Professional Details",
				jobseekeror.drp_TotalExperience_Years, "7");

		// Select Total Experience in Months
		selectDropdownByVisibleText("Total Experience in Months",
				"Job Seeker_Professional Details",
				jobseekeror.drp_TotalExperience_Months, "2");

		// Enter Resume Headline
		sendDataByClearing("Resume Headline",
				"Job Seeker_Professional Details",
				jobseekeror.txt_ResumeHeadline,
				"7 Years of Experience in Testing");

		// Enter Current Company
		sendDataByClearing("Current Company",
				"Job Seeker_Professional Details",
				jobseekeror.txt_CurrentCompany, "Cigniti");

		// Select Total Experience in Months
		selectDropdownByVisibleText("Current Location",
				"Job Seeker_Professional Details",
				jobseekeror.drp_CurrentLocation, "Hyderabad");

		// Select Total Experience in Months
		selectDropdownByVisibleText("Preferred Location",
				"Job Seeker_Professional Details",
				jobseekeror.drp_PreferredLocation, "Hyderabad");

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

	public void validate_AllMandatoryFields_PersonalInformation() {

		try {
			if (JobSeekerOR.edi_FirstName.equals(null)) {
				JobSeekerOR.btn_ContinueStep1.click();
			} else

				throw new Exception("Field value is not null");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out
					.println("error in validate_AllMandatoryFields_PersonalInformation"
							+ e1.getMessage());
		}

		validate_MandatoryFields_PersonalInformation("First Name ",
				jobseekeror.lbl_FirstName, errorMessages()
						.get("firstnameerror").toString(),
				jobseekeror.txt_FirstNameMandatorytext);
		validate_MandatoryFields_PersonalInformation("Last Name",
				jobseekeror.lbl_LastName, errorMessages().get("lastnameerror")
						.toString(), jobseekeror.txt_LastNameMandatorytext);
		validate_MandatoryFields_PersonalInformation("EmailId",
				jobseekeror.lbl_Email, errorMessages().get("emailiderror")
						.toString(), jobseekeror.txt_EmailMandatorytext);
		validate_MandatoryFields_PersonalInformation("Contact Number",
				jobseekeror.lbl_ContactNumber,
				errorMessages().get("contactnumbererror").toString(),
				jobseekeror.txt_ContactMandatorytext);
		validate_MandatoryFields_PersonalInformation("Password",
				jobseekeror.lbl_Password, errorMessages().get("passworderror")
						.toString(), jobseekeror.txt_PasswordMandatorytext);
		validate_MandatoryFields_PersonalInformation("ConfirmPassword",
				jobseekeror.lbl_ConfirmPassword,
				errorMessages().get("confirmpassworderror").toString(),
				jobseekeror.txt_ConfirmPasswordMandatorytext);
		validate_MandatoryFields_PersonalInformation("Gender",
				jobseekeror.lbl_Gender, errorMessages().get("gendererror")
						.toString(), jobseekeror.txt_GenderMandatorytext);
	}

	public static Map errorMessages() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("firstnameerror", "* Please specify firstname.");
		map.put("lastnameerror", "* Please specify lastname.");
		map.put("emailiderror", "* Please specify email id.");
		map.put("contactnumbererror", "* Please specify contact number.");
		map.put("passworderror", "* Please specify password.");
		map.put("confirmpassworderror", "* Please specify confirm password.");
		map.put("gendererror", "* Please specify gender.");
		return map;
	}

	public void validate_MandatoryFields_PersonalInformation(
			String elementname, WebElement element, String object,
			WebElement mandatorytxtelement) {

		// Checking for the null value in FirstName Field
		try {
			if (!(element == null)) {
				jobseekeror.btn_ContinueStep1.click();
			} else

				throw new Exception(elementname + " is null");
		} catch (Exception e1) {
			System.out
					.println("error in validate_MandatoryFields_PersonalInformation is"
							+ e1.getMessage());
		}

		// Validation of mandatory text for first name
		String msg = getTextForWebElement(elementname,
				"JobSeeker Personal Informaton", mandatorytxtelement);
		try {
			if (msg.equals(object)) {
				System.out.println("Correct validations of" + object);

				if (isElementColorRed(mandatorytxtelement))

					System.out.println("The colour is matched ");

				else

					throw new Exception(" Colour Mismatch");
			} else

				throw new Exception("Validation text is not displayed");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out
					.println("error in validate_MandatoryFields_PersonalInformation"
							+ e.getMessage());
		}
	}
}
