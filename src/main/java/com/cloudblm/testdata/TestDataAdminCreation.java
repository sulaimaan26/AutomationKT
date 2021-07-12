package com.cloudblm.testdata;

import org.testng.annotations.DataProvider;

public class TestDataAdminCreation {
	
	
	@DataProvider(name = "FirstNameFieldInvalid")
	public Object FirstNameFieldInvalid() {
		return new Object[][]{
			{"@@@","Please enter valid First Name"},
			{"$%^^","Please enter valid First Name"},
			{"aa","First Name should be 3 to 30 characters"},
			{"aassssssssssssssssssssssssssssssssssssssss","First Name should be 3 to 30 characters"}
		};
	}

}
