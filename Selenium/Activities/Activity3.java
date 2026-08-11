package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver browser = new FirefoxDriver();
		browser.get("https://training-support.net/webelements/login-form/");
		System.out.println("Initial page title: "+browser.getTitle());
		WebElement userField = browser.findElement(By.xpath("//input[@name='username']"));
		WebElement passField = browser.findElement(By.xpath("//input[@name = 'password']"));
		WebElement submitButton = browser.findElement(By.xpath("//button[text()='Submit']"));
		userField.sendKeys("admin");
		passField.sendKeys("password");
		submitButton.click();
		Thread.sleep(2000);
		System.out.println("Login completed successfully.");
		System.out.println("New Initial page title: "+browser.getTitle());
	    browser.quit();
	}
}
