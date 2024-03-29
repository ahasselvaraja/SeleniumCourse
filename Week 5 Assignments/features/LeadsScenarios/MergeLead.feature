
Feature: Merge Lead in LeafTaps

Scenario: Merging Lead Using Valid Data 

#Test steps for Merge Lead functionality
Given Launch the browser
And Load the url
And Enter the username
And Enter the password
And Click on the login button
And Click on CRM/SFA link
When Click on Leads link
And Click on Merge Leads link from side menu
And Click on the lookup in From Lead
And Enter the First name 
And Click on Find leads button
And Get the text from first result
And Click on the first result lead
Then Click on the lookup in To lead
And Enter the First name 
And Click on Find leads button
And Get the text from first result
And Click on the first result lead
Then Click on Merge button
Then Click on Find leads button
And Enter the Lead id 
And Click on Find leads button
Then Verify resulting Text with copied Text