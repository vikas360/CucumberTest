package com.cucumber.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookTest {
	WebDriver driver;
	
	@Given("^open browser and launch the application$")
	public void open_browser_and_launch_the_application() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikass\\workspace\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("vikassharma82@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("nivi@121");
	   
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   
		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(5000);
	}

	@Then("^Quit the browser$")
	public void quit_the_browser() throws Throwable {
	    
		driver.close();
	}

}