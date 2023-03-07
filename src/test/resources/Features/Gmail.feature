@Gmail
Feature: Gmail

@P9
Scenario Outline: To verify that user is able to login to Gmail
Given user navigate to "https://mail.google.com/" 
When user enters valid "<EmailId>" and "<Password>"
Then user should able to login to gmail and Verify the objects
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P10
Scenario Outline: To verify the total no. of emails received by the user
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on total no. Emails
Then Total no of Emails should be displayed
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P11
Scenario Outline: To verify the total no. of emails marked with STAR
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Starred Emails
Then Total no of Emails should be displayed
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P12
Scenario Outline: To verify and count unread emails in an INBOX
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Unread Emails
Then Total no of Unread Emails should be displayed
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P13
Scenario Outline: To verify and count the read emails in an INBOX
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Read Emails
Then Total no of Read Emails should be displayed
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P14
Scenario Outline: To verify that Compose is working properly
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Compose
Then Compose window should open
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P15
Scenario Outline:To verify that email is Send properly to email address in To,cc & bcc
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Compose and Enter "<To>" "<cc>" "<bcc>"
Then After sending an email, verify that it exists in Sent emails
Examples:
|EmailId|Password|To|cc|bcc|
|vrshholkar@gmail.com|Varsha@123|varshah.holkar@gmail.com|sinare21@gmail.com|sinare21@gmail.com|

@P16
Scenario Outline:To verify the search operation i.e search the emails received from specific email address from INBOX
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click search box and enter Email that need to search
Then user can se all mails received fron that EmailID
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P17
Scenario Outline:To verify the emails which are with attachments in INBOX
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click search box and enter Email with Attachments
Then user can see all Emails with attachments
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P18
Scenario Outline:To verify that Settings page is displayed properly
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Setting 
Then user should navigate to Setting Page and validate 
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P19
Scenario Outline: To verify that emails are moved from source label to target label (Folders)
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user select Email and Click on MoveTo folder
Then user can see Emails are moved to selected folder 
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P20
Scenario Outline:To verify that the new label is properly created
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Create New label 
Then user can see new Label created 
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|

@P21
Scenario Outline: To verify that the user can successfully Sign-out from Gmail
Given user navigate to "https://mail.google.com/"
And user enters valid "<EmailId>" and "<Password>"
When user click on Sign_out
Then user should able to log out 
Examples:
|EmailId|Password|
|vrshholkar@gmail.com|Varsha@123|
