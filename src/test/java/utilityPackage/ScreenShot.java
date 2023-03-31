package utilityPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot
{
	public static String captureScreenShot(WebDriver driver) throws IOException 
	{  
		
		
		String path="test-output\\ScreenShot\\test.png";
	    
	  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File destination=new File(path);
      FileHandler.copy(source, destination);
	    return path;
	}
}
