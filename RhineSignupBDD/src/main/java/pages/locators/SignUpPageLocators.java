package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPageLocators {
	@FindBy(how = How.NAME, using = "CustomerName")
	public WebElement CustomerNameField;
	
	@FindBy(how = How.NAME, using = "RegistrationNumber")
	public WebElement RegistrationNumberField;
	
	@FindBy(how = How.NAME, using = "Street1")
	public WebElement Street1Field;

	@FindBy(how = How.NAME, using = "Street2")
	public WebElement Street2Field;
	
	@FindBy(how = How.NAME, using = "Street3")
	public WebElement Street3Field;
	
	@FindBy(how = How.NAME, using = "City")
	public WebElement CityField;
	
	@FindBy(how = How.NAME, using = "State")
	public WebElement StateField;
	
	@FindBy(how = How.NAME, using = "Country")
	public WebElement countryDropdown;
	
	@FindBy(how = How.NAME, using = "Postcode")
	public WebElement postcodeField;
	
	@FindBy(how = How.NAME, using = "MainPhone")
	public WebElement mainPhoneField;
	
	@FindBy(how = How.NAME, using = "Fax")
	public WebElement faxField;
	
	@FindBy(how = How.NAME, using = "WebUrl")
	public WebElement webUrlField;
	
	@FindBy(how = How.NAME, using = "Email")
	public WebElement emailField;
	
	@FindBy(how = How.NAME, using = "Source")
	public WebElement sourceDropdown;
	
	@FindBy(how = How.NAME, using = "OtherIndustryType")
	public WebElement industryDropdown;
	
	@FindBy(how = How.NAME, using = "PrimaryContactFirstName")
	public WebElement primaryContactFirstNameField;
	
	@FindBy(how = How.NAME, using = "PrimaryContactLastName")
	public WebElement primaryContactLastNameField;
	
	@FindBy(how = How.NAME, using = "PrimaryContactPhone")
	public WebElement primaryContactPhoneField;
	
	@FindBy(how = How.NAME, using = "PrimaryContactJobTitle")
	public WebElement primaryContactJobTitleField;
	
	@FindBy(how = How.NAME, using = "PrimaryContactEmail")
	public WebElement primaryContactEmailField;
}
