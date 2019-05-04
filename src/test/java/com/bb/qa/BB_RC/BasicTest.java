package com.bb.qa.BB_RC;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class BasicTest {
	@BeforeMethod
	public abstract void setUp() throws MalformedURLException;

	@Test
	public abstract void test() throws InterruptedException;
	
	@AfterMethod
	public abstract void tearDown();

}
