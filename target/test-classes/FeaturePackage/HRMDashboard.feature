Feature: HRM dashboard functionality

@sanity
Scenario: Add employee information using valid details
Given We are on home page
When Enter valid username as "Admin"
And Enter  valid password as "admin123"
And Click on button
Then User should redirect to PIM module page
And Enter Employee details 
| EmpName | UserName | Password | Confirm_Password |
| Gaurav | 123 | p1 | CP1 |
| Neha| 1234 | p11 | CP11 |
And User select userrole from dropdown 

