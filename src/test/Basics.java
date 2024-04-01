package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {

	@Test
	public void DemoPersonalLon() {
		System.out.println("DemoPersonalLon");
	}
	@BeforeTest
	public void PersonalLon() {
		System.out.println("BeforeTestPersonalLonBasic");
	}
	@AfterSuite
	public void AfterSuitePersonalLon() {
		System.out.println("AfterSuitePersonalLonBasic");
	}

}
