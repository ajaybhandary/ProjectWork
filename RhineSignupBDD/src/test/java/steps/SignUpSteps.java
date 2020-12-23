package steps;
import utils.SeleniumDriver;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.SignUpPageActions;
import pages.locators.SignUpPageLocators;
import utils.ExcelReader;

public class SignUpSteps {
	
	SignUpPageActions signUpPageActions = new SignUpPageActions();
	SignUpPageLocators signUpPageLocators = new SignUpPageLocators();
	
	@Given("Rhipe program officer is on the SignUp page {string} of the website")
	public void rhipe_program_officer_is_on_the_SignUp_page_of_the_website(String string) {
		SeleniumDriver.openPage(string);
	    
	}
	
	@When("Rhipe program officer fills in all the details of the customer in the SignUp form given")
	public void rhipe_program_officer_fills_in_all_the_details_of_the_customer_in_the_SignUp_form_given() throws Throwable {
		int rowNumber = 1; 
		ExcelReader externalData = new ExcelReader();
	        List<Map<String, String>> testData = externalData.getData("./src/test/resources/Excel/testdata.xlsx", 0);	
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("customerName"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("registrationNumber"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("street1"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("street2"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("street3"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("city"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("state"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("country"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("postcode"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("mainPhone"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("fax"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("webUrl"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("email"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("source"));
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("otherIndustryType"));  
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("primaryContactFirstName"));  
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("primaryContactLastName"));  
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("primaryContactPhone"));  
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("primaryContactJobTitle"));  
	        signUpPageActions.enterCustomerName(testData.get(rowNumber).get("primaryContactEmail"));  
	         
	        
	}

	@Then("Rhipe customer will be successfully signed up.")
	public void rhipe_customer_will_be_successfully_signed_up() {
	   
	}
	

}