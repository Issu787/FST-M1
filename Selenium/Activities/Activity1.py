from selenium import webdriver
from selenium.webdriver.common.by import By

with webdriver.Firefox() as browser:
    browser.get("https://training-support.net")

    print(f"Home page title: {browser.title}")

    about_link = browser.find_element(By.LINK_TEXT, "About Us")
    about_link.click()

    print("About Us link selected successfully")
    print(f"About page title: {browser.title}")
