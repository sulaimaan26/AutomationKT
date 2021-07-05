package com.cloudblm.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cloudblm.base.TestBase;
import com.cloudblm.pages.LoginPage;

public class TestLoginPage extends TestBase {
	
	LoginPage loginpage;
	
	@BeforeTest
	public void start() {
		intialize();
		loginpage = new LoginPage(driver);
	}

	@Test(description = "Test login with valid Email and Password")
	public void TestLogin001() {
		loginpage.enterEmail("blmadmin@srinsofttech.com");
		loginpage.enterPassword("sst12345");
		loginpage.signin();
	}
	
	
	@AfterTest
	public void TearDown() {
		quit();
	}
	
}
