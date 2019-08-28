package com.testcases;

import org.testng.IInvokedMethod;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listners.Listners;

@Listeners(value = Listners.class)
public class Tc_01 {

	/*@Test
	//public void doTestExe() {
		

	}*/
	
	@Test
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("in afterInvocation");
		
		
	}
	@Test
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		System.out.println("in beforeInvocation");
	
	

}
	@Test
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onFinish");
		
	}
	
	@Test
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onStart");
	}

	@Test
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestFailedButWithinSuccessPercentage");
		
	}

	@Test
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestFailure");
	}

	@Test
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestSkipped");
	}

	@Test
	public void onTestStart(ITestResult obj) {
		System.out.println("in onTestStart");
		//System.out.println(obj.getTestName());
	}

	@Test
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("in onTestSuccess");
		
	}

	
}

