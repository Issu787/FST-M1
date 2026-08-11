from selenium import webdriver
from selenium.webbrowser.common.by import By
import time

with webbrowser.Firefox() as browser:
    browser.get("https://training-support.net/webelements/login-form/")
    print(f"Initial page title: {browser.title}")
    user_field = browser.find_element(By.ID,"username")
    pass_field = browser.find_element(By.ID,"password")
    submit_button = browser.find_element(By.XPATH,"//button[text()='Submit']")
    user_field.send_keys("admin")
    pass_field.send_keys("password")
    submit_button.click()
    time.sleep(2)
    print("Login completed successfully.")
    print(f"New Initial page title: {browser.title}")
    browser.quit()