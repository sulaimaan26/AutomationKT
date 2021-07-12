package com.cloudblm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCreation {
	WebDriver driver;

	public AdminCreation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		driver = this.driver;

	}

	// CreateButton
	@FindBy(xpath = "//button[text()='Create']")
	public WebElement CreateButton;

	// EnterFirstName
	@FindBy(xpath = "//input[@formcontrolname='FirstName']")
	public WebElement FirstName;

	// EnterLastName
	@FindBy(xpath = "//input[@formcontrolname='LastName']")
	public WebElement LastName;

	// EnterEmail
	@FindBy(xpath = "//input[@formcontrolname='EmailID']")
	public WebElement Email;

	// EnterTitle
	@FindBy(xpath = "//input[@formcontrolname='Title']")
	public WebElement Title;

	// EnterContact
	@FindBy(xpath = "//input[@formcontrolname='Contact']")
	public WebElement Contact;

	// SelectPhoneCode
	@FindBy(id = "phoneCode")
	public WebElement SelectPhoneCode;

	// EnterCode
	@FindBy(xpath = "//div[@id='phoneCode']//input[1]")
	public WebElement EnterCode;

	// EnterAddress
	@FindBy(xpath = "//input[@formcontrolname='Address']")
	public WebElement Address;

	// AdmintypeDropdown
	@FindBy(id = "admintypeDropdown")
	public WebElement SelectAdmintype;

	// EnterAdminType
	@FindBy(xpath = "(//div[@id ='admintypeDropdown']//following::input[1])[1]")
	public WebElement EnterAdminType;

	// SelectCountry
	@FindBy(xpath = "(//div[contains(@id,'multiple-dropdown')])[1]")
	public WebElement SelectCountry;

	// EnterCountry
	@FindBy(xpath = "((//div[contains(@id,'multiple-dropdown')])[1]//following::input[1])[1]")
	public WebElement EnterCountry;

	// SelectState
	@FindBy(xpath = "(//div[contains(@id,'multiple-dropdown')])[3]")
	public WebElement SelectState;

	// EnterState
	@FindBy(xpath = "((//div[contains(@id,'multiple-dropdown')])[3]//following::input[1])[1]")
	public WebElement EnterState;

	// SelectCity
	@FindBy(xpath = "(//div[contains(@id,'multiple-dropdown')])[2]")
	public WebElement SelectCity;

	// EnterCity
	@FindBy(xpath = "((//div[contains(@id,'multiple-dropdown')])[2]//following::input[1])[1]")
	public WebElement EnterCity;

	public void Click_CreateButton() {
		CreateButton.click();
	}

	public void Enter_FirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}

	public void Clear_FirstName() {
		FirstName.clear();
	}

	public void Enter_LastName(String lastname) {
		LastName.sendKeys(lastname);
	}

	public void Clear_LastName() {
		LastName.clear();
	}

	public void Enter_Email(String email) {
		Email.sendKeys(email);
	}

	public void Clear_Email() {
		Email.clear();
	}

	public void Enter_Title(String title) {
		Title.sendKeys(title);
	}

	public void Clear_Title() {
		Title.clear();
	}

	public void Enter_Contact(String contact) {
		Contact.sendKeys(contact);
	}

	public void Clear_Contact() {
		Contact.clear();
	}

	public void Select_Code(String code) {
		SelectPhoneCode.click();
		EnterCode.sendKeys(code);
		driver.findElement(By.xpath("//label[text()='" + code + "']")).click();
	}

	public void Select_AdminType(String Type) {
		SelectAdmintype.click();
		driver.findElement(By.xpath("//label[text()='" + Type + "']")).click();
	}

	public void Enter_Address(String address) {
		Address.sendKeys(address);
	}

	public void Clear_Address() {
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
}
