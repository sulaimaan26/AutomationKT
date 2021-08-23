package com.cloudblm.testdata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.cloudblm.util.ExcelInputs;

public class TestDataAdminCreation {
	
	
	@DataProvider(name = "FirstNameFieldInvalid")
	public Object FirstNameFieldInvalid() {
		
		List<Object[]> testdata = ExcelInputs.getdatafrmexcel();		
		return ExcelInputs.getTestDatabasedonID(5, testdata).iterator();
	}

}
