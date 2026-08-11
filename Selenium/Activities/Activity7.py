from selenium import webdriver
from selenium.webbrowser.common.by import By

with webbrowser.Firefox() as browser:
    browser.get("https://training-support.net/webelements/dynamic-controls")
    print(f"Current page title: {browser.title}")
	
    text_box = browser.find_element(By.XPATH,"//input[@id = 'textInput']")
    enable_button =  browser.find_element(By.XPATH,"//button[text() = 'Enable Input']")
    print(f"Text box currently visible: {text_box.is_displayed()}")
    print(f"Text box enabled state: {text_box.is_enabled()}")
    enable_button.click()
    print(f"Text box enabled state: {text_box.is_enabled()}")
    browser.quit()