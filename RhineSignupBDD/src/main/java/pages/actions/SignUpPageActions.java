package pages.actions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.locators.SignUpPageLocators;
import utils.SeleniumDriver;


public class SignUpPageActions {
	SignUpPageLocators signUpPageLocators = null;
	public SignUpPageActions() {
		this.signUpPageLocators = new SignUpPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), signUpPageLocators);
	}
	public void enterCustomerName(String sheetValue)
	{
		Type(signUpPageLocators.CustomerNameField, sheetValue);		
	}
	
	public void enterRegistrationNumber(String sheetValue)
	{
		Type(signUpPageLocators.RegistrationNumberField, sheetValue);		
	}
	
	public void enterStreet1(String sheetValue)
	{
		Type(signUpPageLocators.Street1Field, sheetValue);		
	}
	
	public void enterStreet2(String sheetValue)
	{
		Type(signUpPageLocators.Street2Field, sheetValue);		
	}
	
	public void enterStreet3(String sheetValue)
	{
		Type(signUpPageLocators.Street3Field, sheetValue);		
	}
	
	public void enterCity(String sheetValue)
	{
		Type(signUpPageLocators.CityField, sheetValue);		
	}
	
	public void enterState(String sheetValue)
	{
		Type(signUpPageLocators.StateField, sheetValue);		
	}
	
	public void selectCountryName(String sheetValue){
		Select selectCountry = new Select(signUpPageLocators.countryDropdown);
		selectCountry.selectByVisibleText(sheetValue);
	}
	
	public void enterPostCode(String sheetValue)
	{
		Type(signUpPageLocators.postcodeField, sheetValue);		
	}
	
	public void enterMainPhone(String sheetValue)
	{
		Type(signUpPageLocators.mainPhoneField, sheetValue);		
	}
	
	public void enterFax(String sheetValue)
	{
		Type(signUpPageLocators.faxField, sheetValue);		
	}
	
	public void enterWebUrl(String sheetValue)
	{
		Type(signUpPageLocators.webUrlField, sheetValue);		
	}
	
	public void enterEmail(String sheetValue)
	{
		Type(signUpPageLocators.emailField, sheetValue);		
	}
	
	public void selectSourceName(String sheetValue){
		Select selectSource = new Select(signUpPageLocators.sourceDropdown);
		selectSource.selectByVisibleText(sheetValue);
	}
	
	public void selectIndustryName(String sheetValue){
		Select selectIndustry = new Select(signUpPageLocators.industryDropdown);
		selectIndustry.selectByVisibleText(sheetValue);
	}
	
	public void enterPrimaryContactFirstName(String sheetValue)
	{
		Type(signUpPageLocators.primaryContactFirstNameField, sheetValue);		
	}
	
	public void enterPrimaryContactLastName(String sheetValue)
	{
		Type(signUpPageLocators.primaryContactLastNameField, sheetValue);		
	}
	public void enterPrimaryContactPhone(String sheetValue)
	{
		Type(signUpPageLocators.primaryContactPhoneField, sheetValue);		
	}
	public void enterPrimaryContactJobTitle(String sheetValue)
	{
		Type(signUpPageLocators.primaryContactJobTitleField, sheetValue);		
	}
	public void enterPrimaryContactEmail(String sheetValue)
	{
		Type(signUpPageLocators.primaryContactEmailField, sheetValue);		
	}
	
	public void Type(WebElement target,String value)	{
		Actions action = new Actions(SeleniumDriver.getDriver());
			action.sendKeys(target,value);
	}
		
	
	
}
