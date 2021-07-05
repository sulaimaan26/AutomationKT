package com.cloudblm.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleTimeout {
	
	WebDriverWait wait;
	
	public HandleTimeout(WebDriver driver) {
		wait = new WebDriverWait(driver, 10);
	}
	
	public void WaitUntil(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
