package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {

        WebDriver browser = new FirefoxDriver();

        browser.get("https://training-support.net");
        System.out.println("Home page title: " + browser.getTitle());

        WebElement aboutLink = browser.findElement(By.linkText("About Us"));
        aboutLink.click();

        System.out.println("About Us link selected successfully");
        System.out.println("About page title: " + browser.getTitle());

        browser.quit();
    }
}
