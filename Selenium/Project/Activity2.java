package com.orangehrm.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.orangehrm.base.BaseTest;

public class Activity2 extends BaseTest {
	    @Test
	    public void getHeaderImageUrl() {
	        String imgUrl = driver.findElement(By.xpath("//img")).getAttribute("src");
	        System.out.println("Header Image URL: " + imgUrl);
	        
	    }
}
