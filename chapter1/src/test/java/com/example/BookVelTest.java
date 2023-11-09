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

//	@Test
//	public void bookAppointment() {
//		// navigate to the web site
//		driver.get("http://ref-bookvel.herokuapp.com/experts");
//		// Validate page title
//		// Assert.assertEquals(driver.getTitle(), "BookVel");
//		driver.findElement(By.xpath("//a[@href=\"/book/1\"]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		// WebDriverWait wait = new WebDriverWait(driver,30);
//		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Please
//		// fill the fields below.')]")));
//		Select drpExpert = new Select(driver.findElement(By.xpath("//select[@id = 'experts']")));
//		drpExpert.selectByIndex(1);
//		// driver.findElement(By.id("username")).sendKeys("Myar Alasta");
//		driver.findElement(By.cssSelector(
//				"input[class='w-full block appearance-none w-full bg-white border border-gray-400 hover:border-gray-500 px-4 py-2 rounded shadow leading-tight focus:outline-none focus:shadow-outline']"))
//				.sendKeys("Myar Alasta");
//		driver.findElements(By.id("datdsve")).size();
//		driver.findElement(By.id("date")).sendKeys("02022021");
//		Select drpDuration = new Select(driver.findElement(By.xpath("//select[@id = 'duration']")));
//		drpDuration.selectByIndex(1);
//		Select drpHours = new Select(driver.findElement(By.xpath("//select[@id = 'available_hours']")));
//		drpHours.selectByIndex(1);
//		driver.findElement(By.xpath("//button[@type='button']")).click();
//
//	}
//
//	@Test
//	public void elementsExisting() {
//		// navigate to the web site
//		driver.get("http://ref-bookvel.herokuapp.com/experts");
//		int x = driver
//				.findElements(
//						By.cssSelector("h1[class='sm:text-3xl text-2xl font-medium title-font text-gray-900 mb-4']"))
//				.size();
//		System.out.println(x);
//
//	}
//
//	@Test
//	public void checkExpertPageButtons() {
//		driver.get("http://ref-bookvel.herokuapp.com/experts");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[@href=\"/experts/1\"]")).click();
//		driver.findElement(By.xpath("//a[@href=\"/experts\"]")).click();
//		driver.findElement(By.xpath("//a[@href=\"/experts/2\"]")).click();
//		driver.findElement(By.xpath("//a[@href=\"/experts\"]")).click();
//		driver.findElement(By.xpath("//a[@href=\"/experts/3\"]")).click();
//
//	}
//
//	@Test
//	public void checkExpertsIfExists() {
//		driver.get("http://ref-bookvel.herokuapp.com/experts");
//		List<WebElement> expertList = driver.findElements(By.tagName("h2"));
//		for (WebElement webElement : expertList) {
//			if (webElement.getText().contains("William Jordan") || webElement.getText().contains("Quasi Shawa")
//					|| webElement.getText().contains("Shimaa Badawy")) {
//				System.out.println(webElement.getText() + " is exist");
//
//			}
//		}
//
//	}

	@AfterMethod
	public void afterMethod() {

		// close and quit the browser
		// driver.quit();
		driver.close();
	}

}