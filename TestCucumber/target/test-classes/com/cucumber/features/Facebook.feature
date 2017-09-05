Feature: Facebook smoke test

Scenario: Test facebook login functionality

Given open browser and launch the application
When I enter valid username and valid password
Then user should be able to login successfully
And Quit the browser