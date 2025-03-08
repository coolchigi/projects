from selenium import webdriver
from selenium.webdriver.chrome.service import Service as ChromeService
from selenium.webdriver.common.by import By
from webdriver_manager.chrome import ChromeDriverManager

import time

for i in range(1, 1000):
    driver = webdriver.Chrome(service=ChromeService(ChromeDriverManager().install()))
    driver.get("https://ai.google.dev/competition/projects/arborist-studio")
    element = driver.find_element(By.XPATH, '//*[@id="gc-wrapper"]/main/devsite-content/article/div[2]/devsite-gemini-project-page/div[2]/div[2]/div/div')
    element.click()
    print(i)
    time.sleep(0.2) # change this if you want to see it actually click
    driver.close()