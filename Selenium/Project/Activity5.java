package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity5 extends BaseTest {
	@Test
	public void editUserInfo() throws InterruptedException {
  
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Ishaq");

        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Tester");

        // Select Gender (Male radio button
        driver.findElement(By.id("personal_optGender_1")).click(); // Male
        
        //Select Nationality from dropdown -- INDIAN
        driver.findElement(By.id("personal_cmbNation")).sendKeys("Indian");

        //Enter Date of Birth
        driver.findElement(By.id("personal_DOB")).clear();
        driver.findElement(By.id("personal_DOB")).sendKeys("1990-01-01");

        //Save changes
        driver.findElement(By.id("btnSave")).click();

        //Wait briefly and confirm save
        Thread.sleep(7000);
        System.out.println("User information updated successfully.");
    }
}