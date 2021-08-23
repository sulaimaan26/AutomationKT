package com.cloudblm.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cloudblm.base.TestBase;
import com.cloudblm.pages.AdminCreation;
import com.cloudblm.pages.AdminDashboardPage;
import com.cloudblm.pages.LoginPage;
import com.cloudblm.sections.HeaderSection;
import com.cloudblm.sections.SideMenu;
import com.cloudblm.testdata.TestDataAdminCreation;
import com.cloudblm.util.HandleBrowserAlerts;

public class TestAdminCreation extends TestBase {
	
	LoginPage loginpage;
	AdminCreation admincreation;
	AdminDashboardPage admindashboard;
	SideMenu sidemenu;
	HeaderSection header;
	
	@BeforeTest
	public void start() {
		intialize();
		loginpage = new LoginPage(driver);
	}
	
	@BeforeClass
	public void Prerequiste() throws InterruptedException {
		loginpage.enterEmail("blmadmin@srinsofttech.com");
		loginpage.enterPassword("sst12345");
		loginpage.signin();
		header = new HeaderSection(driver);		
		sidemenu = new SideMenu(driver);		
	}
	
	@BeforeMethod
	public void navigate() {
		admindashboard = sidemenu.gotoAdmin();
		HandleBrowserAlerts ff = new HandleBrowserAlerts(driver);
		ff.acceptAlert();
		header.clickCreateButton();
		admincreation = new AdminCreation(driver);
	}
	
	
	//@Test(description = "Check admin can be created with only mandatory field")
	public void TestSiteAdminCreation() throws InterruptedException {		
		admincreation.EnterFirstName("Andrew");
		admincreation.EnterLastName("Jones");
		admincreation.EnterEmail("andrewjones@sst.in");
		header.clickCreateButton();	
	}
	
	//@Test(description = "Check FirstName mandatory field validation")
	public void CheckFirstNameFieldValidation() {	
		header.clickCreateButton();	
		String actulamsg = admincreation.getFirstNameValidationMsg();
		assertEquals(actulamsg, "First Name is required");	
		admincreation.ClearFirstName();
	}
	
	
	@Test(description = "Check FirstName Negative field validation",dataProviderClass = TestDataAdminCreation.class,dataProvider = "FirstNameFieldInvalid")
	public void CheckFirstNamenegativeFieldValidation(String TestData,String ExpectedMsg) {			
		admincreation.EnterFirstName(TestData);
		header.clickCreateButton();	
		String actulamsg = admincreation.getFirstNameValidationMsg();
		admincreation.ClearFirstName();
		Assert.assertEquals(actulamsg, ExpectedMsg);			
	}
	
		
	@AfterTest
	public void TearDown() {
		quit();
	}
	
	
	
	
}
