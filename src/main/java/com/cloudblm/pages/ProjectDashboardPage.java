package com.cloudblm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cloudblm.sections.HeaderSection;

public class ProjectDashboardPage {
	
	HeaderSection headers;
	
	public ProjectDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		headers = new HeaderSection(driver);
	}
	
	public void clickCreateButton() {
		headers.clickCreateButton();
	}

}
