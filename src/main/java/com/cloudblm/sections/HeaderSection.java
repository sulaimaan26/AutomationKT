package com.cloudblm.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderSection {
	
	public HeaderSection(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Create']")
	public WebElement CreateButton;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement CancelButton;
	
	@FindBy(xpath="//button[text()='Update']")
	public WebElement UpdateButton;
	
	@FindBy(tagName ="h2")
	public WebElement PageTitle;
	
	@FindBy(xpath="")
	public WebElement BreadcrumbOne;
	
	@FindBy(xpath="")
	public WebElement BreadcrumbTwo;
	
	@FindBy(xpath="")
	public WebElement BreadcrumbThree;
	
	@FindBy(xpath="")
	public WebElement BreadcrumbFour;
	
	
	public void clickCreateButton() {
		CreateButton.click();
	}
	
	public void clickCancelButton() {
		CancelButton.click();
	}
	
	public void clickUpdateButton() {
		UpdateButton.click();
	}
	
	public String getPageTitle() {
		return PageTitle.getText();
	}
	
	

}
