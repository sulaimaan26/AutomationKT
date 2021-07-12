package com.cloudblm.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cloudblm.base.TestBase;
import com.cloudblm.pages.LoginPage;
import com.cloudblm.pages.ProjectDashboardPage;

public class TestCreateProject extends TestBase{
	
	LoginPage loginpage;
	ProjectDashboardPage projectdashboard;
	
	@BeforeTest
	public void start() {
		intialize();
		loginpage = new LoginPage(driver);
	}
	
	@BeforeClass	
	public void Login() {
		loginpage.enterEmail("");
		loginpage.enterPassword("sst12345");
		projectdashboard =  loginpage.signin();
		projectdashboard.clickCreateButton();
	}
	
	@Test(description="Check Project can be created with only mandatory fields")
	public void CreateProject() {
		
	}
}
