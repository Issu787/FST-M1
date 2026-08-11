package examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity5 {

	public static void main(String[] args) {

			WebDriver browser = new FirefoxDriver();
			browser.get("https://training-support.net/webelements/dynamic-controls");
			System.out.println("Current page title: "+ browser.getTitle());
			
			WebElement checkbox = browser.findElement(By.xpath("//input[@id = 'checkbox']"));
			System.out.println("Checkbox currently visible: " + checkbox.isDisplayed());
			
			WebElement toggleButton =  browser.findElement(By.xpath("//button[text() = 'Toggle Checkbox']"));
			
			if(checkbox.isDisplayed()) {
				toggleButton.click();
				System.out.println("Checkbox visible after toggle: " +checkbox.isDisplayed());
				
			}
			
			browser.quit();

	}

}
