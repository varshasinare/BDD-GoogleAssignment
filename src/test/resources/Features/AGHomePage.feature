@HomePageTest
Feature: validation of Google homepage

@P1
Scenario: To verify that the Google web page is launched successfully 
Given user hit www.google.co.in
When user is on google home page
Then Verify given Elements on homepage

@P2
Scenario: To verify all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Google+, Translate, Photos) in the dialog box
Given user is on google home page
When user click on Google apps
Then All Apps should be displayed

@P3
Scenario: To verify that all the Google apps (My Account, Search, Maps, YouTube, Play, News, Gmail, Drive, Calender, Google+, Translate, Photos) are launched properly 
Given user is on google home page
When user click on Google apps
Then All Apps should be displayed and HomePage of respective App should open 

@P4
Scenario: To verify that the user is able to Sign-in to the Google apps-My Account
Given user click on Google apps
When user enters  active EmailID "vrshholkar@gmail.com" and Password "Varsha@123"
Then user should navigate to Apps homepage

@P5
Scenario: To verify that clicking on the language links (Hindi, Marathi etc) launches Google in respective language
Given user is on google home page
When user click on setting and then search setting then select language
And Select desired language and press Save
Then HomePage should be displayed in resp language

@P6
Scenario: To open and close the browser
Given user hit www.google.co.in
When user is on google home page
Then User close browser