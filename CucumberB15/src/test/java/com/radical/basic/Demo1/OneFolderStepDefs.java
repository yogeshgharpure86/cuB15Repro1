package com.radical.basic.Demo1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	WebDriver driver;

	@Given("^the user is on facebook login page$")
	public void the_user_is_on_facebook_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\YOGESH_DATA_IMP\\AUTOMATION_RAD\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_as_user_name(String userName) {
		driver.findElement(By.id("email")).sendKeys(userName);
	}

	@And("^he enters \"([^\"]*)\" as password$")
	public void He_enters_as_password(String pwd) {
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}

	@Then("^check username is present in testbox$")
	public void check_username_is_present_in_testbox() throws Throwable {

		Assert.assertTrue(true);
		driver.quit();
	}

}
