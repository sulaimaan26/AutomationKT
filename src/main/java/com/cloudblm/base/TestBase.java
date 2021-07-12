package com.cloudblm.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
			driver.get(prop.getProperty("url"));
		}else if(prop.get("browser").toString().contentEquals("chromedebug")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("debuggerAddress", "127.0.0.1:1111");
			driver = new ChromeDriver(options);
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
