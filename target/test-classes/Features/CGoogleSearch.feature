Feature: Google search validation
@P7
Scenario Outline: To validate that the Google performs the search operation properly
Given user is on google home page
When user enters "<Search_data>"
Then Search options are displayed
Examples:
|Search_data|
|Amitabh Bachchan |
|Abdul Kalam|