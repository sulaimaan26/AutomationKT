package com.cloudblm.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	protected WebDriver driver;
	Properties prop; 
	
	public TestBase() {
		try {
			prop = new Properties();			
			prop.load(new FileInputStream(new File("asset/config.properties")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void intialize() {
		if(prop.get("browser").toString().contentEquals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
			driver = new ChromeDriver();			
		}		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	public void quit() {
		driver.quit();
	}
	public static void main(String[] args) {
		TestBase base = new TestBase();
		base.intialize();
		base.quit();
	}
}
