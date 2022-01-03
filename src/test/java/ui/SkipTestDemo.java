package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

import common.CommonData;

public class SkipTestDemo extends CommonData{
	
	@Test (enabled=false)
	public void SkipTest1() {
		System.out.println("This is the first way of skipping th test");
	}
	
	@Test
	public void SkipTest12() {
		System.out.println("This is the second way of skipping th test");
		throw new SkipException("Skip Due to some reaons");
	}

}
