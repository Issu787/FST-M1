from selenium import webdriver
from selenium.webbrowser.common.by import By

with webbrowser.Firefox() as browser:
    browser.get("https://training-support.net/webelements/dynamic-controls");
    print(f"Current page title: {browser.title}")
			
    checkbox = browser.find_element(By.XPATH,"//input[@id = 'checkbox']")
    print(f"Checkbox currently visible: {checkbox.is_displayed()}")
    print(f"Checkbox selected state: {checkbox.is_selected()}")
    checkbox.click()
    print(f"Checkbox selected state: {checkbox.is_selected()}")
    browser.quit()