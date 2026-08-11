package examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity7 {

	public static void main(String[] args) {

			WebDriver browser = new FirefoxDriver();
			browser.get("https://training-support.net/webelements/dynamic-controls");
			System.out.println("Current page title: "+ browser.getTitle());
			
			WebElement textBox = browser.findElement(By.xpath("//input[@id = 'textInput']"));
			WebElement enableButton  =  browser.findElement(By.xpath("//button[text() = 'Enable Input']"));
			System.out.println("Text box currently visible: " + textBox.isDisplayed());
			
			System.out.println("Text box enabled state: " +textBox.isEnabled());
			
			enableButton.click();
				
			System.out.println("Text box enabled state: " +textBox.isEnabled());
			
			browser.quit();

	}

}
