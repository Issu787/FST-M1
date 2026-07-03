package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity6 extends BaseTest{
	 @Test
	    public void verifyDirectoryMenu() throws InterruptedException {
	        //Login
	        driver.findElement(By.id("txtUsername")).sendKeys("orange");
	        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
	        driver.findElement(By.id("btnLogin")).click();

	        //Locate the directory menu item
	        By directoryMenu = By.id("menu_directory_viewDirectory");

	        // Verify if it is visible
	        Assert.assertTrue(driver.findElement(directoryMenu).isDisplayed(),
	                "Directory menu item is not visible!");
	        
	        Thread.sleep(5000);
	        
	        //Verify if it is clickable
	        Assert.assertTrue(driver.findElement(directoryMenu).isEnabled(),
	                "Directory menu item is not clickable!");

	        //Click on the Directory menu item
	        driver.findElement(directoryMenu).click();

	        //Verify the heading of the page
	        String heading = driver.findElement(By.xpath("//h1")).getText();
	        Assert.assertEquals(heading, "Search Directory",
	                "Page heading does not match 'Search Directory'!");

	        System.out.println("Directory menu verified successfully, heading: " + heading);
	    }

}
