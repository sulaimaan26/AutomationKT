package com.cloudblm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cloudblm.sections.HeaderSection;
import com.cloudblm.sections.SideMenu;


public class AdminDashboardPage {
	
	WebDriver driver;
	SideMenu sidemenu;
	HeaderSection header;
	
	public AdminDashboardPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		driver = this.driver;
		this.sidemenu = new SideMenu(driver);
		this.header = new HeaderSection(driver);
	}
	
	public AdminCreation clickCreateButton() {
		header.CreateButton.click();
		return new AdminCreation(driver);
	}
	
	public AdminCreation clickCancelButton() {
		header.CancelButton.click();
		return new AdminCreation(driver);
	}
	

}
