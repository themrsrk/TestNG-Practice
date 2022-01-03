package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonData {
	
	@BeforeSuite
	public void DataSetup() {
		
		System.out.println("Data Setup");
	}
	
	
	@AfterSuite
	public void DataCleanup() {
		
		System.out.println("Data Cleanup");
	}

}
