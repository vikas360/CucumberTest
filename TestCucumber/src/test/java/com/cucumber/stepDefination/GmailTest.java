package com.cucumber.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailTest {
	WebDriver driver;		
		
	@Given("^open browser and launch the gmail application\\.$")
	public void open_browser_and_launch_the_gmailapplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikass\\workspace\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");		
	}
	
	@When("^Enter valid username and valid password for gmail\\.$")
	public void enter_valid_username_and_valid_password_for_gmail() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("vikass@360logica.com");
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vikas360"); 
	}

	@Then("^user should be login successfully for gmail\\.$")
	public void user_should_be_login_successfully_for_gmail() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(), 'Next')]")).click();
		Thread.sleep(10000);
	}
	
	@Then("^Sign out the gmail account\\.$")
	public void sign_out_the_gmail_account() throws Throwable {
		driver.findElement(By.xpath("//a[contains(@href,'SignOutOptions')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href, 'Logout')]")).click();
	}
	
	@Then("^Quit$")
	public void quit_browser() throws Throwable {
	    
		driver.close();
	}	
}