package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterising {

	@Test
	public void methodeone() {
		Assert.assertTrue(false);
		System.out.println("methodeone" );
	}

	@Parameters({ "URL" })
	@Test
	public void methodeTwo(String url) {
		System.out.println("methodeTwo"+ url);
	}

	@Test(dataProvider="getData")
	public void methodeThree(String Username,String Password) {
		System.out.println("methodeThree"+Username+Password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combiantion - username password - good credit history= row
		//2nd - username password  - no crdit history
		// 3rd - fraudelent credit history
		Object[][] data= new Object[3][2];
		//1st set 
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//couloumns in the row are nothing but values for that particualar combination(row)
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]= "secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
	}
}
