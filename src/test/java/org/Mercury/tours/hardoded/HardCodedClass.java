package org.Mercury.tours.hardoded;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardCodedClass {
	WebDriver driver;
	@Test
	public void userRegistration() throws InterruptedException {
		Thread.sleep(1000);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); //Initiating Chrome driver
		driver.manage().window().maximize(); // Maximize the window
		driver.manage().deleteAllCookies(); // Delete Cookies from the browser
		driver.get("https://demo.guru99.com/test/newtours/"); // open the URL
		Thread.sleep(1000);
		// System.out.println( "Validate that the page title is :"+driver.getTitle());
		// Assert.assertEquals(driver.getTitle(), "Welcome: Mercury Tours");
		
		WebElement homeTab = driver.findElement(By.linkText("Home"));
		System.out.println("Validate that the home tab is:"+homeTab.getText());
		Assert.assertTrue(homeTab.isDisplayed(),"Unable to find the homepage");
	}
}
