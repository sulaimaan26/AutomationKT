package com.cloudblm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloudblm.sections.HeaderSection;
import com.cloudblm.util.HandleTimeout;

public class CreateProjectPage {
	HandleTimeout customtimeout;	
	HeaderSection headers;
	
	public CreateProjectPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		customtimeout = new HandleTimeout(driver);
		headers = new HeaderSection(driver);
	}
	
	@FindBy(xpath="//input[@formcontrolname=\"ProjectName\"]")
	WebElement ProjectNameField;
	
	@FindBy(xpath="")
	WebElement ConstructionTypeDropdown;
	
	@FindBy(xpath="")
	WebElement ContractTypeDropdown;
	
	@FindBy(xpath="")
	WebElement JobNumberField;
	
	@FindBy(xpath="")
	WebElement StartDateField;
	
	@FindBy(xpath="")
	WebElement EndDateField;
	
	@FindBy(xpath="")
	WebElement VendorDropdown;
	
	@FindBy(xpath="")
	WebElement AddressField;
	
	@FindBy(xpath="")
	WebElement CountryDropdown;
	
	@FindBy(xpath="")
	WebElement StateDropdown;
	
	@FindBy(xpath="")
	WebElement CityDropdown;
	
	@FindBy(xpath="")
	WebElement PinCodeField;
	
	public void EnterProjectName(String ProjectName) {
		ProjectNameField.sendKeys(ProjectName);
	}
	
	public void ClearProjectNameField() {
		ProjectNameField.clear();
	}
	
	public void SelectConstructionType(String ConstructionType) {
		
	}
	
	public void SelectContractType(String ContractType) {
		
	}
	
	public void EnterJobNumber(String JobNumber) {
		JobNumberField.sendKeys(JobNumber);
	}
	
	public void SelectStartDate(String StartDate) {
		
	}
	
	public void SelectEndDate(String EndDate) {
		
	}
	
	public void ChooseVendor(String VendorName) {
		
	}
	
	public void EnterAddress(String Address) {
		AddressField.sendKeys(Address);
	}
	
	public void ClearAddressField(String Address) {
		AddressField.clear();
	}
	
	public void SelectCountry(String country) {
		
	}
	
	public void SelectState(String state) {
		
	}
	
	public void SelectCity(String city) {
		
	}
	
	public void EnterPincode(String pincode) {
		PinCodeField.sendKeys(pincode);
	}
	
	public void ClearPincode(String pincode) {
		PinCodeField.clear();
	}
	
}
