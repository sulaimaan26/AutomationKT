package com.cloudblm.util;

import org.openqa.selenium.WebDriver;

public class HandleBrowserAlerts {
	WebDriver driver;
	
	public HandleBrowserAlerts(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean dismissAlert(){
		try {
			driver.switchTo().alert().dismiss();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean acceptAlert(){
		try {

			driver.switchTo().alert().accept();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
