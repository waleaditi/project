package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 
{
	
  @BeforeTest
  public void beforetestmethod() 
  {
	  System.out.println("before test method");
 }
	
	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("before class method of class1");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method of class1");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1 of class1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 of class1");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class of class1");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test of class1");
	}
	
	
	

}
