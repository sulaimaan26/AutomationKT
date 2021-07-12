package com.cloudblm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloudblm.util.HandleTimeout;

public class LoginPage {
	HandleTimeout customtimeout;
	WebDriver driver;
	
	@FindBy(id="username")
	WebElement EmailIDField;
	
	@FindBy(id="userkey")
	WebElement PasswordField;
	
	@FindBy(xpath="(//button)[2]")
	WebElement SignInbutton;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		customtimeout = new HandleTimeout(driver);
		this.driver = driver;
	}
	
	public void enterEmail(String Email) {
		customtimeout.WaitUntil(EmailIDField);
		EmailIDField.sendKeys(Email);
	}
	
	public void clearEmailField() {
		customtimeout.WaitUntil(EmailIDField);
		EmailIDField.clear();
	}
	
	public String getEnteredEmail() {
		customtimeout.WaitUntil(EmailIDField);
		return EmailIDField.getText();
	}
	
	public void enterPassword(String Password) {
		customtimeout.WaitUntil(EmailIDField);
		PasswordField.sendKeys(Password);
	}
	
	public void clearPasswordField() {
		customtimeout.WaitUntil(PasswordField);
		PasswordField.clear();
	}
	
	public String getEnteredPassword() {
		customtimeout.WaitUntil(PasswordField);
		return PasswordField.getText();
	}
	
	public ProjectDashboardPage signin() {
		customtimeout.WaitUntil(SignInbutton);
		SignInbutton.click();
		return new ProjectDashboardPage(driver);
	}

}
