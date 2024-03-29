Feature: Registration of new user in RedHat

Scenario: Registering new user with valid data

#Test steps for Registering new user functionality
Given Launch the browser
And Load the url
And Click on Login button
When Click on Register now link
Then Click on the Account type as Personal
And Enter the RedHat Login data <RedHatLogin>
And Enter the Email Address <Email>
And Enter the Password <Password>
And Confirm the Password <Password>

And Enter the Title <Title>
And Enter the First Name <FirstName>
And Enter the Last Name <LastName>
And Select the country as <Country>
And Enter the Address <Address>
And Enter the PostalCode <Pcode>
And Enter the City <City>
And Enter the State <State>
And Enter the Phone Number <Phone>


Examples:
|RedHatLogin|Email|Password|Cname|Title|FirstName|LastName|Country|Address|Pcode|City|State|Phone|
|Ahas001|ahas@gmail.com|Ahas1357@|Demo Company|Demo|Ahas|Selva|India|kanyakumari|600001|Nagercoil|Tamil Nadu|80|
|Ahas002|ahas@gmail.com|Ahas1357@|Demo Company|Demo|Ahas|Selva|India|kanyakumari|600001|Nagercoil|Karnataka|80|


