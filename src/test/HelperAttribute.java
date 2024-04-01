package test;
import org.testng.annotations.Test;

public class HelperAttribute {
	@Test
	public void WeblogInCarLoan() {
		System.out.println("WeblogInCarLoan");
	}

	@Test
	public void MobilelogInCarLoan() {
		System.out.println("MobilelogInCarLoan");
	}
	@Test(dependsOnMethods= {"WeblogInCarLoan","MobilelogInCarLoan"})
	public void LogInApiCarLoan() {
		System.out.println("LogInApiCarLoan");
	}
	@Test(enabled=false)
	public void LogOutApiCarLoan() {
		System.out.println("LogInApiCarLoan");
	}
	@Test(timeOut=4000)
	public void ApiCarLoan() {
		System.out.println("ApiCarLoan");
	}
	
}
