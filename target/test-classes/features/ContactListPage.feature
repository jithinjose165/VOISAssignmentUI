Feature: Contact list page

@createcontact
Scenario Outline: User creates a new contact
Given User is at login page
And User logs in with "<email>" and "<password>"
When User clicks on Add new contact button and fill the following details
|jithin |jose |1991-06-04 |jithin@gmail.com|1234567890|address1|address2|city|state|678925|India|
Then Verify the newly created user
Examples:
|email 						 |password		 |
| jithin5@gmail.com |Testtest@123 |
