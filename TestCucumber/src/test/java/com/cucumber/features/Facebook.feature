Feature: Facebook smoke test

@TestFacebook
Scenario: Test facebook login functionality

Given open browser and launch the application
When I enter valid username and valid password
Then user should be able to login successfully
And Quit the browser

@TestGmail
Scenario: Test Gmail Login

Given open browser and launch the application.
When  click on the gmail button.
When  Enter valid username and valid password for gmail.
Then  user should be login successfully for gmail.
And   Quit