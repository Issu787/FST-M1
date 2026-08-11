package examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity4 {

	public static void main(String[] args) {

			WebDriver browser = new FirefoxDriver();
			browser.get("https://training-support.net/webelements/target-practice");
			System.out.println("Current page title: "+ browser.getTitle());
			
			WebElement thirdHeader = browser.findElement(By.xpath("//h3[contains(text(),'#3')]"));
			System.out.println("Third header text: " + thirdHeader.getText());
			
			WebElement fifthHeader = browser.findElement(By.xpath("//h5[contains(text(),'#5')]"));
			Color headerColor = Color.fromString(fifthHeader.getCssValue("color"));
			
			System.out.println("Fifth header color: " + headerColor.asRgb());
			
			
			WebElement purpleButton = browser.findElement(By.xpath("//button[text() = 'Purple']"));
			System.out.println("Purple button classes: " + purpleButton.getAttribute("class"));
			
			WebElement slateButton = browser.findElement(By.xpath("//button[text() = 'Slate']"));
			System.out.println("Slate button text: " + slateButton.getText());
			browser.quit();

	}

}
