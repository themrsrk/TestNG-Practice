package ui;

import org.testng.annotations.Test;

import common.CommonData;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Practice extends CommonData{
	
	
	@BeforeTest  
	public void BeforeEveryTestSuit() { //this beforetest annotation is run before every test suit or before all test
		System.out.println("Login into an Application");
	}
	
	@AfterTest  
	public void AfterEveryTest() { //this aftertest annotation is run after every test suit or after all test
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void BeforeMethod() { //this will run before every method means before every test
		System.out.println("Connected to Database! ");
	}
	
	@AfterMethod
	public void AfterMethod() { //this will run after every method means after every test
		System.out.println("Disconnected to Database! ");
	}
	
	
	@Test (priority = 1, description = "This is about Login Test") //we give priorities so that test case can execute first, otherwise TestNG will execute test case in alphabetic order
	public void LoginTest() {
		// TODO Auto-generated method stub
			System.out.println("Login Test successful! ");
	}
	
	@Test (priority = 2, description = "This is about Logout Test")
	public void LogoutTest() {
		System.out.println("Logout Test successful! ");

	}
	

}
