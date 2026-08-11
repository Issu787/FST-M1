package examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity8 {

	public static void main(String[] args) {

			WebDriver browser = new FirefoxDriver();
			browser.get("https://training-support.net/webelements/dynamic-controls");
			WebDriverWait wait  =  new WebDriverWait(browser,Duration.ofSeconds(10));
			
			System.out.println("Current page title: "+ browser.getTitle());
			
			WebElement checkbox = browser.findElement(By.xpath("//input[@id = 'checkbox']"));
			System.out.println("Checkbox currently visible: " + checkbox.isDisplayed());
			WebElement toggleButton =  browser.findElement(By.xpath("//button[text() = 'Toggle Checkbox']"));
			toggleButton.click();
			
			wait.until(ExpectedConditions.invisibilityOf(chkBox));
			System.out.println("Checkbox visible after toggling: " + checkbox.isDisplayed());
			
			toggleButton.click();
			wait.until(ExpectedConditions.elementToBeClickable(chkBox)).click();
			
			System.out.println("Checkbox is visible again and selected: " + checkbox.isSelected());
			
			browser.quit();

	}

}
