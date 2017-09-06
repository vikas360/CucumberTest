package com.cucumber.util;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/java/com/cucumber/features"},
		glue={"com.cucumber.stepDefination"},
		plugin= {"html:target/cucumber-html-report",
				"json:target/Destination/cucumber.json",
				}		 
		)

public class TestRunner {

}
