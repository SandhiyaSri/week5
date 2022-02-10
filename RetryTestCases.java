package week5.day1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class RetryTestCases implements IRetryAnalyzer {
	int count=0;
	public boolean retry(ITestResult result) {
		if(count<2)
		{
			count++;
			return true;
		}
		return false;
	}

	
		  

}


