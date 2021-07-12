package com.cloudblm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloudblm.sections.HeaderSection;
import com.cloudblm.sections.SideMenu;

public class AdminCreation {
	WebDriver driver;
	HeaderSection header;
	SideMenu sidemenu;

	public AdminCreation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = this.driver;

	}

	@FindBy(xpath = "//button[text()='Create']")
	public WebElement CreateButton;

	@FindBy(xpath = "//input[@formcontrolname='FirstName']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@formcontrolname='LastName']")
	public WebElement LastName;

	@FindBy(xpath = "//input[@formcontrolname='EmailID']")
	public WebElement Email;

	@FindBy(xpath = "//input[@formcontrolname='Title']")
	public WebElement Title;

	@FindBy(xpath = "//input[@formcontrolname='Contact']")
	public WebElement Contact;

	@FindBy(id = "phoneCode")
	public WebElement SelectPhoneCode;

	@FindBy(xpath = "//div[@id='phoneCode']//input[1]")
	public WebElement EnterCode;

	@FindBy(xpath = "//input[@formcontrolname='Address']")
	public WebElement Address;

	@FindBy(id = "admintypeDropdown")
	public WebElement SelectAdmintype;

	@FindBy(xpath = "(//div[@id ='admintypeDropdown']//following::input[1])[1]")
	public WebElement EnterAdminType;

	@FindBy(xpath = "(//div[contains(@id,'multiple-dropdown')])[1]")
	public WebElement SelectCountry;

	@FindBy(xpath = "((//div[contains(@id,'multiple-dropdown')])[1]//following::input[1])[1]")
	public WebElement EnterCountry;

	@FindBy(xpath = "(//div[contains(@id,'multiple-dropdown')])[3]")
	public WebElement SelectState;

	@FindBy(xpath = "((//div[contains(@id,'multiple-dropdown')])[3]//following::input[1])[1]")
	public WebElement EnterState;

	@FindBy(xpath = "(//div[contains(@id,'multiple-dropdown')])[2]")
	public WebElement SelectCity;

	@FindBy(xpath = "((//div[contains(@id,'multiple-dropdown')])[2]//following::input[1])[1]")
	public WebElement EnterCity;
	
	@FindBy(xpath = "//span[@class=\"invalid-error-text\"][1]")
	public WebElement FirstNameFieldValidation;
	

	public void Click_CreateButton() {
		CreateButton.click();
	}

	public void EnterFirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}

	public void ClearFirstName() {
		FirstName.clear();
	}

	public void EnterLastName(String lastname) {
		LastName.sendKeys(lastname);
	}

	public void ClearLastName() {
		LastName.clear();
	}

	public void EnterEmail(String email) {
		Email.sendKeys(email);
	}

	public void ClearEmail() {
		Email.clear();
	}

	public void EnterTitle(String title) {
		Title.sendKeys(title);
	}

	public void ClearTitle() {
		Title.clear();
	}

	public void EnterContact(String contact) {
		Contact.sendKeys(contact);
	}

	public void ClearContact() {
		Contact.clear();
	}

	public void SelectCode(String code) {
		SelectPhoneCode.click();
		EnterCode.sendKeys(code);
		driver.findElement(By.xpath("//label[text()='" + code + "']")).click();
	}

	public void SelectAdminType(String Type) {
		SelectAdmintype.click();
		driver.findElement(By.xpath("//label[text()='" + Type + "']")).click();
	}

	public void EnterAddress(String address) {
		Address.sendKeys(address);
	}

	public void ClearAddress() {
		Address.clear();
	}

	public void SelectCountry(String country) {
		SelectCountry.click();
		EnterCountry.sendKeys(country);
		driver.findElement(By.xpath("//label[contains(text(),'" + country + "')]/..")).click();

	}

	public void SelectState(String state) {
		SelectState.click();
		EnterState.sendKeys(state);
		driver.findElement(By.xpath("//label[contains(text(),'" + state + "')]/..")).click();

	}

	public void SelectCity(String city) {
		SelectCity.click();
		EnterCity.sendKeys(city);
		driver.findElement(By.xpath("//label[contains(text(),'" + city + "')]/..")).click();

	}
	
	public AdminDashboardPage clickCreateButton() {
		header.CreateButton.click();
		return new AdminDashboardPage(driver);
	}
	
	public String getFirstNameValidationMsg() {
		return FirstNameFieldValidation.getText();
	}
}
