package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity7 extends BaseTest{
	@Test
    public void addQualification() throws InterruptedException {
		//Login
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
        driver.findElement(By.id("btnLogin")).click();

        // Navigate to My Info
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        //Click on Qualifications in the left menu
        driver.findElement(By.linkText("Qualifications")).click();

        //Click Add Work Experience
        driver.findElement(By.id("addWorkExperience")).click();

        //Work Experience details fill
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("QA Engineer");
        
        driver.findElement(By.id("experience_from_date")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("experience_from_date")).sendKeys("2025-01-01");
        
        driver.findElement(By.id("experience_to_date")).clear();
        Thread.sleep(4000);
        driver.findElement(By.id("experience_to_date")).sendKeys("2026-01-01");
        
        //Save Work Experience
        driver.findElement(By.id("btnWorkExpSave")).click();

        //Wait and confirm
        Thread.sleep(4000);
        System.out.println("Qualification (Work Experience) added successfully.");
    }
}
