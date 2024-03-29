
Feature: Create Lead in LeafTaps

Scenario: Creating Lead Using Valid Data 

#Test steps for Create Lead functionality
Given Launch the browser
And Load the url
And Enter the username
And Enter the password
When Click on the login button
Then Verify login is successful
When Click on CRMSFA link
And Click on Leads link
And Click on Create Lead link from side menu
Given Enter the Company name as <cname>
And Enter thr Firstname as <fname>
And Enter the Last name as <lname>
And Enter the Phone number <phno>
When Click on Submit button


Examples:
      |phno|fname|lname|cname|
      |80|Ahas|SelvaRaja|Testleaf|
      |95|John|M|Qeagle|
      |42|Hari|R|Testleaf|
