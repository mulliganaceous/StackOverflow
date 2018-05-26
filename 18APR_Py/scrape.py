# Python 3.6.5
# Scrape website for all table data
from selenium import webdriver

driver = webdriver.Firefox()
driver.get('http://example_url.com')

# Returns "[]"
row1s = driver.find_elements_by_class_name("row1")
print(row1s)

# Returns ''
for row in driver.find_elements_by_class_name("row2"):
    print(row.text)
