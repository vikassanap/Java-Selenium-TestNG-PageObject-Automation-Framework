# Java Selenium TestNG Selenium Grid Parallel UI Test Execution
 - This project demonstrates how to execute application UI test cases in parallel on Selenium grid

## Selenium Grid
 - Configuration related information can be found here: http://code.google.com/p/selenium/wiki/Grid2
 - Refer `grid_configuration` directory for `hub` and `node` related configuration files

## Parallel Execution
- I have added below `setUp` method to create `browser` instance using `Selenium Grid`:
```
@BeforeMethod
public void setUp() throws MalformedURLException {
  DesiredCapabilities capability = DesiredCapabilities.firefox();
  capability.setBrowserName("firefox");
  capability.setPlatform(Platform.LINUX);
  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
      capability);

}
```
- In `testng.xml`, see `suite` configuration:
```
<suite name="Parallel test runs" parallel="tests" thread-count="3">
	<test name="SignInTest">
		<classes>
			<class name="com.bb.qa.BB_RC.SignInTest"></class>
		</classes>
	</test>
	<test name="SignInTest1">
		<classes>
			<class name="com.bb.qa.BB_RC.SignInTest1"></class>
		</classes>
	</test>
	<test name="SignInTest2">
		<classes>
			<class name="com.bb.qa.BB_RC.SignInTest2"></class>
		</classes>
	</test>
	<test name="SignInTest3">
		<classes>
			<class name="com.bb.qa.BB_RC.SignInTest3"></class>
		</classes>
	</test>
</suite>
```
## Get Started
1. Clone this repo
2. Execute test cases: `mvn test`

## Author
[Vikas Sanap](https://www.linkedin.com/in/vikassanap/)
