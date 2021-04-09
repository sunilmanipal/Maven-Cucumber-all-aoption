@Login
Feature: To validate Login Application
1) Valid case
2) Invalid case

Background: 
Given We should be in the Home Page

#
#Scenario: To Test Login with Valid scenario
#When Enter the valid name "Admin" 
#And Enter valid password "admin123" 
#And Click on Login validButton 
#Then I should see the userName as "Welcome Paul" 
#
#Scenario: To Test Login with Valid scenario
#When Enter the valid name "Admin" 
#And Enter valid password "admin123" 
#And Click on Login validButton 
#Then I should see the userName as "Welcome Paul" 
#To test multiple scenario/ multiple data for one scenario you use scenario outline

Scenario Outline: To Test Login With Different Data
When Enter the valid name "<user>"
And Enter valid password "<pwd>"
And Click on Login validButton 
Then I should see the userName as "<loginName>"

Examples: 
|user	|pwd		 |loginName   | 
|Admin|admin123|Welcome Paul|
|Admin|admin123|Welcome Paul|

@Invalidcase
Scenario: To Test Login With Invalid Scenario
When Enter the invalid Name "sunil" 
And Enter invalid password "sunil" 
And Click on Login invalidButton 
Then I should see the invalid credential as "Invalid credentials" 