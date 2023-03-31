package testPackage;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pomPackage.Loginpage;
import utilityPackage.FetchData;



public class LoginTestClass extends BaseClass
{	
    Loginpage login;
    SoftAssert s;
    @BeforeClass
    public void beforeclass()
    {
    	  System.out.println("beforeclass");
    }
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method1");
	     s=new SoftAssert();
	     login=new Loginpage(driver);
	
	 
	}
	@Test
	public void login() throws EncryptedDocumentException, IOException, InterruptedException 
	{    
		logger=report.createTest("verify login functionality with correct input");
		
		login.inputinsideusername(FetchData.fetchDataFromExcel(1, 0));
		
		login.inputinsidepassword(FetchData.fetchDataFromExcel(1, 1));
		  
        
       
        // SoftAssert s=new SoftAssert();
        // s.assertEquals(currentUrl, expectedurl);
        // Assert.assertEquals(currentUrl, expectedurl);
      
        // s.assertAll();
         
     
         
         login.clicklogin();
       
         driver.navigate().back();
      
         
  	    
	}
	@Test
	public void test2() throws  InterruptedException
	{   
		logger=report.createTest("verify login functionality with incorrect input");
		
		
		
        
        boolean b=login.display();
        s.assertFalse(b);
		Thread.sleep(4000);
		s.assertAll();
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("after class of method1");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
