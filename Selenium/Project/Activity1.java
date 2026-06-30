package com.orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.orangehrm.base.BaseTest;

public class Activity1 extends BaseTest {
	
	@Test
	public void verifyWebsiteTitle() {
        String title = driver.getTitle();
        System.out.println("Website Title: " + title);
        Assert.assertEquals(title, "OrangeHRM");
        
    }
	
}
