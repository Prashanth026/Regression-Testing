Feature: Verifying Adactin Hotels details
Scenario Outline: Verifying login details with valid credentials
Given User is on Adactin Hotels homepage
When User enters "<userName>" and "<password>"
And Click the login button
Then Verify the login

Examples: 
|userName|password|
|Prashanth026|Welcome026|


Scenario Outline: Verifying search details using valid credentials
Given User is on Adactin search hotel page
When User enters "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<AdultsPerRoom>" and "<ChilderPerRoom>"
And Click the search button
Then Validate the search option

Examples: 
|Location|Hotels|RoomType|NumberOfRooms|AdultsPerRoom|ChilderPerRoom|
|Sydney|HotelSunshine|Deluxe|2-Two|2-Two|3-Three|

Scenario: Verifying Select Option
Given User is on Select Page
When Select the Hotel
Then Verify and continue

Scenario Outline: Verifying Booking details
Given User is on Adactin booking page
When User enters "<FirstName>","<LastName>","<BillingAddress>" and "<CreditCardNo>" 
And User enter "<CreditCardType>","<ExpiryDateMonth>","<ExpiryDateYear>" and "<CCVNumber>"
Then Click the book option

Examples:

|FirstName|LastName|BillingAddress|CreditCardNo|CreditCardType|ExpiryDateMonth|ExpiryDateYear|CCVNumber|
|Prashanth|Sivaraj|AnnaStreet|1234556789467890|Mastero|September|2014|234|

Scenario: Verifying confirmation
Given User is on final page
Then Print the confirmation number