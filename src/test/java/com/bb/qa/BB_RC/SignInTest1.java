package com.bb.qa.BB_RC;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest1 extends BasicTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.LINUX);
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				capability);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Test Case 1 Ended ...");

	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("Test Case 1 Started ...");
		driver.get("http://test-app.com");
		Thread.sleep(15000);
	}

}
