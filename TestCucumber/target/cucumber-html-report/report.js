$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Facebook.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook smoke test",
  "description": "",
  "id": "facebook-smoke-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test facebook login functionality",
  "description": "",
  "id": "facebook-smoke-test;test-facebook-login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be able to login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookTest.open_browser_and_launch_the_application()"
});
formatter.result({
  "duration": 6675404116,
  "status": "passed"
});
formatter.match({
  "location": "FacebookTest.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 441495004,
  "status": "passed"
});
formatter.match({
  "location": "FacebookTest.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 11272382716,
  "status": "passed"
});
formatter.match({
  "location": "FacebookTest.quit_the_browser()"
});
formatter.result({
  "duration": 2382314852,
  "status": "passed"
});
});