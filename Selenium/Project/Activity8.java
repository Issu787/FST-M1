package com.orangehrm.tests;

import com.orangehrm.base.BaseTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity8 extends BaseTest{
	@Test
    public void applyLeave() throws InterruptedException {
        
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        driver.findElement(By.id("txtPassword")).sendKeys("5Nx#I6BK%r3$8vz0ch");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        driver.findElement(By.id("menu_leave_applyLeave")).click();

        WebElement leaveTypeDropdown = driver.findElement(By.id("applyleave_txtLeaveType"));
        Select leaveType = new Select(leaveTypeDropdown);
        leaveType.selectByVisibleText("Holiday");
        
        driver.findElement(By.id("applyleave_txtFromDate")).clear();
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2026-08-10");

        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2026-08-10");

        driver.findElement(By.id("applyleave_txtComment")).sendKeys("Applying annual leave for personal work.");

        driver.findElement(By.id("applyBtn")).click();

        Thread.sleep(4000); // wait for confirmation
        
        WebElement leaveList = driver.findElement(By.id("menu_leave_viewMyLeaveList"));
        leaveList.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fromInput = driver.findElement(By.id("calFromDate"));
        fromInput.clear();
        fromInput.sendKeys("2026-08-10");
        WebElement toInput = driver.findElement(By.id("calToDate"));
        toInput.clear();
        toInput.sendKeys("2026-08-10");
        WebElement search = driver.findElement(By.id("btnSearch"));
        search.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement status = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[3]/table/tbody/tr[2]/td[6]"));
        System.out.println("Status is: " + status.getText());
        System.out.println("Leave applied successfully for Annual Leave from 2026-08-10 to 2026-08-10.");
    }
}
