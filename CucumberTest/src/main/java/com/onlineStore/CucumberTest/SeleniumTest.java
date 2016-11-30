package com.onlineStore.CucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 
public class SeleniumTest {
	
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aurph\\Desktop\\Workspace\\selenium-java-3.0.0-beta4\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		String Actualtext;

		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_6']")).sendKeys("9292787238");
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_9']")).sendKeys("123456785");
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_6']")).click();
		driver.findElement(By.xpath("//input[@type='text' and @id='u_0_9']")).click();
		String actualText = driver.findElement(By.xpath("//div[@class='_5633 _5634 _53ij'][contains(text(),'numbers do not match')]")).getText();
		System.out.println(actualText);
		Assert.assertEquals("Your emails or mobile numbers do not match. Please try again.", actualText);
		Thread.sleep(1000);	
		System.out.println("Test Passed");
		driver.quit();

 
	}
 
}

