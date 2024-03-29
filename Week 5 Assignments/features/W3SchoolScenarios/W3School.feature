Feature: Check out user form in W3School

Scenario: Checking out user form with valid data

#Test steps for Checking out user form functionality
Given Launch the browser
And Load the url
When Switch to frame to enter details
Then Enter the Full Name <Name>
And Enter the email <Email>
And Enter the Address <Address>
And Enter the City <City>
And Enter the State <State>
And Enter the zip code <Zip>
And Enter the the expiry year <ExpYear>
And Enter the expiry month <ExpMonth>
And Enter the Cvv <Cvv>
And Enter the Credit card number <CreditCard>
And Enter the Name on card <Name>


Examples:
|Name|Email|Address|City|State|Zip|ExpYear|ExpMonth|Cvv|CreditCard|
|Ahas Selva Raja|ahas@gmail.com|Kanyakumari|Nagercoil|Tamil Nadu|"600001"|"2025"|"07"|"230"|"1234567890"|
