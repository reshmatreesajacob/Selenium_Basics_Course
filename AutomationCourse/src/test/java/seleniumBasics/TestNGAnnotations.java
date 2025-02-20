package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	@Test
	public void testCase1()
	{
		System.out.println("This is a testcase");
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		//execute before @Test -- for browser launch
		System.out.println("This is Before Method");
	}

	@AfterMethod
	public void afterMethod()
	{
		//excecute after @test -- close & quit
		System.out.println("This is After Method");
	}
	
	@BeforeClass
	public void beforeClass() 
	{
		//executed before 1st @Test method or before method
		System.out.println("This is Before Class Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		//Excecute after all test case & after method in a class
		System.out.println("This is After Class Method");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		//execute before all test case and execute mulpile times
		System.out.println("This is Before Test Method");
	}
	
	@AfterTest
	public void afterTest() 
	{
		//execute after all test case and execute mulpile times
		System.out.println("This is After Test Method");
	}

	@BeforeSuite
	public void beforeSuite() 
	{
		//execute @ the starting of each suite
		System.out.println("This is Before Suite Method");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		//execute @ the end of each suite
		System.out.println("This is After Suite Method");
	}
}
