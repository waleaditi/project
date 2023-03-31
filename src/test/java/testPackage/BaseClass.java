package testPackage;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utilityPackage.ScreenShot;
import utilityPackage.StaticBrowser;

public class BaseClass 
{    public static ExtentReports report;
     public static ExtentHtmlReporter extent;
     public static ExtentTest logger;
    static WebDriver driver; 
    @Parameters("browserName")
    @BeforeTest
	public void beforeTest(String browserName)
	{
	WebDriver driver=StaticBrowser.openBrowser(browserName,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	this.driver=driver;
	extent=new ExtentHtmlReporter("test-output"+File.separator+"report"+File.separator+"test.html");
    report=new ExtentReports();
    report.attachReporter(extent);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
    @AfterMethod
    public void screenShot(ITestResult result) throws IOException
    {
       if(result.getStatus()==ITestResult.FAILURE)
       {
    	   String path=ScreenShot.captureScreenShot(driver);
    	   logger.fail("Test case is failed",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
       }
       report.flush();
    }
	@AfterTest
	public void afterTest()
	{
	driver.quit();
	}
	
	
	
	
	
	
}
