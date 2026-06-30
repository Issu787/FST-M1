package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity4 extends BaseTest {
	@Test
    public void addEmployee() throws InterruptedException {
		
		String firstName = "Mohammed";
        String lastName = "Ishaq";
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
        driver.findElement(By.id("btnLogin")).click();
        
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(firstName);
        driver.findElement(By.id("searchBtn")).click();

        Thread.sleep(5000);
        WebElement employeeNameCell = driver.findElement(By.xpath("//a[contains(text(),'" + firstName + "')]"));
        Assert.assertTrue(employeeNameCell.isDisplayed(), "Employee not found in list — creation failed!");

        System.out.println("Employee '" + firstName + " " + lastName + "' successfully created and verified.");
    }
}
