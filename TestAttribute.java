package week5.day1;

import org.testng.annotations.Test;

public class TestAttribute 
{
	@Test(description = "TestCase1")
	public void testCase1()
	{
		System.out.println("TestCase1");
	}
	
	@Test(alwaysRun=true)
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	@Test(dependsOnGroups = "TestCase")
	public void testCase3()
	{
		System.out.println("testCase3");
	}

	@Test(dependsOnMethods = "testCase2")
	public void testCase4()
	{
		System.out.println("testCase4");
	}
	@Test(enabled = true)
	public void testCase5()
	{
		System.out.println("testCase5");
	}
	@Test(enabled = false)
	public void testCase6()
	{
		System.out.println("testCase6");
	}
	@Test(invocationCount=3)
	public void testCase7()
	{
		System.out.println("TestCase7");
	}
	@Test(timeOut = 500)  
	public void testCase8() throws InterruptedException 
	{ 
	   Thread.sleep(300); 
	   System.out.println("testCase8"); 
	} 
	@Test(priority =2)  
	public void testCase9() 
	{ 
	   
	   System.out.println("testCase9"); 
	} 
	@Test(priority =1)  
	public void testCase10() 
	{ 
	   
	   System.out.println("testCase10"); 
	} 
	@Test(dependsOnGroups = "TestCase")  
	public void testCase11() 
	{ 
	   
	   System.out.println("testCase11"); 
	} 
	@Test(dependsOnGroups = "Fail_TestCase")  
	public void testCase12() 
	{ 
	   
	   System.out.println("testCase12"); 
	} 
	@Test(dependsOnGroups = "Fail_TestCase")  
	public void testCase13() 
	{ 
	   
	   System.out.println("testCase13"); 
	} 

}
