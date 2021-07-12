package com.cloudblm.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cloudblm.base.TestBase;
import com.cloudblm.pages.AdminCreation;
import com.cloudblm.pages.AdminDashboardPage;
import com.cloudblm.pages.LoginPage;
import com.cloudblm.sections.HeaderSection;
import com.cloudblm.sections.SideMenu;
import com.cloudblm.testdata.TestDataAdminCreation;

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
	public void Prerequiste() {
		loginpage.enterEmail("blmadmin@srinsofttech.com");
		loginpage.enterPassword("sst12345");
		loginpage.signin();
		sidemenu = new SideMenu(driver);
		header = new HeaderSection(driver);
		admindashboard = sidemenu.gotoAdmin();
		header.clickCreateButton();
		admincreation = new AdminCreation(driver);
		
	}
	
	
	@Test(description = "Check admin can be created with only mandatory field")
	public void TestSiteAdminCreation() throws InterruptedException {		
		admincreation.EnterFirstName("Andrew");
		admincreation.EnterLastName("Jones");
		admincreation.EnterEmail("andrewjones@sst.in");
		header.clickCreateButton();	
	}
	
	@Test(description = "Check FirstName mandatory field validation")
	public void CheckFirstNameFieldValidation() {	
		header.clickCreateButton();	
		assertEquals(admincreation.getFirstNameValidationMsg(), "First Name is required");
		header.clickCreateButton();	
		sidemenu.gotoAdmin();
	}
	
	
	@Test(description = "Check FirstName Negative field validation",dataProviderClass = TestDataAdminCreation.class,dataProvider = "FirstNameFieldInvalid")
	public void CheckFirstNamenegativeFieldValidation(String TestData,String ValidationMsg) {	
		header.clickCreateButton();	
		admincreation.EnterFirstName(TestData);
		assertEquals(admincreation.getFirstNameValidationMsg(), ValidationMsg);
		header.clickCreateButton();	
		admincreation.ClearFirstName();
	}
	
		
	@AfterTest
	public void TearDown() {
		quit();
	}
	
	
	
	
}
