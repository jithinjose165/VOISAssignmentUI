Feature: New User Registration

@registration
Scenario: Verify successfull registration of user
Given User launch the application
And Click on Signup
When I register as new user with following details

|jithin  | jose 	| jithin10@gmail.com |Testtest@123	|


Then I should be able to register