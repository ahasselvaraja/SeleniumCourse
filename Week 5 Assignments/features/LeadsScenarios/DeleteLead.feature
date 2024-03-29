
Feature: Delete Lead in LeafTaps

Scenario: Deleting Lead Using Valid Data 

#Test steps for Delete Lead functionality
Given Launch the browser
And Load the url
And Enter the username
And Enter the password
And Click on the login button
And Click on CRM/SFA link
When Click on Leads link
And Click on Find Leads link from side menu
And Click on phone button
And Enter the phone number
When Click on the Find leads button
And Get the text from the first lead
And Delete the First found lead
When Click on Find leads link from the side menu
And Enter the Name from the text
When Click on the find leads button
Then Verify No leads to be displayed