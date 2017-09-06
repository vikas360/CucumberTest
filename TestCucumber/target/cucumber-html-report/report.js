$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Gmail.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail smoke test",
  "description": "",
  "id": "gmail-smoke-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test Gmail Login",
  "description": "",
  "id": "gmail-smoke-test;test-gmail-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestGmail"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "open browser and launch the gmail application.",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Enter valid username and valid password for gmail.",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be login successfully for gmail.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Sign out the gmail account.",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Quit",
  "keyword": "And "
});
formatter.match({
  "location": "GmailTest.open_browser_and_launch_the_gmailapplication()"
});
formatter.result({
  "duration": 10435019288,
  "status": "passed"
});
formatter.match({
  "location": "GmailTest.enter_valid_username_and_valid_password_for_gmail()"
});
formatter.result({
  "duration": 2326977404,
  "status": "passed"
});
formatter.match({
  "location": "GmailTest.user_should_be_login_successfully_for_gmail()"
});
formatter.result({
  "duration": 10079963319,
  "status": "passed"
});
formatter.match({
  "location": "GmailTest.sign_out_the_gmail_account()"
});
formatter.result({
  "duration": 10338682489,
  "status": "passed"
});
formatter.match({
  "location": "GmailTest.quit_browser()"
});
formatter.result({
  "duration": 2316789088,
  "status": "passed"
});
});