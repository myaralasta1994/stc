package com.example;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;

public class BookVelTest {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		// set path of Chromedriver executable
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");

		// initialize new WebDriver session
		driver = new ChromeDriver();
	}

	@Test
	public void KSAcheck() {
		// navigate to the web site
		SoftAssert softAssert = new SoftAssert();
		driver.get("https://subscribe.stctv.com/sa-en");
		// Lite check
		softAssert.assertEquals(driver.findElement(By.id("name-lite")).getText(), "LITE");
		softAssert.assertTrue(driver.findElement(By.id("currency-lite")).getText().contains("SAR"));
		softAssert.assertTrue(driver.findElement(By.id("currency-lite")).getText().contains("15"));
		// classic check
		softAssert.assertEquals(driver.findElement(By.id("name-classic")).getText(), "CLASSIC");
		softAssert.assertTrue(driver.findElement(By.id("currency-classic")).getText().contains("SAR"));
		softAssert.assertTrue(driver.findElement(By.id("currency-classic")).getText().contains("25"));
		// premium check
		softAssert.assertEquals(driver.findElement(By.id("name-premium")).getText(), "PREMIUM");
		softAssert.assertTrue(driver.findElement(By.id("currency-premium")).getText().contains("SAR"));
		softAssert.assertTrue(driver.findElement(By.id("currency-premium")).getText().contains("60"));
		softAssert.assertAll();

	}

	@Test
	public void KWcheck() {
		// navigate to the web site
		SoftAssert softAssert = new SoftAssert();
		driver.get("https://subscribe.stctv.com/kw-en");
		// Lite check
		softAssert.assertEquals(driver.findElement(By.id("name-lite")).getText(), "LITE");
		softAssert.assertTrue(driver.findElement(By.id("currency-lite")).getText().contains("KWD"));
		softAssert.assertTrue(driver.findElement(By.id("currency-lite")).getText().contains("1.2"));
		// classic check
		softAssert.assertEquals(driver.findElement(By.id("name-classic")).getText(), "CLASSIC");
		softAssert.assertTrue(driver.findElement(By.id("currency-classic")).getText().contains("KWD"));
		softAssert.assertTrue(driver.findElement(By.id("currency-classic")).getText().contains("2.5"));
		// premium check
		softAssert.assertEquals(driver.findElement(By.id("name-premium")).getText(), "PREMIUM");
		softAssert.assertTrue(driver.findElement(By.id("currency-premium")).getText().contains("KWD"));
		softAssert.assertTrue(driver.findElement(By.id("currency-premium")).getText().contains("4.8"));

		softAssert.assertAll();

	}

	@Test
	public void BHcheck() {
		// navigate to the web site
		SoftAssert softAssert = new SoftAssert();
		driver.get("https://subscribe.stctv.com/bh-en");
		// Lite check
		softAssert.assertEquals(driver.findElement(By.id("name-lite")).getText(), "LITE");
		softAssert.assertTrue(driver.findElement(By.id("currency-lite")).getText().contains("BHD"));
		softAssert.assertTrue(driver.findElement(By.id("currency-lite")).getText().contains("2"));
		// classic check
		softAssert.assertEquals(driver.findElement(By.id("name-classic")).getText(), "CLASSIC");
		softAssert.assertTrue(driver.findElement(By.id("currency-classic")).getText().contains("BHD"));
		softAssert.assertTrue(driver.findElement(By.id("currency-classic")).getText().contains("3"));
		// premium check
		softAssert.assertEquals(driver.findElement(By.id("name-premium")).getText(), "PREMIUM");
		softAssert.assertTrue(driver.findElement(By.id("currency-premium")).getText().contains("BHD"));
		softAssert.assertTrue(driver.findElement(By.id("currency-premium")).getText().contains("6"));
		
		softAssert.assertAll();
	}



	@AfterMethod
	public void afterMethod() {

		// close and quit the browser
		// driver.quit();
		driver.close();
	}

}