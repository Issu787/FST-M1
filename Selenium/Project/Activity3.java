package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity3 extends BaseTest{
	@Test
	public void loginToSite() {
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
        driver.findElement(By.id("btnLogin")).click();
        boolean dashboardVisible = driver.findElement(By.xpath("//h1[text()='Dashboard']")).isDisplayed();
        Assert.assertTrue(dashboardVisible, "Login failed: Dashboard heading not found!");
   
    }

}
