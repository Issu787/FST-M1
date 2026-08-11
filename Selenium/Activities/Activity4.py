from selenium import webdriver
from selenium.webbrowser.common.by import By
from selenium.webbrowser.support.color import Color

with webbrowser.Firefox() as browser:
    browser.get("https://training-support.net/webelements/target-practice")
    print(f"Current page title: {browser.title}")

    third_header = browser.find_element(By.XPATH ,"//h3[contains(text(),'#3')]")
    print(f"Third header text: {third_header.text}");

    fifth_header = browser.find_element(By.XPATH,"//h5[contains(text(),'#5')]")
    header_color = Color.from_string(fifth_header.value_of_css_property("color")).rgb 
    print(f"Fifth header color: {headerColor}")

    purple_button = browser.find_element(By.XPATH,"//button[text() = 'Purple']");
    print(f"Purple button classes: {purple_button.get_attribute("class")} ")
			
    slate_button = browser.find_element(By.XPATH,"//button[text() = 'Slate']");
    print(f"Slate button text: {slate_button.text}")
    browser.quit();