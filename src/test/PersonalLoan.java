package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PersonalLoan {
	@Test
	public void PLoan() {
		System.out.println("PersonalLoan");
	}
	@AfterTest
	public void PLoanAfter() {
		System.out.println("AfterTestPersonalLoan");
	}
	@BeforeSuite
	public void PLoanBeforeSuite() {
		System.out.println("BeforeSuite---PersonalLoan");
	}
	
	@Test(groups="Smoke")
	public void SmokePLoan() {
		System.out.println("SmokePersonalLoan");
	}
}
