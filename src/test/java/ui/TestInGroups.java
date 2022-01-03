 package ui;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import common.CommonData;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



	@Test(groups="User-Registration Tests")
	public class TestInGroups extends CommonData{ //We can Categorized a whole class or whole Test Suit in a certain category
	
	
	@Test (groups="regression") //We can execute test by putting them in groups and can execute particular group of test by go in the option of Run Configuration
	public void Test1() {
		
		System.out.println("This test is fall in the category of Regression testing");
		
	}
	
	@Test (groups="regression")
	public void Test2() {
		
		System.out.println("This test is fall in the category of Regression testing");
		
	}
	
	@Test (groups={"BVT","regression"})
	public void Test3() {
		
		System.out.println("This test is fall in the category of Regression as well as BVT testing");
		
	}
	
	@Test  (groups="BVT")
	public void Test4() {
		
		System.out.println("This test is fall in the category of BVT testing");
		
	}


}
	
