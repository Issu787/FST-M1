package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
protected WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://hrm.alchemy.hguy.co/");
		//driver.wait(10000);
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
