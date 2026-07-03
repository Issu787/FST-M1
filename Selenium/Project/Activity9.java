package com.orangehrm.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity9 extends BaseTest{
	@Test
    public void retrieveEmergencyContacts() throws InterruptedException {
        // Step 1: Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
        driver.findElement(By.id("btnLogin")).click();

        // Step 2: Navigate to "My Info"
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        // Step 3: Click on "Emergency Contacts" in the left menu
        driver.findElement(By.linkText("Emergency Contacts")).click();

        // Step 4: Retrieve all rows from the Emergency Contacts table
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']//tbody/tr"));

        // Step 5: Verify table is not empty
        Assert.assertTrue(rows.size() > 0, "No emergency contacts found!");

        // Step 6: Print each contact’s details
        for (WebElement row : rows) {
            String contactDetails = row.getText();
            System.out.println("Emergency Contact: " + contactDetails);
        }

        System.out.println("Emergency contacts retrieved successfully.");
    }
}
