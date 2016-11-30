package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Step {
	public static WebDriver driver;
	//WebDriver driver = new ChromeDriver();
	@Given("^I am on Facebook Home Page$")
	public void i_am_on_Facebook_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aurph\\Desktop\\Workspace\\selenium-java-3.0.0-beta4\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
	}
	@When("^I input my valid Phone No\\.$")
	public void i_input_my_valid_Phone_No() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_5']")).sendKeys("9292787238");


	}

	@When("^input different phone no in next field$")
	public void input_different_phone_no_in_next_field() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_8']")).sendKeys("123456785");
	}

	@When("^I click on Phone no and re enter phone No\\. field$")
	public void i_click_on_Phone_no_and_re_enter_phone_No_field() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_5']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_8']")).click();
	}

	@Then("^Message displayed Your emails or mobile numbers do not match\\. Please try again\\.$")
	public void message_displayed_Your_emails_or_mobile_numbers_do_not_match_Please_try_again() throws Throwable {
		String actualText = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij'][contains(text(),'numbers do not match')]")).getText();
		System.out.println(actualText);
	}

	@Then("^Vrify the error message showed up as it should be\\.$")
	public void vrify_the_error_message_showed_up_as_it_should_be() throws Throwable {
		String actualText = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij'][contains(text(),'numbers do not match')]")).getText();
		Assert.assertEquals("Your emails or mobile numbers do not match. Please try again.", actualText);
		Thread.sleep(1000);	
		System.out.println("Test Passed");
	}

	@Then("^Browser will close\\.$")
	public void browser_will_close() throws Throwable {
		driver.quit();
	}


}
