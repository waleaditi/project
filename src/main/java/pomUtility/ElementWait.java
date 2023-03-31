package pomUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWait
{

	
	public static void waitForElement(String element,int timeout,WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
