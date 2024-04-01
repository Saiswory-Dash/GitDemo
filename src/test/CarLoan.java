package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CarLoan {
	@Test
	public void WeblogInCarLoan() {
		System.out.println("WeblogInCarLoan");
	}
	@BeforeMethod
	public void BeforeMethodWeblogInCarLoan() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void AfterMethodWeblogInCarLoan() {
		System.out.println("AfterMethod");
	}
	@Test
	public void MobilelogInCarLoan() {
		System.out.println("MobilelogInCarLoan");
	}
	@Test
	public void LogInApiCarLoan() {
		System.out.println("LogInApiCarLoan");
	}
	@Test(groups="Smoke")
	public void SmokeLogInApiCarLoan() {
		System.out.println("SmokeLogInApiCarLoan");
	}


}
