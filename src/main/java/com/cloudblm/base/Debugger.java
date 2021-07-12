package com.cloudblm.base;

import com.cloudblm.sections.HeaderSection;

public class Debugger{
	
	public static void main(String[] args) {
		
		TestBase base = new TestBase();
		base.intialize();
		//Debug Classes
		HeaderSection header = new HeaderSection(base.driver);
		header.clickUpdateButton();
	}

}
