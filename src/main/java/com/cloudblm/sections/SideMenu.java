package com.cloudblm.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cloudblm.pages.AdminDashboardPage;
import com.cloudblm.pages.ProjectDashboardPage;
import com.cloudblm.util.HandleTimeout;

public class SideMenu {
	WebDriver driver;
	HeaderSection header;
	HandleTimeout customtime;
	
	public SideMenu(WebDriver driver){
		PageFactory.initElements(driver, this);
		driver = this.driver;
		//customtime = new HandleTimeout(driver);
		header = new HeaderSection(driver);
	}
	
	@FindBy(xpath="(//div[contains(text(),'Projects')]/..)[1]")
	WebElement ProjectMenu;
	
	@FindBy(xpath="(//div[contains(text(),'Admin')])[1]")
	WebElement AdminMenu;
	
	@FindBy(xpath="(//div[contains(text(),'Business')])[1]")
	WebElement BusinessUnitMenu;	
	
	
	@FindBy(xpath="(//div[contains(text(),'Vendors')])[1]")
	WebElement VendorMenu;
	
	@FindBy(xpath="//div[contains(text(),'Global Assets')]")
	WebElement GlobalAssetMenu;
	
	public ProjectDashboardPage gotoProject() {
		ProjectMenu.click();
		return new ProjectDashboardPage(driver);
	}
	
	public AdminDashboardPage gotoAdmin() {
		//customtime.WaitUntil(AdminMenu);
		AdminMenu.click();
//		try {
//			while(true) {
//				if(header.getPageTitle().contentEquals("Administrators")) {
//					break;
//				}
//				Thread.sleep(500);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		return new AdminDashboardPage(driver);
	}
	
	public void gotoBusinessUnit() {
		ProjectMenu.click();
	}
	
	public void gotoVendor() {
		ProjectMenu.click();
	}
	
	public void gotoGlobalAsset() {
		ProjectMenu.click();
	}
	
	

}
