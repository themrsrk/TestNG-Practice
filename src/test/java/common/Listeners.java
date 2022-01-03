package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	
	public void OnTestStart(ITestResult result) {
		System.out.println("This is on Start Listener");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("This is on Start Listener");
	}
	public void OnTestSuccess(ITestResult result) {
		System.out.println("This is on Success Listener");
	}
	public void OnTestSkipped(ITestResult result) {
		
	}
	public void OnTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
}
