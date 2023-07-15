Feature: Orange Login functionality

@sanity
Scenario: Verify the Title
Given We are on home page
When I get the title of page
And Verify the expected with actual
Then Result should be true

@smoke
Scenario Outline: Verify invalid user credentials
Given We are on home page
When Enter username as "<username>"
And enter password as "<password>"
And Click on button
Then Validation should appear
Examples:
|username|password|
|Admin11 |111111111111111111111111 |
|Admin|qqqqqqqqqqqqqqqqqq| 

@smoke
Scenario: Verify valid user credentials
Given We are on home page
When Enter valid username as "Admin"
And Enter  valid password as "admin123"
And Click on button
Then Validation should not appear
