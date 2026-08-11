from selenium import webdriver
from selenium.webbrowser.common.by import By


with webbrowser.Firefox() as browser:
	
    browser.get("https://training-support.net/webelements/dynamic-controls")
    print(f"Current page title: {browser.title}")

    checkbox = browser.find_element(By.XPATH,"//input[@id = 'checkbox']")
    print(f"Checkbox currently visible: {checkbox.is_displayed()}")

    toggle_button =  browser.find_element(By.XPATH,"//button[text() = 'Toggle Checkbox']")
    if(checkbox.is_displayed()) :
       toggle_button.click()
       print(f"Checkbox visible after toggle: {checkbox.is_displayed()}")
    browser.quit()