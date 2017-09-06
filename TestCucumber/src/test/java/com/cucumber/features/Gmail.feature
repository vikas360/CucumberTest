Feature: Gmail smoke test

@TestGmail
Scenario: Test Gmail Login

Given open browser and launch the gmail application.
When  Enter valid username and valid password for gmail.
Then  user should be login successfully for gmail.
Then  Sign out the gmail account.
And   Quit