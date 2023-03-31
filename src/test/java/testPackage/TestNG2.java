package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2
{
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test of class2");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class of class2");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method of class2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 of class2");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 of class2");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class of class2");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test of class2");
	}
	
	
	
	
	
	
	
	

}
