package StepDefs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pageobjects.CheckerToolObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import StepDefs.BaseClass;

public class CheckerTool {
	
	WebDriver driver=BaseClass.driver;
	CheckerToolObjects cto= new CheckerToolObjects();
	String url;
	
	@Given("I am UK citizen and open checker tool")
	public void i_am_UK_citizen_and_open_checker_tool() {
	    driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
	}

	@When("I Accept the coockies")
	public void i_Accept_the_coockies() {
		
		WebElement cookies = driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics"));
		cookies.click();
		System.out.println(cookies);
		
		
	}

	@When("I click on Start button")
	public void i_click_on_Start_button() {
		WebElement startbtn = driver.findElement(By.id("next-button"));
		startbtn.click();
	}

	@When("I put my circumstances in the checker tool")
	public void i_put_my_circumstances_in_the_checker_tool() throws Exception {
		url = cto.selectPrefs();
		System.out.println(url);
		 //url=driver.getCurrentUrl();
	 	}
	
	@Then("I should get the result of whether I will get help or not")
	public void i_should_get_the_result_of_whether_I_will_get_help_or_not() throws Exception {
		//Test for checking the correct result url appearing on the result page 
		
		Assert.assertEquals("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/result",url);
		System.out.println("Passed");
	}
	@Then("Close the Browser")
		public void close_the_broswer() throws Exception{
		 Thread.sleep(5000);
			driver.close();
			System.out.println("Closed");
			
	}
}