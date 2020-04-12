Feature: Automate the Amazon Website

Scenario Outline: Navigate through the Amazon Site and Validate

Given Open the Chrome Browser
Then Open the Amazon Website by passing the URL
And Verify the title of the Page
Then Click on SignIn
And Enter Username as "<username>"
Then Enter Password as "<password>"


Examples: 
|username|password|
|9748274001|soumi56742|